public class IfDemo {
    public static void main(String args[]){
        int a,b,c;
        a=2; b=3;
        if (a<b) System.out.println("� ������ b");
        if (a==b) System.out.println("�� �� ������ ������ ���� �����");
        System.out.println();

        c=a-b;

        System.out.println("c �������� -1");
        if (c>=0) System.out.println("c �� ������������� �����");
        if (c<0) System.out.println("� - ������������� �����");
        System.out.println();

        c=b-a;
        System.out.println("� ������ �������� 1");
        if (c>=0) System.out.println("c �� ������������� �����");
        if (c<0) System.out.println("� - ������������� �����");

    }
}
