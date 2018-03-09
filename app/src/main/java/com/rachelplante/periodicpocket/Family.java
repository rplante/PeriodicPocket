package com.rachelplante.periodicpocket;

public enum Family {
    ALKALI_METAL, ALKALINE_EARTH_METAL, LANTHANIDE,
    ACTINIDE, TRANSITION_METAL, POST_TRANSITION_METAL,
    METALLOID, POLYATOMIC_NONMETAL, DIATOMIC_NONMETAL,
    NOBLE_GAS, UNKNOWN;

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
