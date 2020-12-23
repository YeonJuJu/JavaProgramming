import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 3개 입력>>");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int max = Math.max(num1, num2);
        max = Math.max(max, num3);

        if(max == num1){
            if(max < num2 + num3)
                System.out.println("삼각형이 됩니다.");
            else
                System.out.println("삼각형이 되지 않습니다.");
        }
        else if(max == num2){
            if(max < num1 + num3)
                System.out.println("삼각형이 됩니다.");
            else
                System.out.println("삼각형이 되지 않습니다.");
        }
        else{
            if(max < num2 + num1)
                System.out.println("삼각형이 됩니다.");
            else
                System.out.println("삼각형이 되지 않습니다.");
        }
    }
}
