package kr.ohurjon.Discord.Events;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.priv.PrivateMessageReceivedEvent;


public class DiscordPrivateMessageReceivedEvent extends DiscordDefaultEvent {

    private final Message message;

    public DiscordPrivateMessageReceivedEvent(PrivateMessageReceivedEvent event){

        this.message = event.getMessage();

    }

    public Message getMessage() {
        return this.message;
    }

    public User getAuthor() {
        return this.message.getAuthor();
    }

}