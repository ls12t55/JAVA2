import java.util.Scanner;

public class JPA02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入一個正整數: ");
        int num = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.printf("%d 的 1 到 %d 的總和為 %d\n", num, num, sum);
    }
}
