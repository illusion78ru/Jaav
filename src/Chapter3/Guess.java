package Chapter3;

public class Guess {
    public static void main(String args[])
            throws java.io.IOException {
        char ch, answer, ignore;
        answer = 'K';
        do {


            System.out.println("Введите загаданную букву от A-Z");
            ch = (char) System.in.read();

            do {
                ignore = (char) System.in.read();

            } while (ignore != '\n');

            if (ch == answer) {
                System.out.println("Вы угадали");
            } else {
                System.out.println("Нет");
                if (ch < answer) System.out.println("Ближе к концу алфавита");
                else System.out.println(("ближе к началу алфавита"));
            }
        } while (ch!=answer);
    }
}
