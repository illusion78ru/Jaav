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
        System.out.println("Ширина и высота: " + getWidth() + " и " + getHeight());
    }
}

class Trianglez extends TwoDStuff {
    private String style;

    //Конструктор
    Trianglez(String s, double w, double h) {
        setWidth(w);
        setHeight(h);
        style = s;
    }

    double area() {
        return getHeight() * getWidth() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник: " + style);
    }
}

public class Shapes3 {
    public static void main(String args[]) {
        Trianglez t1 = new Trianglez("закрашенный", 4, 4);
        Trianglez t2 = new Trianglez("контурный", 8, 12);

        System.out.println("Информация о t1:");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь - "+t1.area());

        System.out.println();

        System.out.println("Информация о t2:");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь - "+t2.area());
    }
}
