package Chapter2;

public class UseCast {
    public static void main(String args[]) {
        int i;

        for (i=1; i<5; i++)
        {
            System.out.println(i + " / 3 равно " + (i/3));
            System.out.println(i + " / 3 с дробной частью " +  (double) i/3);
            System.out.println();
        }
    }
}
