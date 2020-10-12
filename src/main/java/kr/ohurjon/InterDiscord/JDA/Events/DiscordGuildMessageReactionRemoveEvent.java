package kr.ohurjon.InterDiscord.JDA.Events;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageReaction;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.guild.react.GuildMessageReactionAddEvent;
import net.dv8tion.jda.api.events.message.guild.react.GuildMessageReactionRemoveEvent;

public class DiscordGuildMessageReactionRemoveEvent extends DiscordDefaultEvent {

    private final GuildMessageReactionRemoveEvent event;

    public DiscordGuildMessageReactionRemoveEvent(GuildMessageReactionRemoveEvent event){
        this.event = event;
        this.Jda = event.getJDA();
    }

    public Message getMessage() {
        return event.getChannel().retrieveMessageById(event.getMessageId()).complete();
    }

    public User getAuthor() {
        return event.getUser();
    }

    public Member getMember() {
        return event.getMember();
    }
}
