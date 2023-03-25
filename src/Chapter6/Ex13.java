package Chapter6;

class SumCL{
    int sum(int ...v){
        int sam=0;
        for (int i=0; i< v.length;i++){
            sam+=v[i];
        }
    return sam;
    }
}
class Ex13 {
    public static void main(String args[]) {
        SumCL test = new SumCL();
        System.out.println(test.sum(1,2,3));
    }
}