package q1;

import java.util.Scanner;

public class Business {
	
	
	
	
	
	public Business() {
		Computer com = new Computer();
		Printer printer = new Printer();
		Branch[] branch = new Branch[4];
		branch[0] =(Branch) (new Seoul());
		branch[1] =(Branch) ( new Kyungin());
		branch[2] =(Branch) ( new Kangwon());
		branch[3] =(Branch) ( new Jeju());
	}
	
	void printout() {
	boolean bool = true;
	Scanner sc = new Scanner(System.in);
	while(bool) {
	int i=0;
	System.out.println("------------------------");
	System.out.println("판매량관리 프로젝트");
	System.out.println("------------------------");
	System.out.println("1. 입력  2. 출력 3. 종료");
	System.out.print("선택? ");
	int num = sc.nextInt();
	if(num==1) {
		System.out.println("지사는?");
		System.out.println("1. 서울지사, 2. 경인지사, 3. 강원지사 4. 제주지사");
		System.out.print("선택은? ");
		int jisa=sc.nextInt();
		switch(jisa) {
		case 1:
			System.out.print("제품은 ?");
			System.out.println(branch[i]);
			branch[i].productname = sc.next();
			System.out.println(branch[i].productname);
			if(branch[i].productname.equals("컴퓨터")||branch[i].productname.equals("프린터")) {
				System.out.print(branch[i]+" "+branch[i].productname+" 판매량은?");
				branch[i].count=sc.nextInt();
				i++;
				System.out.print("계속 입력하시겠습니까?(y/n)");
				String conti = sc.next();
				if(conti.equals("y")||conti.equals("Y")) {
					
					continue;
				}
				else if(conti.equals("n")||conti.equals("N")) {
					break;
				}
				else {
					System.out.println("잘못 입력하였으므로 계속 입력취소");
					break;
				}
			}
			else {
				System.out.println("해당 제품은 없습니다.");
			}
			break;
			
		case 2:
			
			i++;
			break;
		case 3:
			
			i++;
			break;
		case 4:
			
			i++;
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}			
	}
	else if(num==2){
		System.out.println("-----------------------------------------------");
		System.out.println("각 지사별 판매 현황");
		System.out.println("-----------------------------------------------");
		System.out.println("지사명\t제품명\t제품가격\t판매량\t매출현황");
		System.out.println("-----------------------------------------------");
		System.out.println(branch[0]);
		
		
	}
	else if(num==3) {
		System.out.println("종료합니다.");
		break;
	}
	else
		System.out.println("잘못된 입력입니다.");
	}
}
}

//String check = sc.next();
//System.out.println("확인1");
//
//branch[i].productname = check;
//System.out.println("확인2");
