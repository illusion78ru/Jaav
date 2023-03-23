package Chapter4;
class help {
    void helpon(int what) {
        switch (what) {
            case '1' -> {
                System.out.println("Инструкция if:\n");
                System.out.println("if (условие) инструкция;");
                System.out.println("else инструкция;");
                System.out.println();
            }
            case '2' -> {
                System.out.println("Инструкция switch:\n");
                System.out.println("switch (выражение) ");
                System.out.println("}");
                System.out.println("case константа: ");
                System.out.println("последовательность инструкций");
                System.out.println("break;");
                System.out.println("// ...");
                System.out.println("}");
                System.out.println();
            }
            case '3' -> {
                System.out.println("Цикл for:\n");
                System.out.println("for (инициализация; условие; итерация");
                System.out.println("инструкция;");
                System.out.println();
            }
            case '4' -> {
                System.out.println("Цикл while");
                System.out.println();
                System.out.println("while (условие) инструкция;");
                System.out.println();
            }
            case '5' -> {
                System.out.println("Цикл do-while");
                System.out.println();
                System.out.println("do {");
                System.out.println("инструкция;");
                System.out.println("} while (условие);");
                System.out.println();
            }
            case '6' -> {
                System.out.println("Инструкция break:\n");
                System.out.println("break; или break метка;");
            }
            case '7' -> {
                System.out.println("Инструкция continue\n");
                System.out.println();
                System.out.println("continue; или continue метка;");
            }
        }
    }
    void showmenu() {
        System.out.println("Справка: ");
        System.out.println("    1. if");
        System.out.println("    2. switch");
        System.out.println("    3. for");
        System.out.println("    4. while");
        System.out.println("    5. do-while");
        System.out.println("    6. break");
        System.out.println("    7. continue");
        System.out.println("Выход - q");
        System.out.println("Выберите: ");
    }
    boolean isValid(int ch) {
        if (ch < '1' | ch > '7' & ch != 'q') return false;
        else return true;
    }
}

public class HelpClassDemo {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice, ignore;
        help hlpobj = new help();

        for (; ; ) {
            do {
                hlpobj.showmenu();

                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                }
                while (ignore != '\n');
            } while (!hlpobj.isValid(choice));
            if (choice=='q') break;
            System.out.println("\n");
            hlpobj.helpon(choice);
        }
    }
}
