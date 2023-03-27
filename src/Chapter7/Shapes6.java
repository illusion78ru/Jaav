package Chapter7;

class TwoDShapes3 {
    private double width;
    private double height;

    TwoDShapes3(double w, double h) {
        width = w;
        height = h;
    }

    TwoDShapes3() {
        width = height = 0;
    }

    TwoDShapes3(double x) {
        width = height = x;
    }

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
}

class Triangle3 extends TwoDShapes3 {
    private String style;

    Triangle3() {
        super();
        style = "none";
    }

    Triangle3(double x) {
        super(x);
        style = "закрашенный";
    }

    Triangle3(String s, double w, double h) {
        super(w, h);
        style = s;
    }

    double area() {
        return getHeight() * getWidth() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник: " + style);
    }
}

class ColorTriangles extends Triangle3 {
    private String color;

    ColorTriangles(String c, String s, double w, double h) {
        super(s, w, h);
        color = c;
    }

    String getColor() {
        return color;
    }

    void showColor() {
        System.out.println("Цвет - " + color);
    }
}


class Shapes6 {
    public static void main(String args[]) {
        ColorTriangles t1 = new ColorTriangles("Синий", "контурный", 8, 12);
        ColorTriangles t2= new ColorTriangles("Красный","Закрашенный",2,2);

        System.out.println("Информация о t1: ");
        t1.showStyle();
        t1.showColor();
        System.out.println("Площадь: "+t1.area());

        System.out.println();

        System.out.println("Информация о t2: ");
        t2.showStyle();
        t2.showColor();
        System.out.println("Площадь: "+t2.area());

    }
}
