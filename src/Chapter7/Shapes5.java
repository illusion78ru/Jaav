package Chapter7;

class TwoDShapes2 {
    private double width;
    private double height;

    TwoDShapes2() {
        width = height = 0;
    }

    TwoDShapes2(double w, double h) {
        width = w;
        height = h;
    }

    TwoDShapes2(double x) {
        width = height = x;
    }

    double getWidth2() {
        return width;
    }

    double getHeight2() {
        return height;
    }

    void setHeight2(double h) {
        height = h;
    }

    void setWidth2(double w) {
        width = w;
    }

    void showDim2() {
        System.out.println("Ширина и высота: " + width + " и " + height);
    }
}

class Triangle2 extends TwoDShapes2 {
    private String style;

    Triangle2() {
        super();
        style = "none";
    }

    Triangle2(String s, double w, double h) {
        super(w, h);
        style = s;
    }

    Triangle2(double x) {
        super(x);
        style = "закрашенный";
    }

    double area() {
        return getWidth2() * getHeight2() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник: " + style);
    }
}

public class Shapes5 {
    public static void main(String args[]) {
        Triangle2 t1 = new Triangle2();
        Triangle2 t2 = new Triangle2("контурный", 8, 12);
        Triangle2 t3 = new Triangle2(4);

        t1 = t2;

        System.out.println("Информация о t1:");
        t1.showStyle();
        t1.showDim2();
        System.out.println("Площадь: " + t1.area());

        System.out.println();

        System.out.println("Информация о t2:");
        t2.showStyle();
        t2.showDim2();
        System.out.println("Площадь: " + t2.area());

        System.out.println();

        System.out.println("Информация о t3:");
        t3.showStyle();
        t3.showDim2();
        System.out.println("Площадь: " + t3.area());
    }
}
