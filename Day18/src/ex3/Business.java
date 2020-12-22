package ex3;

import java.util.Scanner;

public class Business {
	Scanner sc = new Scanner(System.in);
	Wireless wl = new Wireless() {
		
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
	int i=0;
	
	void start() {
		int choice;
		boolean flag=true;
		while(flag) {
			System.out.println("1. 등록\t2. 출력\t3. 종료");
			System.out.print("-->> ");
			choice=sc.nextInt();
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
				System.out.println("잘못 입력");
				break;
			}
		}
	}
	void input() {
		System.out.print("고객명 : ");
		String name=sc.next();
		wl.name[i]=name;
		System.out.print("등급코드 : ");
		String grade=sc.next();
		System.out.print("사용시간 : ");
		int time=sc.nextInt();
		wl.time[i]=time;
		switch(grade) {
		case "A":
		case "a":
			AGrade a = new AGrade();
			
			wl.grade[i]=a.grade;
			wl.hourper[i]=a.hourper;
			wl.basicFee[i]=a.basicFee;
			wl.saleFee[i]=a.discount();
			wl.totalFee[i]=a.total(time);
			break;
		case "B":
		case "b":
			BGrade b = new BGrade();
			
			wl.grade[i]=b.grade;
			wl.hourper[i]=b.hourper;
			wl.basicFee[i]=b.basicFee;
			wl.saleFee[i]=b.discount();
			wl.totalFee[i]=b.total(time);
			break;
		case "C":
		case "c":
			CGrade c = new CGrade();
			
			wl.grade[i]=c.grade;
			wl.hourper[i]=c.hourper;
			wl.basicFee[i]=c.basicFee;
			wl.saleFee[i]=c.discount();
			wl.totalFee[i]=c.total(time);
			break;
		case "D":
		case "d":
			DGrade d = new DGrade();
			wl.grade[i]=d.grade;
			wl.hourper[i]=d.hourper;
			wl.basicFee[i]=d.basicFee;
			wl.saleFee[i]=d.discount();
			wl.totalFee[i]=d.total(time);
			break;
		default:
			System.out.println("잘못입력");
			break;
		}i++;
	}
	public void output() {
		System.out.println("고객명\t등급코드\t시간당단가\t기본요금\t사용시간\t할인요금\t이번달 통신요금");
		for(int j=0;j<wl.hourper.length;j++) {
			if(wl.grade[j]!=null) {
				System.out.println(wl.name[j]+"\t"+wl.grade[j]+"\t"+wl.hourper[j]+"\t"+wl.basicFee[j]+"\t"+wl.time[j]+"\t"+wl.saleFee[j]+"\t"+wl.totalFee[j]);
			}
		}
	}//end output
}
