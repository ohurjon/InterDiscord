package kr.ohurjon.InterDiscord.JDA.Events;

import net.dv8tion.jda.api.JDA;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class DiscordDefaultEvent extends Event {

    public JDA Jda;

    private static final HandlerList handlers = new HandlerList();

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public JDA getJda() {
        return Jda;
    }
}
