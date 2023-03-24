package Chapter6;

class StaticDemo {
    int x; //обычная переменная экземпляра
    static int y; //статическая переменная

    int sum() {
        return x + y;
    }
}

class SDemo {
    public static void main(String args[]) {
        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();

        //У каждого объекта имеется своя копия переменной экземпляра
        ob1.x = 10;
        ob2.x = 20;

        System.out.println("Разумеется, ob1.x и ob2.x " + "независимы");
        System.out.println("ob1.x: " + ob1.x + "\nob2.x: " + ob2.x);
        System.out.println();

        //Все объекты используют одну общую копию статической переменной
        System.out.println("Статическая переменная у - общая");
        StaticDemo.y = 19;
        System.out.println("Присвоить статической переменной StaticDemo.y значение 19");

        System.out.println("ob1.sum: " + ob1.sum());
        System.out.println("ob2.sum: " + ob2.sum());
        System.out.println();

        StaticDemo.y=100;
        System.out.println("Изменили значение статической переменной StaticDemo.y на 100");
        System.out.println("ob2.sum: " + ob1.sum());
        System.out.println("ob2.sum: " + ob2.sum());
        System.out.println();
    }
}
