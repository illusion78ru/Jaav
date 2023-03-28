package Chapter7;

class TwoDShape9 {
    private double width;
    private double height;
    private String name;

    TwoDShape9(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    TwoDShape9() {
        width = height = 0;
    }

    TwoDShape9(double x, String n) {
        width = height = x;
        name = n;
    }

    TwoDShape9(TwoDShape9 ob) {
        width = ob.width;
        ;
        height = ob.height;
        name = ob.name;
    }

    double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    String getName() {
        return name;
    }

    void showDim() {
        System.out.println("������ � ������: " + width + " � " + height);
    }

    double area() {
        System.out.println("����� area() ������ ���� �������������");
        return 0.0;
    }
}

class Triangle9 extends TwoDShape9 {
    private String style;

    Triangle9() {
        super();
        style = "none";
    }

    Triangle9(String s, double w, double h) {
        super(w, h, "�����������");
        style = s;
    }

    Triangle9(double x) {
        super(x, "�����������");
        style = "�����������";
    }

    Triangle9(Triangle9 ob) {
        super(ob);
        style = ob.style;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("�����������: " + style);
    }
}

class Rectangle extends TwoDShape9 {
    Rectangle() {
        super();
    }

    Rectangle(double x) {
        super(x, "�������������");
    }

    Rectangle(double w, double h) {
        super(w, h, "�������������");
    }

    Rectangle(Rectangle ob) {
        super(ob);
    }

    boolean isSquare() {
        if (getWidth() == getHeight()) return true;
        return false;
    }

    @Override
    double area() {
        return getWidth() * getHeight();
    }
}

class DynShapes {
    public static void main(String args[]) {
        TwoDShape9 shapes[] = new TwoDShape9[5];

        shapes[0] = new Triangle9("���������", 8, 12);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new Triangle9(7);
        shapes[4] = new TwoDShape9(10, 20, "������");

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("������ -" + shapes[i].getName());
            System.out.println("�������: " + shapes[i].area());
            System.out.println();
        }
    }
}
