package com.rachelplante.periodicpocket;

/**
 * Created by Rachel on 3/7/2018.
 */

public enum State {
    SOLID, LIQUID, GAS, UNKNOWN;

    @Override
    public String toString() {
        String state;
        switch(this) {
            case SOLID: state = "Solid"; break;
            case LIQUID: state = "Liquid"; break;
            case GAS: state = "Gas"; break;
            case UNKNOWN: state = "Unknown"; break;
            default: state = "VALUE NOT RECOGNIZED";
        }

        return state;
    }
}
