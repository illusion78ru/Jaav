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
        System.out.println("Переменная \"a\" в объекте one равна: "+one.a );
        System.out.println("Переменная \"a\" в объекте two равна: "+two.a );
        one.swap(two);
        System.out.println("Переменная \"a\" в объекте one равна: "+one.a );
        System.out.println("Переменная \"a\" в объекте two равна: "+two.a );

    }
}