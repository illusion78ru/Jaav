package Chapter7;

class TwoDShapes{
    private double width;
    private double height;
    double getWidth() {return width;}
    double getHeight() {return height;}
    void setWidth(double w) {width=w;}
    void setHeight(double h) {height=h;}

    void showDim(){
        System.out.println("������ � ������ - "+width+ " � "+height);
    }
}

class Triangles extends TwoDShapes{
    String style;
    double area(){
        return getWidth()*getHeight()/2;
    }
    void showStyle(){
        System.out.println("�����������: "+style);
    }
}
class Shapes2 {
    public static void main(String args[]){
        Triangles t1=new Triangles();
        Triangles t2=new Triangles();

        t1.setWidth(4.0);
        t1.setHeight(4.0);
        t1.style="�����������";

        t2.setWidth(8.0);
        t2.setHeight(12.0);
        t2.style="���������";

        System.out.println("���������� � t1:");
        t1.showStyle();
        t1.showDim();
        System.out.println("�������: "+t1.area());
System.out.println();
        System.out.println("���������� � t2:");
        t2.showStyle();
        t2.showDim();
        System.out.println("�������: "+t2.area());
    }
}
