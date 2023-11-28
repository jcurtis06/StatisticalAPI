package io.jcurtis.statisticalapi;

import io.jcurtis.statisticalapi.statistic.StatisticsManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class StatisticalAPI extends JavaPlugin {
    private static StatisticalAPI instance;
    private StatisticsManager statsManager;

    @Override
    public void onEnable() {
        instance = this;
        statsManager = new StatisticsManager();
        getLogger().info("StatisticalAPI has been enabled!");
    }

    public static StatisticalAPI getInstance() {
        return instance;
    }

    public StatisticsManager getStatsManager() {
        return statsManager;
    }

    @Override
    public void onDisable() {
        getLogger().info("StatisticalAPI has been disabled!");
    }
}
