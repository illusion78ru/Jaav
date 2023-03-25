package Chapter6;

class Recur {
    String str;
    int num;

    Recur(String let) {
        str = let;
        num = str.length();
    }

    int recurs(Recur ob) {
        System.out.print(ob.str.charAt(ob.num - 1));
        ob.num--;
        if (num==0) return 0;
            recurs(ob);
        return 0;

        }
    }

public class Ex6 {
    public static void main(String args[]) {
        String msg = new String("Я люблю Полиночку");
        Recur one = new Recur(msg);
        one.recurs(one);

    }
}
