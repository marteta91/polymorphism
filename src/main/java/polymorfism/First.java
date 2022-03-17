package polymorfism;

public class First {

    public static void main(String[] args) {
        Car myCars [] = new Cars[4];

        myCars[0] = new Car("GH67", "Ferrari", "A89");
        myCars[1] = new CarTurism(4, "78HJ", "Audi", "P14");
        myCars[2] = new CarSport(500, "45GH", "Toyota", "KJ8");
        myCars[3] = new CarFurgo(2000, "JI8","Toyota", "J9");

        for(Car.Cars: myCars) {
            System.out.println("");
        }



    }
}
