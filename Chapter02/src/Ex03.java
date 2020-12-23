import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("금액을 입력하십시오>>");
        int won = scanner.nextInt();

        System.out.println("오만원권 " + won/50000 + "매");
        won -= won/50000 * 50000;
        System.out.println("만원권 " + won/10000 + "매");
        won -= won/10000 * 10000;
        System.out.println("오천원권 " + won/5000 + "매");
        won -= won/5000 * 5000;
        System.out.println("천원권 " + won/1000 + "매");
        won -= won/1000 * 1000;
        System.out.println("오백원 " + won/500 + "개");
        won -= won/500 * 500;
        System.out.println("백원 " + won/100 + "개");
        won -= won/100 * 100;
        System.out.println("나머지 " + won+ "원");

    }
}
