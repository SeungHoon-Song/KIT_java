package p8;

import java.util.Stack;

//후입선출 LIFO 주차장에서 차량관리 프로그램, 나중에 입력된게 먼저 출력된다.
public class StackEx {
	
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();//Stack 클래스는 Vector의 하위클래스, List의 구현 클래스
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		Coin coin = coinBox.peek();//스택의 가장 윗쪽에 있는 것 출력하기
		System.out.println(coin.getMoney()+"peek ~~");
		coinBox.pop();
		coin = coinBox.peek();//스택의 가장 윗쪽에 있는 것 출력하기
		System.out.println(coin.getMoney()+"peek ~~");
		coinBox.pop();
		coin = coinBox.peek();//스택의 가장 윗쪽에 있는 것 출력하기
		while(!coinBox.isEmpty()){
			coin = coinBox.pop();
			System.out.println("꺼내온 동전 : "+coin.getMoney()+"원");
		}
		System.out.println("박스가 비어 있나요? "+coinBox.isEmpty());
		Stack<Car> carBox = new Stack<Car>();
		carBox.push(new Car("소나타"));
		carBox.push(new Car("k5"));
		carBox.push(new Car("그랜져"));
		carBox.push(new Car("BMW"));
		while(!carBox.isEmpty()){
			Car car = carBox.pop();
			System.out.println("출차되는 순서 : "+car.getCarkind());
		}
		
	}
}

class Coin{
	int money;
	public Coin(int money) {
		this.money=money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getMoney() {
		return money;
	}
}

class Car{
	String carkind;
	public Car(String carkind) {
		this.carkind = carkind;
	}
	public String getCarkind() {
		return carkind;
	}
}