package ex01;

public class Ex03 {
	public static void main(String[] args) {
		int i=1,j=100;
		for(;;) {
			if(!(i<101 && j>10)) break;
			System.out.printf("i=%3d, j=%3d",i,j);
			i++;
			j+=10;

		}
	}
}
