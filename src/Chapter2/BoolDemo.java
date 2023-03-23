package Chapter2;

public class BoolDemo {
    public static void main(String args[]) {
        boolean b;

        b=false;
        System.out.println("Значение b: " + b);
        b=true;
        System.out.println("Значение b: " + b);

        if (b) System.out.println("Эта функция выполняется");

        b=false;
        if (b) System.out.println("Эта функция не выполняется");

        System.out.println("Результат сравнения 10<9" + (9<10));
    }
}
