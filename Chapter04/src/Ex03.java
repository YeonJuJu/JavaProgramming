import java.util.ArrayList;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){
        Concert concert = new Concert();
        concert.run();
    }
}


class Concert{
    Scanner scanner = new Scanner(System.in);

    ArrayList<String> s = new ArrayList<>(10);
    ArrayList<String> a = new ArrayList<>(10);
    ArrayList<String> b = new ArrayList<>(10);

    public Concert(){
        for(int i=0;i<10;i++){
            s.add("---");
            a.add("---");
            b.add("---");
        }
    }

    public void run(){
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        while(true){
            System.out.print("예약: 1, 조회: 2, 취소: 3, 끝내기: 4 >> ");
            int option = scanner.nextInt();
            switch (option){
                case 1:
                    reservation();
                    break;
                case 2:
                    show();
                    break;
                case 3:
                    cancel();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("잘못 입력되었습니다. 다시 입력해주세요");
            }
        }
    }

    public void show(){
        System.out.println("-----------------------------------");
        System.out.print("S>> " );
        for(int i=0;i<10;i++){
            System.out.print( s.get(i) + "  ");
        }
        System.out.println();
        System.out.print("A>> " );
        for(int i=0;i<10;i++){
            System.out.print( a.get(i) + "  ");
        }
        System.out.println();
        System.out.print("B>> " );
        for(int i=0;i<10;i++){
            System.out.print( b.get(i) + "  ");
        }
        System.out.println();
        System.out.println("-----------------------------------");
    }

    public void show(int seat){
        if(seat == 1){
            System.out.print("S>> ");
            for(int i=0;i<10;i++){
                System.out.print(s.get(i) + "   ");
            }
            System.out.println();
        }else if(seat == 2){
            System.out.print("A>> ");
            for(int i=0;i<10;i++){
                System.out.print(a.get(i) + "   ");
            }
            System.out.println();
        }else if(seat == 3){
            System.out.print("B>> ");
            for(int i=0;i<10;i++){
                System.out.print(b.get(i) + "   ");
            }
            System.out.println();
        }else{
            System.out.println("숫자를 잘못입력하셨습니다. 처음으로 되돌아갑니다.");
        }
    }

    public void reservation(){
        System.out.print("좌석을 선택하십시오 (S:1, A:2, B:3) : ");
        int seat = scanner.nextInt();
        if(seat == 1){
            this.show(1);
            System.out.print("이름>> ");
            String name = scanner.next();
            System.out.print("좌석번호>> ");
            int seatNum = scanner.nextInt();
            this.s.set(seatNum, name);
            System.out.println("예약되었습니다.");
        }else if(seat == 2){
            this.show(2);
            System.out.print("이름>> ");
            String name = scanner.next();
            System.out.print("좌석번호>> ");
            int seatNum = scanner.nextInt();
            this.a.set(seatNum, name);
            System.out.println("예약되었습니다.");
        }else if(seat == 3){
            this.show(3);
            System.out.print("이름>> ");
            String name = scanner.next();
            System.out.print("좌석번호>> ");
            int seatNum = scanner.nextInt();
            this.b.set(seatNum, name);
            System.out.println("예약되었습니다.");
        }else{
            System.out.println("숫자를 잘못입력하셨습니다. 처음으로 되돌아갑니다.");
        }
    }

    public void cancel(){
        System.out.print("좌석을 선택하십시오 (S:1, A:2, B:3) : ");
        int seat = scanner.nextInt();
        if(seat == 1){
            this.show(1);
            System.out.print("이름>> ");
            String name = scanner.next();
            int index = this.s.indexOf(name);
            this.s.set(index, "---");
            System.out.println("취소되었습니다.");
        }else if(seat == 2){
            this.show(2);
            System.out.print("이름>> ");
            String name = scanner.next();
            int index = this.a.indexOf(name);
            this.a.set(index, "---");
            System.out.println("취소되었습니다.");
        }else if(seat == 3){
            this.show(3);
            System.out.print("이름>> ");
            String name = scanner.next();
            int index = this.b.indexOf(name);
            this.b.set(index, "---");
            System.out.println("취소되었습니다.");
        }else{
            System.out.println("숫자를 잘못입력하셨습니다. 처음으로 되돌아갑니다.");
        }
    }
}