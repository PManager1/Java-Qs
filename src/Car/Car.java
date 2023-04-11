package Car;

public class Car {
    private String make;
    private String model;
    private String color;

    private int doors;
    private boolean IsConvertible;

    public void Describe() {
        System.out.println("Here describing the car  with its properties"+ "make ="+ make + "model ="+ model+
                        " color ="+ color+
                        " doors ="+ doors+
                        " IsConvertible ="+ IsConvertible
                );
    }

}
