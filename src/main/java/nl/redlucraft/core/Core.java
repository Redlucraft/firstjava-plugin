package nl.redlucraft.core;

import nl.redlucraft.core.commands.FeedCommand;
import nl.redlucraft.core.commands.GodCommand;
import nl.redlucraft.core.events.SheepEvent;
import nl.redlucraft.core.events.XpEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Core extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("Plugin Started");

        getServer().getPluginManager().registerEvents(new XpEvent(),  this);
        getServer().getPluginManager().registerEvents(new SheepEvent(), this);
        getCommand("god").setExecutor(new GodCommand());
        getCommand("food").setExecutor(new FeedCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println("Plugin Dissabled");
    }
}
