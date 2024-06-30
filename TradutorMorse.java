import java.util.Scanner;

public class TradutorMorse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o código: ");
            String input = sc.nextLine().toLowerCase();
            String[] caracter = input.split(" ");
            char[] frases = new char[input.length()];

            char[] alfa = {
                    'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                    'u',
                    'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };

            String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
                    "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
                    ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----" };

            StringBuilder traduzir = new StringBuilder();

            for (String caracters : caracter) {
                if (caracters.equals("")) {
                    traduzir.append(" ");
                } else {

                    for (int j = 0; j < morse.length; j++) {
                        if (morse[j].equals(caracters)) {
                            traduzir.append(alfa[j]);

                            break;
                        }
                    }
                }

            }

            for (int x = 0; x < input.length(); x++) {
                for (int j = 0; j < alfa.length; j++) {
                    frases[x] = input.charAt(x);
                    if (frases[x] == alfa[j]) {
                        traduzir.append(morse[j] + " ");
                        break;
                    }
                }

            }
            System.out.println("Tradução: " + traduzir);
        }
    }
}
