package stockmanagement;

import java.util.Scanner;

public class SMBusiness {
	Electronics[] elec = {new Airconditioner(),new Desktop(), new Microwave(), new Notebook(), new Refrigerator(), new Tv(), new Vacuumcleaner()};
	Scanner sc = new Scanner(System.in);
	
	void view() {
		boolean flag = true;
		int select;
		while(flag) {
			System.out.println("◈◈◈◈코리아  전자◈◈◈◈");
			System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
			System.out.println("◈     [1] 제  품   등  록   ◈");
			System.out.println("◈     [2] 제품별  재고량   ◈");
			System.out.println("◈     [3] 재  고   수  정   ◈");
			System.out.println("◈     [4] 제  품   삭  제   ◈");
			System.out.println("◈     [5] 전체 재고 조회   ◈");
			System.out.println("◈     [0] 프로그램  종료   ◈");
			System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
			System.out.print("메뉴를 선택해주세요 ▶▶  ");
			select=sc.nextInt();
			switch(select) {
			case 1:
				input();
				break;
			case 2:
				selectoutput();
				break;
			case 3:
				modify();
				break;
			case 4:
				remove();
				break;
			case 5:
				output();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				flag=false;
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}//end view
	void input() {
		boolean flag=false;
		System.out.println("제품번호는 다음과 같이 시작합니다.(소문자도가능)\nA. 에어컨   D. 데스크탑   M. 전자레인지   N. 노트북   R. 냉장고   T. TV   V. 청소기");
		System.out.print("제품명 : ");
		String productName = sc.next();
		System.out.print("제품번호 : ");
		String productNum = sc.next();
		productNum=productNum.toUpperCase();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		System.out.print("수량 : ");
		int count = sc.nextInt();
		for(int i=0;i<elec.length;i++) {
			for(int j=0;j<elec[i].productNum.length;j++) {
			if(productNum.equals(elec[i].productNum[j])) {
				System.out.println("이미 존재하는 제품번호입니다. 등록을 취소합니다.");
				flag=true;
				break;
			}
			else {
				continue;
			}
			}
		}
		if(flag) {
		}else {
				char codeNum = productNum.charAt(0);
				codeNum=Character.toUpperCase(codeNum);
				switch(codeNum) {

				case 'A':
					elec[0].input(productName, productNum, price, count);
					break;

				case 'D':
					elec[1].input(productName, productNum, price, count);
					break;

				case 'M':
					elec[2].input(productName, productNum, price, count);
					break;

				case 'N':
					elec[3].input(productName, productNum, price, count);
					break;

				case 'R':
					elec[4].input(productName, productNum, price, count);
					break;

				case 'T':
					elec[5].input(productName, productNum, price, count);
					break;

				case 'V':
					elec[6].input(productName, productNum, price, count);
					break;
				default:
					System.out.println("제품번호를 제대로 입력해주세요.");
					break;		
				}
		}
		
	}//end input
	
	void selectoutput() {
		System.out.println("1. 에어컨   2. 데스크탑   3. 전자레인지   4. 노트북   5. 냉장고   6. TV   7. 청소기");
		System.out.print("제품종류를 선택해주세요  ▶▶  ");
		int productchoice=sc.nextInt();
		switch(productchoice) {
		case 1:
			System.out.println("에어컨------------------------------");
			System.out.println("제품명\t제품번호\t가격\t수량");
			System.out.println("----------------------------------");
			elec[0].output();
			break;
		case 2:
			System.out.println("데스크탑----------------------------");
			System.out.println("제품명\t제품번호\t가격\t수량");
			System.out.println("----------------------------------");
			elec[1].output();
			break;
		case 3:
			System.out.println("전자레인지---------------------------");
			System.out.println("제품명\t제품번호\t가격\t수량");
			System.out.println("----------------------------------");
			elec[2].output();
			break;
		case 4:
			System.out.println("노트북------------------------------");
			System.out.println("제품명\t제품번호\t가격\t수량");
			System.out.println("----------------------------------");
			elec[3].output();
			break;
		case 5:
			System.out.println("냉장고------------------------------");
			System.out.println("제품명\t제품번호\t가격\t수량");
			System.out.println("----------------------------------");
			elec[4].output();
			break;
		case 6:
			System.out.println("TV--------------------------------");
			System.out.println("제품명\t제품번호\t가격\t수량");
			System.out.println("----------------------------------");
			elec[5].output();
			break;
		case 7:
			System.out.println("청소기------------------------------");
			System.out.println("제품명\t제품번호\t가격\t수량");
			System.out.println("----------------------------------");
				elec[6].output();
		default:
			System.out.println("잘못된 제품군입니다.");
			break;
		}
	}//end selectoutput
	
	void modify() {
		System.out.println("현재 등록된 제품들입니다.");
		output();
		System.out.print("수정하실 제품번호를 입력하세요 ▶▶  ");
		String productNum = sc.next();
		System.out.println("1. 단품입고\t2. 단품출고\t3. 전체수정");
		int inoutput=sc.nextInt();
		if(inoutput==1) {
			for(int i=0;i<elec.length;i++) {
				for(int j=0;j<elec[i].productNum.length;j++) {
				if(productNum.equals(elec[i].productNum[j])) {
					elec[i].count[j]+=1;
					System.out.println("단품 입고처리 되었습니다.");
					break;
				}
				}
			}
		}
		else if(inoutput==2) {
			for(int i=0;i<elec.length;i++) {
				for(int j=0;j<elec[i].productNum.length;j++) {
				if(productNum.equals(elec[i].productNum[j])) {
					if(elec[i].count[j]<1) {
						System.out.println("해당 재고 부족으로 출고할 수 없습니다.");
						break;
					}
					else {
					elec[i].count[j]-=1;
					System.out.println("단품 출고처리 되었습니다.");
					break;
					}
				}
				}
			}
		}
		else if(inoutput==3) {
		productNum=productNum.toUpperCase();
		for(int i=0;i<elec.length;i++) {
			for(int j=0;j<elec[i].productNum.length;j++) {
			if(productNum.equals(elec[i].productNum[j])) {
				System.out.print("수정하실 제품명 : ");
				elec[i].productName[j]=sc.next();
				System.out.print("수정하실 제품번호 : ");
				elec[i].productNum[j]=sc.next();
				System.out.print("수정하실 가격: ");
				elec[i].price[j]=sc.nextInt();
				System.out.print("수정하실 개수: ");
				elec[i].count[j]=sc.nextInt();
				System.out.println("수정 완료!");
				break;
			}
		}
		}	
	}
		else {
			System.out.println("잘못된 입력입니다.");
		}
	}//end modify
	
	void remove() {
		System.out.println("현재 등록된 제품들입니다.");
		output();
		System.out.print("삭제하실 제품번호를 입력하세요 ▶▶  ");
		String productNum = sc.next();
		productNum=productNum.toUpperCase();
		for(int i=0;i<elec.length;i++) {
			for(int j=0;j<elec[i].productNum.length;j++) {
			if(productNum.equals(elec[i].productNum[j])) {
				elec[i].productName[j]=null;
				elec[i].productNum[j]=null;
				elec[i].price[j]=0;
				elec[i].count[j]=0;
				System.out.println("삭제 완료!");
				break;
			}
			}
			}
	}
	
	void output() {
		System.out.println("제품명\t제품번호\t가격\t수량");
		System.out.println("----------------------------------");
		for(int i=0;i<elec.length;i++) {
					elec[i].output();
				}
		}//end output
}
