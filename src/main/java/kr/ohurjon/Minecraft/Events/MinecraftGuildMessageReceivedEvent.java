package kr.ohurjon.Minecraft.Events;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;


public class MinecraftGuildMessageReceivedEvent extends MinecraftDefaultEvent {

    private final Message message;


    public MinecraftGuildMessageReceivedEvent(GuildMessageReceivedEvent event){

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
