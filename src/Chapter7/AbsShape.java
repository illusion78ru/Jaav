package Chapter7;

abstract class AbsDShape {
    private double width, height;
    private String name;

    AbsDShape() {
        width = height = 0;
        name = "none";
    }

    AbsDShape(double x, String n) {
        width = height = x;
        name = n;
    }

    AbsDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    AbsDShape(AbsDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    String getName() {
        return name;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    void showDim() {
        System.out.println("Ширина и высота: " + width + " и " + height);
    }

    abstract double area();
}

class Trianglee extends AbsDShape {
    private String style;
    Trianglee(){
        super();
        style="none";
    }
    Trianglee(String s, double w,double h){
        super(w,h,"Треугольник");
        style=s;
    }
    Trianglee(double x){
        super(x,"Треугольник");
        style="закрашенный";
    }
    Trianglee(Trianglee ob){
        super(ob);
        style=ob.style;
    }

    double area() {
        return getWidth()*getHeight()/2;
    }
    void showStyle(){
        System.out.println("Треугольник: "+style);
    }
}
class Rectanglee extends AbsDShape {
    Rectanglee(){
        super();
    }
    Rectanglee(double x){
        super(x,"Прямоугольник");
    }
    Rectanglee(double w, double h){
        super(w,h,"Прямоугольник");
    }
    Rectanglee(Rectanglee ob){
        super(ob);
    }
    boolean isSquare(){
        if (getWidth()==getHeight()) return true;
        return false;
    }
    double area() {
        return getWidth()* getHeight();
    }
}

class AbsShape {
    public static void main(String args[]){
        AbsDShape shapes[]=new AbsDShape[4];

        shapes[0]= new Trianglee("контурный",8,12);
        shapes[1]= new Rectanglee(10);
        shapes[2]= new Rectanglee(10,4);
        shapes[3]= new Trianglee(7);

        for (int i=0;i< shapes.length;i++){
            System.out.println("Объект - "+shapes[i].getName());
            System.out.println("Площадь: "+shapes[i].area());
            System.out.println();
            System.out.println(shapes[1]);
        }
    }
}
