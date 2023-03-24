package Chapter6;

class VarArgs2 {
    static void vaTest2(String msg, int... v) {
        System.out.println(msg + v.length);
        System.out.println("Содержимое: ");

        for (int i=0;i<v.length;i++)
            System.out.print(v[i]+" ");
        System.out.println();
        System.out.println();
    }
    public static void main(String args[]) {
        vaTest2("Один аргумент в массиве: ",10);
        vaTest2("Три аргумента в массиве", 1,2,3);
        vaTest2("Нет аргументов в массиве");
    }
}
