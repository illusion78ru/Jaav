package Chapter5.exercise;

public class ex53 {
    public static void main(String args[]) {
        double nums[]={5,8,2,1,7,8,5,3,2,5};
        double sum=0;
        for(int i=0;i< nums.length;i++)
            sum +=nums[i];
        System.out.println();
        System.out.println("������: ");
        for (int i=0; i<nums.length;i++)
        System.out.print(nums[i]+" ");
System.out.println();
        System.out.println("\n����� ���� ���������");
        System.out.println(sum);

        System.out.println("\n������� ��������: "+(sum/ nums.length));

    }
}
