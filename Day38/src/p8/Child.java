package p8;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Child extends Parent implements Serializable{
	public String field2;
	//자식객체를 직렬화할 때 자동호출됨
	//oos.writeObject(child);	ObjectOutputStream out = child
	private void writeObject(ObjectOutputStream out) throws IOException{
		out.writeUTF(field1);	//부모 객체의 필드값을 출력함
		out.defaultWriteObject(); //자식 객체의 필드값을 직렬화
	
	}
	//자동호출됨
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
		field1 = in.readUTF();	//부모 객체의 필드값을 읽어옴
		in.defaultReadObject();	//자식 객체의 필드값을 역직렬화
		
		
	}

}
