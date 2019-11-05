package dispenser.exec;

import java.util.Scanner;

public class DispenserEx {

	/*
	 * 자판기
	 * 
	 * 사용자에게 금액을 입력받아 음료를 선택하고 거스름돈과 음료를 콘솔에 출력
	 * 
	 * 조건 1. main에 모든 것을 한꺼번에 만들것. 메소드를 추가로 만들지 말것 2. 예외처리 (음료 3종류가 있어서 1, 2, 3을
	 * 선택받는다고 가정했을 때 4번이 눌린다든가의 경우) 는 필요없다. 만들면 좋고
	 */
	public static void main(String[] args) {

		/*
		 * 1. 사용자에게 금액을 입력받는다 2. 투입된 돈을 계산하여 얼마인지 확인한다 3. 확인된 금액을 출력하여 보여준다
		 * 
		 * 4. 음료 3가지 중 하나를 입력받는다 5-1. 투입된 금액이 선택한 음료의 값보다 큰 경우 음료를 주고 투입된 금액에서 음료의 값을 뺀
		 * 나머지 금액(거스름돈)을 준다 5-2. 투입된 금액이 선택한 음료의 값보다 작은 경우 음료의 값과 투입된 금액의 값을 출력하고 모든 돈을
		 * 반환한다.
		 */

		// 돈을 입력받을 Scanner 선언
		Scanner scan = new Scanner(System.in);

		// 음료수를 변수로 선언
		int cider = 500;
		int mineralWater = 1000;
		int lemonade = 1500;

		System.out.println("금액을 투입하세요.");

		int money = 0;
		money = Integer.valueOf(scan.nextLine());
		System.out.println("받은 금액은 " + money + "원 입니다.");
		System.out.println();
		System.out.println("음료수를 선택하세요.");
		System.out.println("현재 판매되고 있는 음료수는");
		System.out.println("1.사이다(500), 2.생수(1000), 3.레몬에이드(1500) 입니다.");
		System.out.println("음료 번호를 눌러 선택하세요. >> ");

		// 투입된 금액이 선택한 음료의 값보다 큰 경우
		// 음료를 주고
		// 투입된 금액에서 음료의 값을 뺀 나머지 금액(거스름돈)을 준다
		int key = Integer.valueOf(scan.nextLine());

		if (key >= 4 || key == 0) {
			System.out.println("음료는 1.사이다 2.생수 3.레몬에이드 중에 선택해 주세요.");

		}
		
		else if (key == 1) {

			System.out.println("사이다를 고르셨습니다.");
			if (money >= cider) {
				System.out.println("선택하신 사이다와 거스름돈" + (money - cider) + "원을 받으세요.");
			} else if (money < cider) {
				System.out.println("투입하신 금액이 선택한 음료의 값보다 작습니다.");
				System.out.println("거스름돈 " + (money) + "원을 받으세요.");
			}

		} else if (key == 2) {
			System.out.println("생수를 고르셨습니다.");
			if (money >= mineralWater) {
				System.out.println("선택하신 생수와 거스름돈" + (money - mineralWater) + "원을 받으세요.");
			} else if (money < mineralWater) {
				System.out.println("투입하신 금액이 선택한 음료의 값보다 작습니다.");
				System.out.println("거스름돈 " + (money) + "원을 받으세요.");

			}
		} else if (key == 3) {
			System.out.println("레몬에이드를 고르셨습니다.");
			if (money >= lemonade) {
				System.out.println("선택하신 생수와 거스름돈" + (money - lemonade) + "원을 받으세요.");
			}
			if (money < lemonade) {
				System.out.println("투입하신 금액이 선택한 음료의 값보다 작습니다.");
				System.out.println("거스름돈 " + (money) + "원을 받으세요.");

			}
		}

	}

}
