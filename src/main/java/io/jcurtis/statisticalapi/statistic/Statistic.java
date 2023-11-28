/*
 * Statistic.java
 * Created in a corn field by Jonathan Curtis on 11/27/2023
 *
 * Find me @ https://jcurtis.io or https://github.com/jcurtis06
 */

package io.jcurtis.statisticalapi.statistic;

public class Statistic {
    private String id;
    private String name;
    private String ownerPlugin;
    private Object value;
    private StatisticType type;

    public Statistic(String id, String name, String ownerPlugin, Object value, StatisticType type) {
        this.id = id;
        this.name = name;
        this.ownerPlugin = ownerPlugin;
        this.value = value;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOwnerPlugin() {
        return ownerPlugin;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        switch (this.type) {
            case INTEGER:
                this.value = Integer.valueOf(value.toString());
                break;
            case DOUBLE:
                this.value = Double.valueOf(value.toString());
                break;
            case STRING:
                this.value = value.toString();
                break;
            case BOOLEAN:
                this.value = Boolean.valueOf(value.toString());
                break;
        }
    }

    public StatisticType getType() {
        return type;
    }
}
