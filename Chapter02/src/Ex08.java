import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("점 (x1,y1)의 좌표를 입력하십시오>>");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.print("점 (x2,y2)의 좌표를 입력하십시오>>");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        if(inRect(x1, y1, 100, 100, 200, 200) || inRect(x2, y2, 100, 100, 200, 200)){
            System.out.print("충돌합니다.");
        }
        else{
            System.out.print("충돌하지 않습니다.");
        }
    }

    public static boolean inRect(int x, int y, int x1, int y1, int x2, int y2){
        if((x>=x1 && x<=x2) && (y>=y1 && y<=y2))
            return true;
        else
            return false;
    }
}
