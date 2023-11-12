public class Rectangle {
    private double length = 1;
    private double width = 1;

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setLength(double length) {
        if (length > 0.0 && length < 20.0)
            this.length = length;
        else{
            System.out.println("The value of length must be greater than 0.0 and less than 20.0.");
            System.exit(1);
        }
    }

    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0)
            this.width = width;
        else{
            System.out.println("The value of width must be greater than 0.0 and less than 20.0.");
            System.exit(1);
        }
    }

    public double areaRec() {
        return (this.length * this.width);
    }

    public double perimeterRec() {
        return 2 * (this.length + this.width);
    }
}
