import java.util.Scanner;

public class Dlinna  {
    Scanner scanner = new Scanner(System.in);
    String arrays[] = new String[3];

    String vvod() {
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = scanner.nextLine();
        }
        String max = arrays[0];
        String min = arrays[0];
        for (int j = 0; j < arrays.length; j++) {
            if (arrays[j].length() > max.length()) {
                max = arrays[j];
            } else if (arrays[j].length() < min.length()) {
                min = arrays[j];
            }
        }
        return " Короткая строка = " + min + " Количество её элементов равно " + min.length() + "\n" +
                " Длинная строка " + max + " Колличество элементов равно " + max.length();
    }
}
