import java.util.Scanner;
//thay doi lan 2
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên của bạn: ");
        String hoTen = scanner.nextLine();
        System.out.println("Họ tên của bạn là: " + hoTen);
    }
}