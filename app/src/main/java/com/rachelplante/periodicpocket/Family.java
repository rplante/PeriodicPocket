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

    @Override
    public String toString(){
        String family;
        switch(this) {
            case ALKALI_METAL: family = "Alkali Metal"; break;
            case ALKALINE_EARTH_METAL: family = "Alkaline Earth Metal"; break;
            case LANTHANIDE: family = "Lanthanide"; break;
            case ACTINIDE: family = "Actinide"; break;
            case TRANSITION_METAL: family = "Transition Metal"; break;
            case POST_TRANSITION_METAL: family = "Post-Transition Metal"; break;
            case METALLOID: family = "Metalloid"; break;
            case POLYATOMIC_NONMETAL: family = "Polyatomic Nonmetal"; break;
            case DIATOMIC_NONMETAL: family = "Diatomic Nonmetal"; break;
            case NOBLE_GAS: family = "Noble Gas"; break;
            case UNKNOWN: family = "Unknown"; break;
            default: family = "VALUE NOT RECOGNIZED";
        }

        return family;
    }
}
