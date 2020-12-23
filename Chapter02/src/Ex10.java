import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 원의 중심과 반지름 입력>>");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        double r1 = scanner.nextDouble();
        System.out.print("두번째 원의 중심과 반지름 입력>>");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        double r2 = scanner.nextDouble();

        int d1 = x1 - x2;
        int d2 = y2 - y2;
        double d = Math.pow(d1, 2) + Math.pow(d1, 2);

        if( d < Math.pow((r1 + r2), 2)){
            System.out.print("원이 겹칩니다");
        }
        else{
            System.out.print("원이 겹치지 않습니다");
        }

    }
}
