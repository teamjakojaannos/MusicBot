package com.jagrosh.jmusicbot.commands.general;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import com.jagrosh.jmusicbot.Bot;

public class PoopCommand extends Command {
    public static final String POOP_EMOJI = "\uD83D\uDCA9"; // 💩

    public PoopCommand(final Bot bot) {
        this.name = "shit";
        this.help = "Causes the bot to take a " + POOP_EMOJI;
        this.aliases = bot.getConfig().getAliases(this.name);
    }

    @Override
    protected void execute(CommandEvent event) {
        event.getMessage().addReaction(POOP_EMOJI).submit();
    }
}
