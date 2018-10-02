import java.util.Scanner;

public class Main {
    static String text;
    static int minWordsLen;

    public static void main(String[] args){
        System.out.println("Kasiianenko Dmytro");

        System.out.println("Enter some text: ");
        Scanner scanner = new Scanner(System.in);
        text = scanner.nextLine();

        System.out.println(text);

        minWordsLen = findMinLen();
        printMinWords();
    }

    private static int findMinLen() {
        String[] words = text.split("[\\;\\:\\!\\?\\,\\.\\s+]");
        String shortestWord = words[0];
        for (int i = 1; i < words.length; i++)
            if (words[i].length() < shortestWord.length() && words[i].length() != 0)
                shortestWord = words[i];

        return shortestWord.length();
    }

    private static void printMinWords() {
        String[] words = text.split("[\\;\\:\\!\\?\\,\\.\\s+]");
        for (int i = 0; i < words.length; i++)
            if (words[i].length() == minWordsLen)
                System.out.println(words[i]);
    }
}
