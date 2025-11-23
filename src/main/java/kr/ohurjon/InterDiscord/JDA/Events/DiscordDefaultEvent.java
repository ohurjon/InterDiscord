package kr.ohurjon.InterDiscord.JDA.Events;

import net.dv8tion.jda.api.JDA;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class DiscordDefaultEvent extends Event {

    public DiscordDefaultEvent(boolean isAsync) {
        super(isAsync);
    }

    public JDA Jda;

    private static final HandlerList handlers = new HandlerList();

    @NotNull
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
