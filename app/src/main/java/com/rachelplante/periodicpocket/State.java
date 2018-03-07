package com.rachelplante.periodicpocket;

/**
 * Created by Rachel on 3/7/2018.
 */

public enum State {
    SOLID (0), LIQUID (1), GAS (2), UNKNOWN (-1);

    private final int state;

    State(int i) {
        this.state = i;
    }
}
