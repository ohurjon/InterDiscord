package kr.ohurjon.InterDiscord.JDA;

import kr.ohurjon.InterDiscord.JDA.Events.DiscordMessageReceivedEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.bukkit.Bukkit;
import org.jetbrains.annotations.NotNull;


public class JDAThreadListener extends ListenerAdapter {
    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        Bukkit.getPluginManager().callEvent(new DiscordMessageReceivedEvent(event));
//        Bukkit.broadcastMessage(event.getMessage().toString());
    }
}
