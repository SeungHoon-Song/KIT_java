package p7;

import java.io.Serializable;
//직렬화 하려는 클래스를 구현하기 implements Serializable
public class ClassA implements Serializable{
	int field1;
	ClassB field2 = new ClassB();
	static int field3;
	transient int field4;

}
