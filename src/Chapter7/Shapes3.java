package Chapter7;

class TwoDStuff {
    private double height;
    private double width;

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height = h;
    }

    void showDim() {
        System.out.println("������ � ������: " + getWidth() + " � " + getHeight());
    }
}

class Trianglez extends TwoDStuff {
    private String style;

    //�����������
    Trianglez(String s, double w, double h) {
        setWidth(w);
        setHeight(h);
        style = s;
    }

    double area() {
        return getHeight() * getWidth() / 2;
    }

    void showStyle() {
        System.out.println("�����������: " + style);
    }
}

public class Shapes3 {
    public static void main(String args[]) {
        Trianglez t1 = new Trianglez("�����������", 4, 4);
        Trianglez t2 = new Trianglez("���������", 8, 12);

        System.out.println("���������� � t1:");
        t1.showStyle();
        t1.showDim();
        System.out.println("������� - "+t1.area());

        System.out.println();

        System.out.println("���������� � t2:");
        t2.showStyle();
        t2.showDim();
        System.out.println("������� - "+t2.area());
    }
}
