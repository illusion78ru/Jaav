package Chapter5;

public class AssignARef {
    public static void main(String args[]) {
        int i;

        int nums1[]=new int[10];
        int nums2[]=new int[10];

        for (i=0;i<10;i++)
            nums1[i]=i;
        for (i=0;i<10;i++)
            nums2[i]=-i;

        System.out.println("Массив 1: ");
        for (i=0;i<10;i++) {
            System.out.print(nums1[i]+ "  ");}
        System.out.println();
        System.out.println("Массив 2: ");
        for (i=0;i<10;i++){
            System.out.print(nums2[i]+ " ");}

        nums2=nums1;
        System.out.println();System.out.println();
        System.out.println("Массив 2 после присваивания: ");
        for (i=0;i<10;i++)
            System.out.print(nums2[i] + "  ");

        nums2[3]=99;


        System.out.println();System.out.println();
        System.out.println("Массив 1 после изменения массива 2 ");
        for (i=0;i<10;i++) {
            System.out.print(nums1[i]+ "  ");}
        System.out.println();

        }
}
