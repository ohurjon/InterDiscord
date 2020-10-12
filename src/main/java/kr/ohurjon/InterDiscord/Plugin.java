package kr.ohurjon.InterDiscord;

import kr.ohurjon.InterDiscord.JDA.JDAThread;
import kr.ohurjon.InterDiscord.JDA.JDAThreadManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {

    private static Plugin plugin;

    @Override
    public void onEnable() {
        plugin = this;
    }

    @Override
    public void onDisable() {
        for (JDAThread Thread: JDAThreadManager.getThreads()) {
            Thread.interrupt();
        }
    }

    public static Plugin getPlugin() {
        return plugin;
    }
}
