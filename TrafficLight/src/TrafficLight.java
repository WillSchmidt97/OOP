public enum TrafficLight {
    RED("60 seconds"),
    YELLOW("5 seconds"),
    GREEN("45 seconds");

    private final String lightDuration;

    TrafficLight(String lightDuration) {
        this.lightDuration = lightDuration;
    }

    public String getLightDuration() { return this.lightDuration; }
}
