package Chapter2;

public class Scops {
    public static void main(String args[]){
        int n,d,g;

        n=10;d=2;
        if (d!=0 && (n%d)==0) System.out.println(d + " является делителем " + n);

        d=0;
        if (d!=0 && (n%d)==0) System.out.println(d + " является делителем " + n); //поскольку && то деление на 0 не происходит

        //if (d!=0 & (n%d)==0) System.out.println(d + " является делителем " + n); //происходит деление на 0


    }
}
