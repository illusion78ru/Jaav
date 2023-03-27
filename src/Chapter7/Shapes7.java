package Chapter7;

class TwoDShape4{
    private double width;
    private double height;
    TwoDShape4(){
        width=height=0;
    }
    TwoDShape4(double w,double h){
        width=w; height=h;
    }
    TwoDShape4(double x){
        width=height=x;
    }
    TwoDShape4(TwoDShape4 ob){
        width= ob.width;
        height=ob.height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    void showDim(){
        System.out.println("Ширина и высота: "+width+" и "+height);
    }
}
class Triangle4 extends TwoDShape4{
    private String style;
    Triangle4(){
        super();
        style="none";
    }
    Triangle4(String s,double w,double h){
        super(w,h);
        style=s;
    }
    Triangle4(double x){
        super(x);
        style="закрашенный";
    }
    Triangle4(Triangle4 ob){
        super(ob);
        style= ob.style;
    }
    double area(){
        return getHeight()*getWidth()/2;
    }
    void showStyle(){
        System.out.println("Треугольник: "+style);
    }
}
public class Shapes7 {
    public static void main(String args[]){
        Triangle4 t1=new Triangle4("контурный",8,12);
        //создаем копию
        Triangle4 t2=new Triangle4(t1);

        System.out.println("Информация о t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь: "+t1.area());

        System.out.println();

        System.out.println("Информация о t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь: "+t2.area());
    }
}
