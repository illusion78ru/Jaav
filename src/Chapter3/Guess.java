package Chapter3;

public class Guess {
    public static void main(String args[])
            throws java.io.IOException {
        char ch, answer, ignore;
        answer = 'K';
        do {


            System.out.println("������� ���������� ����� �� A-Z");
            ch = (char) System.in.read();

            do {
                ignore = (char) System.in.read();

            } while (ignore != '\n');

            if (ch == answer) {
                System.out.println("�� �������");
            } else {
                System.out.println("���");
                if (ch < answer) System.out.println("����� � ����� ��������");
                else System.out.println(("����� � ������ ��������"));
            }
        } while (ch!=answer);
    }
}
