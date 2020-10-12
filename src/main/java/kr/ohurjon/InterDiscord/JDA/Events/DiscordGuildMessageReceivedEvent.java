package kr.ohurjon.InterDiscord.JDA.Events;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;


public class DiscordGuildMessageReceivedEvent extends DiscordDefaultEvent {

    private final Message message;


    public DiscordGuildMessageReceivedEvent(GuildMessageReceivedEvent event){

        this.message = event.getMessage();

    }

    public Message getMessage() {
        return message;
    }

    public User getAuthor() {
        return this.message.getAuthor();
    }

    public Member getMember() {
        return this.message.getMember();
    }


}
