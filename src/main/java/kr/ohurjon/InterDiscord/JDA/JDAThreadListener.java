package kr.ohurjon.InterDiscord.JDA;

import kr.ohurjon.InterDiscord.JDA.Events.DiscordGuildMessageReactionAddEvent;
import kr.ohurjon.InterDiscord.JDA.Events.DiscordGuildMessageReactionRemoveEvent;
import kr.ohurjon.InterDiscord.JDA.Events.DiscordGuildMessageReceivedEvent;
import kr.ohurjon.InterDiscord.JDA.Events.DiscordPrivateMessageReceivedEvent;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.events.message.guild.react.GuildMessageReactionAddEvent;
import net.dv8tion.jda.api.events.message.guild.react.GuildMessageReactionRemoveEvent;
import net.dv8tion.jda.api.events.message.priv.PrivateMessageReceivedEvent;

import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.bukkit.Bukkit;
import org.jetbrains.annotations.NotNull;


public class JDAThreadListener extends ListenerAdapter {
    @Override
    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent event) {
        Bukkit.getPluginManager().callEvent(new DiscordGuildMessageReceivedEvent(event));
    }

    @Override
    public void onPrivateMessageReceived(@NotNull PrivateMessageReceivedEvent event) {
        Bukkit.getPluginManager().callEvent(new DiscordPrivateMessageReceivedEvent(event));
    }

    @Override
    public void onGuildMessageReactionAdd(@NotNull GuildMessageReactionAddEvent event) {
        Bukkit.getPluginManager().callEvent(new DiscordGuildMessageReactionAddEvent(event));
    }

    @Override
    public void onGuildMessageReactionRemove(@NotNull GuildMessageReactionRemoveEvent event) {
        Bukkit.getPluginManager().callEvent(new DiscordGuildMessageReactionRemoveEvent(event));
    }
}
