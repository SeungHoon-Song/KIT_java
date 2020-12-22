package p4;

import java.util.Random;
import java.util.stream.DoubleStream;

public class RandomEx {

	public static void main(String[] args) {
		int[] selectNumber = new int[6];
		Random r1 = new Random(3);
		System.out.print("선택번호 : ");
		for(int i=0;i<6;i++) {
			selectNumber[i] = r1.nextInt(45)+1;
			System.out.print(selectNumber[i]+" ");
		}
		System.out.println();
		
	}

}