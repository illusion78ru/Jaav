package Chapter6;

class Test{
    int a;
    Test(int i){
        a=i;
    }

    void swap(Test ob2){
    int x;
    x=a; a= ob2.a;
    ob2.a=x;
    }
}
public class Ex5 {
    public static void main(String args[]) {
        Test one = new Test(1);
        Test two = new Test(2);
        System.out.println("���������� \"a\" � ������� one �����: "+one.a );
        System.out.println("���������� \"a\" � ������� two �����: "+two.a );
        one.swap(two);
        System.out.println("���������� \"a\" � ������� one �����: "+one.a );
        System.out.println("���������� \"a\" � ������� two �����: "+two.a );

    }
}