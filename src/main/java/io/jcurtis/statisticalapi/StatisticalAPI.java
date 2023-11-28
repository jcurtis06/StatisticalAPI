package io.jcurtis.statisticalapi;

import io.jcurtis.statisticalapi.provider.StatsProvider;
import io.jcurtis.statisticalapi.statistic.StatsManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public final class StatisticalAPI extends JavaPlugin {
    private ArrayList<StatsProvider> providers = new ArrayList<>();

    private static StatisticalAPI instance;
    private static StatsManager statsManager;

    public static StatisticalAPI getInstance() {
        return instance;
    }

    public StatsManager getStatsManager() {
        return statsManager;
    }

    public void registerStatsProvider(StatsProvider provider) {
        providers.add(provider);
    }

    @Override
    public void onEnable() {
        getLogger().info("StatisticalAPI has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("StatisticalAPI has been disabled!");
    }
}
