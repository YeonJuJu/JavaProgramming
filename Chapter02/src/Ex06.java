import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("1~99 사이의 정수를 입력하시오>>");
        int num = scanner.nextInt();

        if(num/10 != 0 && (num/10)%3 == 0) {
            if ((num % 10) % 3 == 0)
                System.out.println("박수 짝짝");
            else
                System.out.println("박수 짝");
        }
        else
            if((num%10)%3 == 0)
                System.out.println("박수 짝");
    }
}
