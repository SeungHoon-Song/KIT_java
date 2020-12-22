package p1;

import java.util.*;

public class ComparatorEx {

	public static void main(String[] args) {
		Set<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());
		treeSet.add(new Fruit("포도",3000));
		treeSet.add(new Fruit("수박",10000));
		treeSet.add(new Fruit("딸기",6000));
		treeSet.add(new Fruit("포도",3000));
		Iterator<Fruit> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Fruit fruit=iterator.next();
			System.out.println(fruit);
		}

	}

}
class Fruit{
	String name;
	int price;
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
		
	}
	@Override
	public String toString() {
		return name+" "+price;
	}
}
class DescendingComparator implements Comparator<Fruit>{
	@Override
	public int compare(Fruit o1, Fruit o2) {
		//가격 오름차순
//		if(o1.price<o2.price) return -1;
//		else if(o1.price==o2.price) return 0;
//		else return 1;
		
		//과일이름 오름차훈
//		if(o1.name.hashCode()<o2.name.hashCode()) return -1;
//		else if(o1.name.hashCode()==o2.name.hashCode()) return 0;
//		else return 1;
		
		//과일이름+가격 오름차순
		if(o1.name.hashCode()+o1.price<o2.name.hashCode()+o2.price) return -1;
		else if(o1.name.hashCode()+o1.price==o2.name.hashCode()+o2.price) return 0;
		else return 1;
	}
}