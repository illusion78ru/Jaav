package Chapter3.Exercise;

public class ex4 {
    public static void main(String args[] ) {
        int i,k=0;

        for (i=1000;i>=0;) {
            System.out.print(i + " ");
        i=i-2; k++;
        if (k==10) {
            System.out.println();
            k=0;
        }

        }
    }
}
