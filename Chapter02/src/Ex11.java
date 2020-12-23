import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("달을 입력하세요>>");
        int month = scanner.nextInt();
        String season;

        if(month>=3 && month<=5){
            season = "봄";
        }
        else if(month>=6 && month<=8){
            season = "여름";
        }
        else if(month>=9 && month<=11){
            season = "가을";
        }
        else{
            season = "겨울";
        }
        System.out.println(season);
    }
}
