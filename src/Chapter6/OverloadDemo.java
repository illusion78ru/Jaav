package Chapter6;

class Overload {
    void ovlDemo() {
        System.out.println("��� ����������");
    }

    void ovlDemo(int a) {
        System.out.println("���� ��������: " + a);
    }

    int ovlDemo(int a, int b) {
        System.out.println("��� ���������: �" + a + " � b:" + b);
        return a+b;
    }

    double ovlDemo(double a,double b) {
        System.out.println("��� ��������� ���� double: a="+a+" � b="+b);
        return a+b;
    }
}

class OverloadDemo {
    public static void main(String args[]) {
        Overload ob= new Overload();
        int resI;
        double resD;

        ob.ovlDemo();
        System.out.println();

        ob.ovlDemo(2);
        System.out.println();

        resI=ob.ovlDemo(2,4);
        System.out.println("��������� ������ ob.ovlDemo(2,4): "+resI);
        System.out.println();

        resD=ob.ovlDemo(1.1,2.32);
        System.out.println("��������� ������ ob.ovlDemo(1.1,2.32):"+resD);
    }
}
