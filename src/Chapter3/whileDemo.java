package Chapter3;

public class whileDemo {
    public static void main(String args[]) {
        char ch;

        ch='a';
        int j=0;
        while (ch<='z') {
            if (j!=10) {
                System.out.print(ch + " ");
                ch++;
                j++;
                       }
            else
            {
                System.out.println();
                j=0;
            }
        }
    }
}
