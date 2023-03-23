public class ExInchesToMetres {
    public static void main(String args[]){
        double inch,metr;
        int count=0;
        for (inch=1;inch<=60;inch++) {
    metr=inch/39.37;
    System.out.println(inch + " ה‏יל סמהונזטע " + metr + " לוענמג ");
    count++;
    if (count==12) {
        System.out.println();
        count=0;
    }
        }
    }
}
