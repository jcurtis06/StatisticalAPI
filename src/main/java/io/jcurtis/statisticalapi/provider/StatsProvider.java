/*
 * StatsProvider.java
 * Created in a corn field by Jonathan Curtis on 11/28/2023
 *
 * Find me @ https://jcurtis.io or https://github.com/jcurtis06
 */

package io.jcurtis.statisticalapi.provider;

import org.bukkit.plugin.Plugin;

public class StatsProvider {
    private Plugin plugin;
    private boolean allowOutsideModification;

    public StatsProvider(Plugin plugin, boolean allowOutsideModification) {
        this.plugin = plugin;
        this.allowOutsideModification = allowOutsideModification;
    }

    public Plugin getPlugin() {
        return plugin;
    }

    public boolean doesAllowOutsideModification() {
        return allowOutsideModification;
    }
}
