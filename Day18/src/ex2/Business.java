package ex2;

import java.util.Scanner;

public class Business {
	int i=0;
	Scanner sc = new Scanner(System.in);
	Wireless wireless = new Wireless() {
		
		@Override
		public int total(int time) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public int discount() {
			// TODO Auto-generated method stub
			return 0;
		}
	};
	
	public void view() {
		boolean flag = true;
		while(flag) {
			System.out.println("----------------");
			System.out.println("무선통신요금 프로그램");
			System.out.println("----------------");
			System.out.println("1.입력\t2.출력\t3.종료");
			System.out.print("-->> ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				input();
				break;
			case 2:
				output();
				break;
			case 3:
				flag=false;
				break;
			default:
				System.out.println("다시 입력해주세요");
				break;
			}
		}
	}//end view
	public void input() {
		System.out.println("----입력하기----");
		System.out.print("고객명 : ");
		String name = sc.next();
		wireless.name[i]=name;
		System.out.print("등급코드: ");
		String grade=sc.next();
		System.out.print("사용시간: ");
		int time=sc.nextInt();
		wireless.time[i]=time;
		switch(grade) {
		case "A":
		case "a":
			A a = new A();
			wireless.saleMoney[i]=a.discount();
			wireless.totalMoney[i]=a.total(time);
			wireless.grade[i]=a.grade;
			wireless.hour[i]=a.hour;
			wireless.basicFare[i]=a.basicFare;
			break;
		case "B":
		case "b":
			B b = new B();
			wireless.saleMoney[i]=b.discount();
			wireless.totalMoney[i]=b.total(time);
			wireless.grade[i]=b.grade;
			wireless.hour[i]=b.hour;
			wireless.basicFare[i]=b.basicFare;
			break;
		case "C":
		case "c":
			C c = new C();
			wireless.saleMoney[i]=c.discount();
			wireless.totalMoney[i]=c.total(time);
			wireless.grade[i]=c.grade;
			wireless.hour[i]=c.hour;
			wireless.basicFare[i]=c.basicFare;
			break;
		case "D":
		case "d":
			D d = new D();
			wireless.saleMoney[i]=d.discount();
			wireless.totalMoney[i]=d.total(time);
			wireless.grade[i]=d.grade;
			wireless.hour[i]=d.hour;
			wireless.basicFare[i]=d.basicFare;
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
		i++;
	}//end input
	public void output() {
		System.out.println("고객명\t등급코드\t시간당단가\t기본요금\t사용시간\t할인요금\t이번달 통신요금");
		for(int j=0;j<wireless.hour.length;j++) {
			if(wireless.grade[j]!=null) {
				System.out.println(wireless.name[j]+"\t"+wireless.grade[j]+"\t"+wireless.hour[j]+"\t"+wireless.basicFare[j]+"\t"+wireless.time[j]+"\t"+wireless.saleMoney[j]+"\t"+wireless.totalMoney[j]);
			}
		}
	}//end output
}
