

class Car {
    private String model;
    private String brand;

    public Car(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String calculateGear(int speed) {
        if (speed <= 0) {
            return "Neuter";
        } else if (speed <= 20) {
            return "1ª Gear";
        } else if (speed <= 40) {
            return "2ª Gear";
        } else if (speed <= 60) {
            return "3ª Gear";
        } else if (speed <= 80) {
            return "4ª Gear";
        } else {
            return "5ª Gear";
        }
    }
}
