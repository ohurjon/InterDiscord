package kr.ohurjon.InterDiscord.JDA.Events;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.entities.MessageReaction;


import net.dv8tion.jda.api.events.message.guild.react.GuildMessageReactionAddEvent;

public class DiscordGuildMessageReactionAddEvent extends DiscordDefaultEvent {

    private final MessageReaction messagereaction;

    private final GuildMessageReactionAddEvent event;

    public DiscordGuildMessageReactionAddEvent(GuildMessageReactionAddEvent event){
        this.messagereaction = event.getReaction();
        this.Jda = event.getJDA();
        this.event = event;
    }


    public Message getMessage() {
        return event.getChannel().retrieveMessageById(messagereaction.getMessageId()).complete();
    }

    public User getAuthor() {
        return event.getUser();
    }

    public Member getMember() {
        return event.getMember();
    }



}
