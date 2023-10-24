public enum TrafficLight {
    RED("Red light", "60 seconds"),
    YELLOW("Yellow light", "5 seconds"),
    GREEN("Green light", "45 seconds");

    private final String lightColor;
    private final String lightDuration;

    TrafficLight(String lightColor, String lightDuration) {
        this.lightColor = lightColor;
        this.lightDuration = lightDuration;
    }

    public String getLightColor() {
        return lightColor;
    }

    public String getLightDuration() {
        return lightDuration;
    }
}
