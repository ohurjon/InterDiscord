package kr.ohurjon.Minecraft.Events;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.MessageReaction;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.guild.react.GuildMessageReactionAddEvent;
import net.dv8tion.jda.api.events.message.priv.PrivateMessageReceivedEvent;

import javax.annotation.Nonnull;

public class MinecraftGuildMessageReactionAddEvent extends MinecraftDefaultEvent{

    public MinecraftGuildMessageReactionAddEvent(GuildMessageReactionAddEvent event){

    }

}
