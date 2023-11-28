/*
 * StatisticsManager.java
 * Created in a corn field by Jonathan Curtis on 11/27/2023
 *
 * Find me @ https://jcurtis.io or https://github.com/jcurtis06
 */

package io.jcurtis.statisticalapi.statistic;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class StatisticsManager {
    private Map<UUID, Map<String, PlayerStatistic>> playerStatistics;

    public StatisticsManager() {
        this.playerStatistics = new HashMap<>();
    }

    public void updatePlayerStatistic(UUID playerUUID, String statName, Object newValue) {
        Map<String, PlayerStatistic> stats = playerStatistics.computeIfAbsent(playerUUID, k -> new HashMap<>());

        if (stats.containsKey(statName)) {
            PlayerStatistic stat = stats.get(statName);
            stat.setValue(newValue);
        }

        saveStatistics(playerUUID, stats);
    }

    public void incrementPlayerStatistic(UUID playerUUID, String statName, Object increment) {
        Map<String, PlayerStatistic> stats = playerStatistics.computeIfAbsent(playerUUID, k -> new HashMap<>());

        stats.compute(statName, (key, stat) -> {
            if (stat == null) {
                return null;
            }

            if (stat.getType() == StatisticType.INTEGER) {
                stat.setValue((Integer) stat.getValue() + (Integer) increment);
            } else if (stat.getType() == StatisticType.DOUBLE) {
                stat.setValue((Double) stat.getValue() + (Double) increment);
            }
            return stat;
        });
    }

    public PlayerStatistic getPlayerStatistic(UUID playerUUID, String statName) {
        Map<String, PlayerStatistic> stats = playerStatistics.computeIfAbsent(playerUUID, k -> new HashMap<>());
        return stats.get(statName);
    }

    public Map<String, PlayerStatistic> getPlayerStatistics(UUID playerUUID) {
        return playerStatistics.computeIfAbsent(playerUUID, k -> new HashMap<>());
    }

    public void saveStatistics(UUID playerUUID, Map<String, PlayerStatistic> stats) {

    }
}
