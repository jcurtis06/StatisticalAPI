/*
 * Statistic.java
 * Created in a corn field by Jonathan Curtis on 11/28/2023
 *
 * Find me @ https://jcurtis.io or https://github.com/jcurtis06
 */

package io.jcurtis.statisticalapi.statistic;

public class Statistic {
    private String name;
    private String id;
    private int value;
    private boolean requirePermission;

    public Statistic(String name, String id, int value, boolean requirePermission) {
        this.name = name;
        this.id = id;
        this.value = value;
        this.requirePermission = requirePermission;
    }

    public Statistic(String name, String id, int value) {
        this(name, id, value, false);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getValue() {
        return value;
    }

    public boolean doesRequirePermission() {
        return requirePermission;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void addValue(int value) {
        this.value += value;
    }

    public void subtractValue(int value) {
        this.value -= value;
    }

    public void multiplyValue(int value) {
        this.value *= value;
    }

    public void divideValue(int value) {
        this.value /= value;
    }

    public void moduloValue(int value) {
        this.value %= value;
    }

    public void incrementValue() {
        this.value++;
    }

    public void decrementValue() {
        this.value--;
    }
}
