import java.util.Scanner;

public class Number5 {
    Scanner scanner = new Scanner(System.in);
    String arrays[] = new String[3];
    String line;
    StringBuilder sb = new StringBuilder();
    StringBuilder sb_1 = new StringBuilder();

    void number5() {
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = scanner.nextLine();
        }
        for (int i = 0; i < arrays.length; i++) {
            line = arrays[i];
            String lines[] = line.split("[^0-9]");
            for (int j = 0; j < lines.length; j++) {
                sb = new StringBuilder(lines[j]);
                sb_1 = new StringBuilder(lines[j]);
                sb.reverse();
                String f = String.valueOf(sb);
                String d = String.valueOf(sb_1);
                boolean p = f.equalsIgnoreCase(d);
                 if (p == true & f.length()>1) {
                  System.out.println(sb_1);
                }
            }
        }
    }
}