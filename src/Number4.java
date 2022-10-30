import java.util.Scanner;

public class Number4 {

     void vvod() {
        Scanner scanner = new Scanner(System.in);
        String stroka1 = scanner.nextLine();
        String stroka2 = scanner.nextLine();
        String stroka3 = scanner.nextLine();
        String[] line1 = stroka1.split(" ");
        String[] line2 = stroka2.split(" ");
        String[] line3 = stroka3.split(" ");
        Number4.diff(line1);
        Number4.diff(line2);
        Number4.diff(line3);
    }
    static void diff(String[] words) {
        char[] simvol = new char[100];
        for (String array :
                words) {
            boolean isDiff = true;
            checking:
            for (int i = 0; i < array.length(); i++) {
                simvol[i] = array.charAt(i);
                for (int j = 0; j < i; j++) {
                    if (simvol[i] == simvol[j]) {
                        isDiff = false;
                        break checking;
                    }
                }
            }
            if (isDiff) {
                System.out.println("Слово " + array + " не содержит одинаковых символов" );
                break;
            }
        }
        System.out.println();
    }
}
