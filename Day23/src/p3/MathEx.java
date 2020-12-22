package p3;

public class MathEx {
	public static void main(String[] args) {
		System.out.println(Math.min(10, 20));
		System.out.println(Math.max(10, 20));
		System.out.println((int)(Math.random()*10)+1);
		
		int one=0,two=0,three=0,four=0,five=0,six=0;
		for(int i=0;i<1000;i++) {
			int dice = (int)(Math.random()*6)+1;
			switch(dice) {
			case 1:
				one++;
				break;
			case 2:
				two++;
				break;
			case 3:
				three++;
				break;
			case 4:
				four++;
				break;
			case 5:
				five++;
				break;
			case 6:
				six++;
				break;
			default:
				break;
			}
			
		}
		System.out.println("1나온 횟수 : "+one);
		System.out.println("2나온 횟수 : "+two);
		System.out.println("3나온 횟수 : "+three);
		System.out.println("4나온 횟수 : "+four);
		System.out.println("5나온 횟수 : "+five);
		System.out.println("6나온 횟수 : "+six);
	}
}
