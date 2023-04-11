package Car;


public class MainCarr {

    public static void main(String[] args) {

        Car car = new Car ();
        car.setMake("Masseratti");

        car.Describe();

        Car targa = new Car("Porche", "Targa", "Red", 2, true);
        targa.Describe();
    }
}
