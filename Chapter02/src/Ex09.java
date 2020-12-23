import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("원의 중심과 반지름 입력>>");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        double r = scanner.nextDouble();
        System.out.print("점 입력>>");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if((x-a)*(x-a) + (y-b)*(y-b) > Math.sqrt(r)){
            System.out.print("점 (" + a + "," + a + ")는 원 안에 없습니다.");
        }
        else{
            System.out.print("점 (" + a + "," + a + ")는 원 안에 있습니다.");
        }

    }
}
