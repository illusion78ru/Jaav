package Chapter4;

class Vehicles {
    int passengers;
    int fuelcap;
    int mpg;

    Vehicles(int p, int f, int m) {
        passengers=p;
        fuelcap=f;
        mpg=m;
    }
    int range() {
        return mpg*fuelcap;
    }
    double fuelneeded(int a) {
        return ((double) a/mpg);
    }
}

public class TwoVehicles {
public static void main(String args[])
    throws java.io.IOException {

Vehicles minivan = new Vehicles(7,16,21);
Vehicles sportscar = new Vehicles(2,14,12);

int range1,range2;
int dist=252;

range1= minivan.range();
range2= sportscar.range();

    System.out.println("Мини фургон может перевезти " + minivan.passengers + " человек на расстояние: "+ range1 + " миль" );

    System.out.println("Спорткар может перевезти " + sportscar.passengers + " человек на расстояние " + range2 + " миль");

    System.out.println("На "+ dist +" миль минивену надо: " + minivan.fuelneeded(dist) );
    System.out.println("На "+ dist +"  миль Спорткару надо: " + sportscar.fuelneeded(dist));


}
}
