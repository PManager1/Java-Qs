package Car;

public class Car {
    private String make = "Tesla";
    private String model = "A1";
    private String color = "Gray";

    private int doors = 2;
    private boolean IsConvertible = true;

    public Car(String make, String model, String color, int doors, boolean isConvertible) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.doors = doors;
        IsConvertible = isConvertible;
    }

    public Car() {
    }

    public void Describe() {
        System.out.println("Here describing the car  with its properties"+ " make ="+ make +
                        " model ="+ model+
                        " color ="+ color+
                        " doors ="+ doors+
                        " IsConvertible ="+ IsConvertible
                );
    }

    public String getMake() {
        return make;
    }

//    public void setMake(String make) {
//        this.make = make;
//    }

    public void setMake(String make) {
        if (make == null) make = "Unknown";

        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake) {
            case "holden", "porche", "tesla" -> this.make = make;
            default -> this.make = "Unsupported make";
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return IsConvertible;
    }

    public void setConvertible(boolean convertible) {
        IsConvertible = convertible;
    }
}
