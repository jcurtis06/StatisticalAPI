/*
 * PlayerStatistic.java
 * Created in a corn field by Jonathan Curtis on 11/27/2023
 *
 * Find me @ https://jcurtis.io or https://github.com/jcurtis06
 */

package io.jcurtis.statisticalapi.statistic;

import java.util.UUID;

public class PlayerStatistic extends Statistic {
    private UUID playerUUID;

    public PlayerStatistic(
            String id,
            String name,
            String ownerPlugin,
            Object value,
            StatisticType type,
            UUID playerUUID)
    {
        super(id, name, ownerPlugin, value, type);
        this.playerUUID = playerUUID;
    }

    public UUID getPlayerUUID() {
        return playerUUID;
    }
}
