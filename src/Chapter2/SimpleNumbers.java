package Chapter2;

public class SimpleNumbers {
    public static void main(String args[]) {
        int i,j;
        for (i=3; i<101; i++) {
            int n=0;
            for (j=2; j<i; j++) {

                if ((i%j)==0){
                    n++;
                }
                if (n==0) {
                    System.out.println(i);break;}

                }
            }
        }
    }

