package p7;

public class ClassEx01 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Card c = new Card("HEART",3);
		Card c2 = Card.class.newInstance();
		
		Class cObj = c.getClass();
		boolean bb = cObj.isInterface();
		int cc = cObj.getModifiers();
		System.out.println(cc);
		System.out.println(bb);
		System.out.println(c);
		System.out.println(c2);
		System.out.println(cObj.getName());
		System.out.println(cObj.toGenericString());
		System.out.println(cObj.toString());
		
	}
}

final class Card{
	String kind;
	int num;
	Card(){
		this("SPADE",1);
	}
	public Card(String kind, int num) {
		this.kind=kind;
		this.num=num;
	}
	@Override
	public String toString() {
		return "kind: "+kind+", num: "+num;
	}
}
