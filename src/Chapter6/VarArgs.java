package Chapter6;

class VarArgs {
    static void vaTest(int ...v){
        System.out.println();
        System.out.println("���������� ���������� ����������: "+v.length);
        System.out.println("����������: ");
        if (v.length==0) System.out.print("� �����");
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
