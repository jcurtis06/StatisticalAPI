/*
 * StatsManager.java
 * Created in a corn field by Jonathan Curtis on 11/28/2023
 *
 * Find me @ https://jcurtis.io or https://github.com/jcurtis06
 */

package io.jcurtis.statisticalapi.statistic;

import io.jcurtis.statisticalapi.provider.StatsProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatsManager {
    private Map<StatsProvider, List<Statistic>> stats;

    public StatsManager() {
        stats = new HashMap<>();
    }

    public void registerStatistic(Statistic statistic, StatsProvider provider) {
        if (stats.containsKey(provider)) {
            stats.get(provider).add(statistic);
        } else {
            List<Statistic> newList = new ArrayList<>();
            newList.add(statistic);
            stats.put(provider, newList);
        }
    }

    public Statistic getPlayerStatistic(String id, StatsProvider provider, String playerUUID) {
        List<Statistic> providerStats = stats.get(provider);
        if (providerStats != null) {
            for (Statistic stat : providerStats) {
                if (stat.getId().equals(id) && stat instanceof PlayerStatistic) {
                    PlayerStatistic playerStat = (PlayerStatistic) stat;
                    if (playerStat.getPlayerUUID().toString().equals(playerUUID)) {
                        return stat;
                    }
                }
            }
        }
        return null;
    }

    public Statistic getStatistic(String id, StatsProvider provider) {
        List<Statistic> providerStats = stats.get(provider);
        if (providerStats != null) {
            for (Statistic stat : providerStats) {
                if (stat.getId().equals(id)) {
                    return stat;
                }
            }
        }
        return null;
    }

    public List<Statistic> getStatistics(StatsProvider provider) {
        return stats.get(provider);
    }
}
