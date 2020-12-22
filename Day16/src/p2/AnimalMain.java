package p2;

public class AnimalMain {
	public static void main(String[] args) {
		//강아지클래스 객체화
		Dog dog = new Dog();
		//고양이클래스 객체화
		Cat cat = new Cat();
		//강아지클래스 다형성
		Animal animal1 = new Dog();
		//고양이클래스 다형성
		Animal animal2 = new Cat();
		//동물클래스 객체화
//		Animal animal3 = new Animal();
		
		//출력 고양이는 야옹야옹!!하고 웁니다. 고양이는 숨을 쉽니다. 강아지는 멍멍멍멍 하고 짖습니다. 강아지는 숨을 쉽니다.
		System.out.print(cat.toString()+"는 ");
		animal2.sound();
		System.out.print("하고 웁니다. "+cat.toString()+"는 ");
		animal2.breathe();
		System.out.print(dog+"는 ");
		dog.sound();
		System.out.print("하고 짖습니다. "+dog+"는 ");
		dog.breathe();
	}
}
