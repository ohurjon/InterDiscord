package kr.ohurjon.InterDiscord.JDA;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;

public class JDAThread extends Thread {

    JDABuilder JDABuilder;

    private JDA JDA;

    public JDAThread(String Token){
        JDABuilder = net.dv8tion.jda.api.JDABuilder.create(
                GatewayIntent.DIRECT_MESSAGE_REACTIONS,
                GatewayIntent.DIRECT_MESSAGES,
                GatewayIntent.GUILD_EMOJIS,
                GatewayIntent.GUILD_MEMBERS,
                GatewayIntent.GUILD_MESSAGES,
                GatewayIntent.GUILD_BANS,
                GatewayIntent.GUILD_VOICE_STATES
        );
        JDABuilder.setToken(Token);
        this.start();
        JDAThreadManager.addThreads(this);
    }

    public JDAThread(JDABuilder JDABuilder){
        this.JDABuilder = JDABuilder;
        this.start();
        JDAThreadManager.addThreads(this);
    }

    public JDA getJDA() {
        return JDA;
    }

    void setJDA(JDA jda) {
        this.JDA = jda;
    }

    @Override
    public void start() {
        try {
            JDA = JDABuilder.build();
            JDA.addEventListener(new JDAThreadListener());
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void interrupt() {
        this.JDA.shutdown();
    }
}
