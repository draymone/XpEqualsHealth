package fr.draymone.xpequalshealth;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Xp = Health V1.0.0 enabled");
        getServer().getPluginManager().registerEvents(new PluginListener(), this);
    }

    @Override
    public void onDisable() {
        System.out.println("Xp = Health V1.0.0 disabled");
    }
}
