package Chapter2;

public class SideEffect {
    public static void main(String args[]){
        int i;

        i=0;
        System.out.println(i);
        if (false & (++i<100)) System.out.println("��� ������ �� ����� ������������, �� i ���������� �� 1");
        System.out.println(i);
        if (false && (++i<100)) System.out.println("��� ������ �� ����� ������������, � i �� ���������� �� 1");
        System.out.println(i);

    }
}
