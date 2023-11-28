/*
 * PlayerStatistic.java
 * Created in a corn field by Jonathan Curtis on 11/28/2023
 *
 * Find me @ https://jcurtis.io or https://github.com/jcurtis06
 */

package io.jcurtis.statisticalapi.statistic;

import java.util.UUID;

public class PlayerStatistic extends Statistic {
    private UUID playerUUID;

    public PlayerStatistic(String name, String id, int value, boolean requirePermission, UUID playerUUID) {
        super(name, id, value, requirePermission);
    }

    public PlayerStatistic(String name, String id, int value, UUID playerUUID) {
        super(name, id, value);
    }

    public UUID getPlayerUUID() {
        return playerUUID;
    }
}
