package Chapter7;

class TwoD_Shape{
    private double widht;
    private double height;
    //Параметризированный конструктор
    TwoD_Shape(double w,double h){
        widht=w;
        height=h;
    }
    double getWidht() {return widht;}
    double getHeight() {return height;}
    void setHeight(double h){height=h;}
    void setWidht(double w) {widht=w;}

    void showDim(){
        System.out.println("Ширина и высота: "+widht+" и "+height);
    }
}
class Triangluz extends TwoD_Shape{
    private String style;
    Triangluz(String s, double w,double h){
        super (w,h);
        style=s;
    }
    double area(){return getHeight()*getWidht()/2;}
    void showStyle(){
        System.out.println("Треугольник: "+style);
    }
}
public class Shapes4 {
    public static void main(String args[]){
        Triangluz t1=new Triangluz("закрашенный",4,4);
        Triangluz t2=new Triangluz("контурный",8,12);

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
