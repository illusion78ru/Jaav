package Chapter3.Exercise;

public class ex1 {
    public static void main(String args[])
        throws java.io.IOException {
        char ch;
        int i=0;

        do {
            ch=(char) System.in.read();
            if (ch==' ') {
                i++;}
            else if (ch=='.') {
                ch='\n';
            }

        }while(ch!='\n');
        System.out.println("Пробелов: " + i);
    }
}
