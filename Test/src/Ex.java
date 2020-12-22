
public class Ex {

	public static void main(String[] args) {
		String ssn = "010624-a230123";
		char sex = ssn.charAt(7);
		switch (sex) {
		case 'a':
		case '3':
		System.out.println("남자 입니다.");
		break;
		case '2':
		case '4':
		System.out.println("여자 입니다.");
		break;
		}
	}
}
