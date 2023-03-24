package Chapter6;

class Queue {
    private char q[];
    private int putloc, getloc;

    Queue(Queue ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        for (int i = getloc + 1; i <= putloc; i++)
            q[i] = ob.q[i];
    }

    Queue(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length + 1];

        for (int i = 0; i < a.length; i++) put(a[i]);
    }

    Queue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    //����� ���������� �������� � ������
    void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println(" ������� ��������� ");
            return;
        }
        q[putloc++] = ch;
    }

    //����� ���������� ������ �� �������
    char get() {
        if (getloc == putloc) {
            System.out.println(" - ������� �����");
            return (char) 0;
        }
        return q[getloc++];
    }
}


public class QDemo2 {
    public static void main(String args[]) {

        //���������� ������� q1
        Queue q1 = new Queue(10);

        //���������� ������� q2
        char name[] = {'T', 'o', 'm'};
        Queue q2 = new Queue(name);

        char ch;
        int i;

        for (i = 0; i < 10; i++)
            q1.put((char) ('A' + i));

        //���������� ������� q3
        Queue q3 = new Queue(q1);

        //����� ����������� q1
        System.out.println("���������� q1: ");
        for (i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        //����� ����������� q2
        System.out.println("���������� q2: ");
        for (i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        //����� ����������� q3
        System.out.println("���������� q3: ");
        for (i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }

        System.out.println("\n");
    }
}
