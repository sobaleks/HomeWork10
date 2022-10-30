import java.util.Scanner;

public class Number3 {
    Scanner scanner = new Scanner(System.in);
    String arrays[] = new String[3];
    String arr[] = new String[3];
    int j = 0;
    double dlinaArray;
    void number3() {
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = scanner.nextLine();
            dlinaArray += arrays[i].length();
        }
        for (int i = 0; i < arrays.length; i++) {
            if(arrays[i].length()<dlinaArray/3){
                arr[j] = arrays[i];
                j++;
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.println(arr[i] +", длинна строки = " +arr[i].length() );
        }
    }
}
