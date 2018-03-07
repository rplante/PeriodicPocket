package com.rachelplante.periodicpocket;

public enum Family {
    ALKALI_METAL (0), ALKALINE_EARTH_METAL (1), LANTHANIDE (2),
    ACTINIDE (3), TRANSITION_METAL (4), POST_TRANSITION_METAL (5),
    METALLOID (6), POLYATOMIC_NONMETAL (7), DIATOMIC_NONMETAL (8),
    NOBLE_GAS (9), UNKNOWN (-1);

    private final int family;

    Family(int i) {
        this.family = i;
    }
}
