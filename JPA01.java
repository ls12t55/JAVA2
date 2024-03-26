import java.util.Scanner;

public class JPA01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入您的姓名: ");
        String name = scanner.nextLine();

        System.out.print("請輸入您的身高: ");
        int height = scanner.nextInt();

        System.out.print("請輸入您的體重: ");
        int weight = scanner.nextInt();

        System.out.printf("%s, 您的 BMI 值為 %.2f\n", name, (double) weight / height / height * 10000);
    }
}
