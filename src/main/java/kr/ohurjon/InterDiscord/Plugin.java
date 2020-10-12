package kr.ohurjon.InterDiscord;

import kr.ohurjon.InterDiscord.JDA.JDAThread;
import kr.ohurjon.InterDiscord.JDA.JDAThreadManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {

    private static Plugin plugin;

    @Override
    public void onEnable() {
        plugin = this;
        this.getServer().getPlayer("dassd").spigot().respawn();
    }

    @Override
    public void onDisable() {
        for (JDAThread Thread: JDAThreadManager.getThreads()) {
            Thread.getJDA().shutdown();
        }
    }

    public static Plugin getPlugin() {
        return plugin;
    }
}
