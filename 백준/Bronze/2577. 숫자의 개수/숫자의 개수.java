import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = (sc.nextInt() * sc.nextInt() * sc.nextInt());
        String s = Integer.toString(n);

        for(int i = 0; i < 10; i++){
            int count = 0;
            for(int j = 0; j < s.length(); j++){
                if ((s.charAt(j) - '0') == i) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
