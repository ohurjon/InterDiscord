package kr.ohurjon.InterDiscord.JDA.Events;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import org.bukkit.Bukkit;


public class DiscordMessageReceivedEvent extends DiscordDefaultEvent {

    private final Message message;

    public DiscordMessageReceivedEvent(MessageReceivedEvent event){
        super(true);
        this.message = event.getMessage();
        this.Jda = event.getJDA();
    }

    public Message getMessage() {
        return this.message;
    }

    public User getAuthor() {
        return this.message.getAuthor();
    }

}
