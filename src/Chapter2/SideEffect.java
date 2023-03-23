package Chapter2;

public class SideEffect {
    public static void main(String args[]){
        int i;

        i=0;
        System.out.println(i);
        if (false & (++i<100)) System.out.println("Эта строка не будет отображаться, но i увеличился на 1");
        System.out.println(i);
        if (false && (++i<100)) System.out.println("Эта строка не будет отображаться, и i не увеличился на 1");
        System.out.println(i);

    }
}
