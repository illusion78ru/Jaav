package Chapter6;

class VarArgs2 {
    static void vaTest2(String msg, int... v) {
        System.out.println(msg + v.length);
        System.out.println("����������: ");

        for (int i=0;i<v.length;i++)
            System.out.print(v[i]+" ");
        System.out.println();
        System.out.println();
    }
    public static void main(String args[]) {
        vaTest2("���� �������� � �������: ",10);
        vaTest2("��� ��������� � �������", 1,2,3);
        vaTest2("��� ���������� � �������");
    }
}
