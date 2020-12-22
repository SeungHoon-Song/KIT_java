package delivery_test;

import java.util.Scanner;

public class Business {
	DeliveryClass dc = new DeliveryClass() {
		
		@Override
		public int totalcost(int amount,int time) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public int timecost(int time) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public int amountcost(int amount) {
			// TODO Auto-generated method stub
			return 0;
		}
	};
	
	Scanner sc = new Scanner(System.in);
	int i=0;
	Kangeast ke = new Kangeast();
	Kangwest kw = new Kangwest();
	Kangsouth ks = new Kangsouth();
	Kangnorth kn =new Kangnorth();
	
	void view() {
		boolean flag=true;
		while(flag) {
		int num;
		System.out.println("-------------------------");
		System.out.println("배달 현황 프로그램");
		System.out.println("-------------------------");
		System.out.println("프로그래머 : 송승훈\n");
		System.out.println("1. 입력\t2. 출력\t3. 종료");
		System.out.print("선택 ==> ");
		num=sc.nextInt();
		switch(num) {
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
			System.out.println("잘못된 입력");
			break;
		}	
		}
	}//end view
	void input() {
		System.out.print("배달지구(1. 강동지구, 2. 강서지구 3. 강남지구 4. 강북지구) 선택 ? ");
		int local=sc.nextInt();
		switch(local) {
		case 1:
			dc.local[i]=ke.local;
			dc.name[i]=ke.name;
			System.out.print("배달시간? ");
			int time=sc.nextInt();
			dc.time[i]=time;
			System.out.print("배달량 개수? ");
			int amount=sc.nextInt();
			dc.amount[i]=amount;
			dc.total[i]=ke.totalcost(time, amount);
			break;
		case 2:
			dc.local[i]=kw.local;
			dc.name[i]=kw.name;
			System.out.print("배달시간? ");
			int time1=sc.nextInt();
			dc.time[i]=time1;
			System.out.print("배달량 개수? ");
			int amount1=sc.nextInt();
			dc.amount[i]=amount1;
			dc.total[i]=kw.totalcost(time1, amount1);
			break;
		case 3:
			dc.local[i]=ks.local;
			dc.name[i]=ks.name;
			System.out.print("배달시간? ");
			int time2=sc.nextInt();
			dc.time[i]=time2;
			System.out.print("배달량 개수? ");
			int amount2=sc.nextInt();
			dc.amount[i]=amount2;
			dc.total[i]=ks.totalcost(time2, amount2);
			break;
		case 4:
			dc.local[i]=kn.local;
			dc.name[i]=kn.name;
			System.out.print("배달시간? ");
			int time3=sc.nextInt();
			dc.time[i]=time3;
			System.out.print("배달량 개수? ");
			int amount3=sc.nextInt();
			dc.amount[i]=amount3;
			dc.total[i]=kn.totalcost(time3, amount3);
			break;
		default:
			System.out.println("잘못된 입력");
			break;
		}
		i++;
		
	}//end input
	void output() {
		System.out.println("--------");
		System.out.println("해당지구\t배달담당\t배달시간\t배달량\t배달요금");
		System.out.println("-----------------------------");
		for(int j=0;j<10;j++) {
			if(dc.name[j]!=null) 
		System.out.println(dc.local[j]+"\t"+dc.name[j]+"\t"+dc.time[j]+"\t"+dc.amount[j]+"\t"+dc.total[j]);
		}
		
	}//end output
}
