package kr.ohurjon.Minecraft.Events;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.priv.PrivateMessageReceivedEvent;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;


public class MinecraftPrivateMessageReceivedEvent extends MinecraftDefaultEvent {

    private final Message message;

    public MinecraftPrivateMessageReceivedEvent(PrivateMessageReceivedEvent event){

        this.message = event.getMessage();

    }

    public Message getMessage() {
        return this.message;
    }

    public User getAuthor() {
        return this.message.getAuthor();
    }

}
