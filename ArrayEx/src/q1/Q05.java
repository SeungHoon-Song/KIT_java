package q1;

public class Q05 {

	public static void main(String[] args) {
//		로또 번호 출력하는 프로그램 작성하기
//		규칙 1~45 숫자가 랜덤하게 6개 나온다. 보너스 1개가 나온다.
		
		int[] number = new int[7];
		for(int i=0;i<number.length;i++) {
				number[i]=(int)(Math.random()*45)+1;
				for(int j=0;j<i;j++) {
					if(number[i]==number[j]) {
						i--;
					}
				}
				
		}
		System.out.print("로또 당첨 번호: ");
		for(int i=0;i<number.length-1;i++) {
			System.out.print(number[i]+" ");
		}
		System.out.print("보너스 볼: "+number[6]);

	}

}
