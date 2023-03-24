package Chapter6;

class Stack {
    private char q[];
    private int getloc=0;

Stack(char ob[]){
    q=new char[ob.length];
}
    void put(char a[]) {
        for (int i=0;i<a.length;i++) {
            q[i] = a[i];
            getloc++;
        }
    }
    void get(){
        for (int i=(getloc-1);i>=0;i--)
            System.out.print(q[i]);
    }

}

class Ex3 {
    public static void main(String args[]) {

        char[] simb = {'f', 'a', 'x', 'v','g','j','d','e'};
        Stack queue = new Stack(simb);

        queue.put(simb);
        queue.get();
    }
}
