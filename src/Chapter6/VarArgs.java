package Chapter6;

class VarArgs {
    static void vaTest(int ...v){
        System.out.println();
        System.out.println("Количество переданных аргументов: "+v.length);
        System.out.println("Содержимое: ");
        if (v.length==0) System.out.print("А нихуя");
        for (int i=0;i<v.length;i++){
            System.out.print(v[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        vaTest(10);
        vaTest(1,2,3);
        vaTest();
    }
}
