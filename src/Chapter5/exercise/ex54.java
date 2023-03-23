package Chapter5.exercise;

class wordmass {
    int numwords;
    String text= "";

    int wordnum(String msg) { //—читает количество слов
        int numword=1;
        int spacer=0;
        String str=msg;
        for (int i = 0; i < str.length()-1; i++) {
                if (((str.charAt(i)) == ' ') & (str.charAt(i + 1) != ' ')) {
                    numword++;
                }
        }
        return numword;
    }
}

public class ex54 {
    public static void main(String args[]) {
String str="I love Polina very very silno";
wordmass msg=new wordmass();

    for (int i=0;i<str.length();i++) {
        msg.text += str.charAt(i);
    }
    System.out.println(msg.text);
    System.out.println(msg.wordnum(msg.text));

    int spaces[]=new int[msg.wordnum(msg.text)+1];
    spaces[0]=0; spaces[msg.wordnum(msg.text)]=msg.text.length();

        int j=0;
        for (int i=0;i<msg.text.length()-1;i++) {
            if ((msg.text.charAt(i) == ' ') & (msg.text.charAt(i + 1) != ' ')) {
                j++;

                spaces[j] = i;
            }
        }

        String words[]=new String[msg.wordnum(msg.text)];
        for (int i=0;i< msg.wordnum(msg.text); i++)
            words[i]="";

        for (int k=0; k< msg.wordnum(msg.text); k++) {

            for (int l=spaces[k]; l<spaces[k+1]; l++) {
                if (str.charAt(l)!=' ')
                words[k] +=str.charAt(l);
            }
        }
        System.out.println();
        for (int i=0;i< msg.wordnum(msg.text);i++)
            System.out.println(words[i]);
    }
}

