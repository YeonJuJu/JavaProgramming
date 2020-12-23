import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int won;
        int dollar = 1100;

        System.out.print("원화를 입력하세요(단위 원)>>");
        won = scanner.nextInt();

        System.out.println(won + "원은 $" + (double)won/dollar +"입니다.");

    }
}
