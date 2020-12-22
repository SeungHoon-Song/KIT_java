package p1;

public class ReferenceAddressEx01 {

	public static void main(String[] args) {
		Object1 refVar1 = new Object1();
		Object2 refVar2 = new Object2();
		Object2 refVar3 = new Object2();
		
		if(refVar1.irum1.equals(refVar2.irum2)) {
			System.out.println("같은 이름입니다.");
		}
		else {
			System.out.println("다른 이름입니다.");
		}
		
		if(!(refVar1.equals(refVar2))) {
			System.out.println("다른 주소입니다.");
		}
		else {
			System.out.println("같은 주소입니다.");
		}
		
		if(refVar2.equals(refVar3)) {
			System.out.println("같은 주소입니다.");
		}
		else {
			System.out.println("다른 주소입니다.");
		}
		
		if(!(refVar2.equals(refVar3))) {
			System.out.println("다른 주소입니다.");
		}
		else {
			System.out.println("같은 주소입니다.");
		}
		
		String name1 = "송승훈";
		String name2 = "송승훈";
		if(name1==name2) {
			System.out.println("같은 이름");
		}
		else {
			System.out.println("다른 이름");
		}
		String name3 = new String("송승훈");
		String name4 = new String("송승훈");
		if(name3==name4) {
			System.out.println("같은 이름");
		}
		else {
			System.out.println("다른 이름");
		}
		
		if(name3.equals(name4)) {
			System.out.println("같은 이름");
		}
		else {
			System.out.println("다른 이름");
		}
	}

}

class Object1{
	//객체1
	String irum1 = "홍길동";
	
	
}
class Object2{
	//객체2
	String irum2 = "홍길동2";
}