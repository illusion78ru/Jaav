package Chapter5.exercise;

public class ex51 {
    public static void main(String args[]) {
        double sample1[]=new double[12];

        double sample2[];
        sample2=new double[12];

        for (int i=0;i< sample1.length;i++) {

            sample1[i] = i;
        }
        for (int i=0;i<sample2.length;i++) {
            sample2[i] = -i;
        }

        for (int i=0;i< sample1.length;i++)
        System.out.print(sample1[i] + " ");
        System.out.println();
        for (int i=0;i< sample2.length;i++)
            System.out.print(sample2[i] + " ");

    }
}
