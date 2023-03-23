package Chapter3.Exercise;

public class ex10
{
    public static void main(String args[])
        throws java.io.IOException
    {
        char button, ignore,answer;
        int i=0;

        do {
            button = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while(ignore!='\n');
            if ((button>=65) & (button<=90)) {
                System.out.println((char) (button + 32)); i++;
            } else
            if ((button>=97) & (button<=122)) {
                System.out.println((char) (button - 32)); i++;
            } else
            if (button=='.') {break;}
            else {System.out.println("Попробуйте еще раз"); continue;}


            }while(button !='.');
            //}while(((button>=65) & (button<=90)) | ((button>=97) & (button<=122)));

        System.out.println("Для " + i + " букв был изменен регистр");
    }
}
