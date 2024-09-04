package com.lec.loopQuiz;
import java.util.Scanner;
public class Quiz2_while_srp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("가위(0),바위(1),보(2) 입력 : ");
			int you = sc.nextInt();
			
			if (you < 0 || you > 2) {
				System.out.println("가위 바위 보 중 하나를 다음엔 잘 내요");
				continue; // 다시 while 조건으로
			}
			String youStr = (you == 0) ? "가위" : (you == 1) ? "바위" : "보";
			// 컴퓨터도 0~2 난수 0 <= Math.random()*3 < 3
			int com = (int) (Math.random() * 3);
			String comStr = (com == 0) ? "가위" : (com == 1) ? "바위" : "보";
			System.out.println("당신은 " + youStr + ", 컴퓨터는 " + comStr);
			// 당신이 이겼습니다 || 컴퓨터가 이겼습니다 || 비겼습니다 출력
			if (you == com) {
				System.out.println("비겼습니다 -.-");
			} else if ((you+2)%3 == com) {
				System.out.println("★ 당신이 이겼습니다 ★");
				break ;
			} else if ((you+1)%3 == com) {
				System.out.println("컴퓨터가 이겼습니다 ㅠㅠ");
			} // 결과
		}while(true); // do~while
	}
}