public class Hilo3 extends Thread {
    String word;
    int result;

    public Hilo3(String word) {
        this.word = word;
    }

    public void run() {
        this.result = contarConsonantes(this.word, 0);
        System.out.println(this.result);
    }

    public static int contarConsonantes(String word, int counter) {
        if (counter >= word.length()) {
            return 0;
        } else {
            return !isVowel(word.charAt(counter)) ? contarConsonantes(word, counter + 1) + 1 : contarConsonantes(word, counter + 1);
        }
    }

    public static boolean isVowel(char current) {
        current = Character.toLowerCase(current);
        return current == 'a' || current == 'e' || current == 'i' || current == 'o' || current == 'u';
    }
}
