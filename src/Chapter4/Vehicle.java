package Chapter4;
class Vihicle
{
    int passengers;
    int fuelcap;
    int mpg;
}

public class Vehicle {
    public static void main(String args[]) {
        Vihicle minivan = new Vihicle();
        int range;

        minivan.passengers=7;
        minivan.fuelcap=16;
        minivan.mpg=21;

        range=minivan.fuelcap*minivan.mpg;
        System.out.println("Мини фургон может перевезти " + minivan.passengers + "на расстояние: " + range + "миль");
    }
}
