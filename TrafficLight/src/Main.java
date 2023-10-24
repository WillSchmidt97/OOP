public class Main {
    public static void main(String[] args) {
        System.out.println("Traffic light details: ");

        for (TrafficLight traffic : TrafficLight.values()) {
            System.out.printf("%-10s%-45s%s%n", traffic,
                    traffic.getLightColor(), traffic.getLightDuration());
        }
    }
}