
import java.util.Scanner;

public class Vozrastanie {
    Scanner scanner = new Scanner(System.in);
    String arrays[] = new String[3];

    void vvod() {
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = scanner.nextLine();
        }
        for (int i = arrays.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrays[j].length() > arrays[j + 1].length()) {
                    String tmp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
    }
}
