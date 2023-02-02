import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    Scanner sc = new Scanner(System.in);
System.out.println("Không đúng! Mời bạn nhập lại mật khẩu: ");
    String password = sc.nextLine();
while (!password.equals("vung oi mo ra")) {
        System.out.println("Không đúng! Mời bạn nhập lại mật khẩu: ");
        password = sc.nextLine();
    }
}
}