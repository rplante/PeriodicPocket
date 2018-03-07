package com.rachelplante.periodicpocket;

public class Element {
    private String name;
    private String symbol;
    private int atNum;
    private float atWeight;
    private String period;
    private String group;
    private Family family;
    private State state;
    private boolean radioactivity;

    //Empty constructor
    public Element() {}

    //Constructor
    public Element(String name, String symbol, int atNum, float atWeight, String period, String group, Family family, State state, boolean radioactivity) {
        this.name = name;
        this.symbol = symbol;
        this.atNum = atNum;
        this.atWeight = atWeight;
        this.period = period;
        this.group = group;
        this.family = family;
        this.state = state;
        this.radioactivity = radioactivity;
    }

    //Getters
    public String getName() {
        return this.name;
    }
    public String getSymbol() {
        return this.symbol;
    }
    public int getAtNum() {
        return this.atNum;
    }
    public float getAtWeight() {
        return this.atWeight;
    }
    public String getPeriod() {
        return this.period;
    }
    public String getGroup() {
        return this.group;
    }
    public Family getFamily() {
        return this.family;
    }
    public State getState() {
        return this.state;
    }
    public boolean getRadioactivity() {
        return this.radioactivity;
    }
    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public void setAtNum(int atNum) {
        this.atNum = atNum;
    }
    public void setAtWeight(float atWeight) {
        this.atWeight = atWeight;
    }
    public void setPeriod(String period) {
        this.period = period;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public void setFamily(Family family) {
        this.family = family;
    }
    public void setState(State state) {
        this.state = state;
    }
    public void setRadioactivity(boolean radioactivity) {
        this.radioactivity = radioactivity;
    }
}
