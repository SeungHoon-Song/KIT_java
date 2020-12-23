package p7;

import java.io.Serializable;

public class ClassC implements Serializable{
	static final long serialVersionUID = 5657574;	//명시하면 내가 쓴대로,생략하면 자동으로 생성
	int fieldC1;
	int fieldC2;
	//직렬화한 파일 --> 역직렬화(0) 직렬화한 파일 -- 수정 --> 역직렬화(X) 왜? serialVersionOUD 자동생성되어 맞추어 보기 때문
	
}
//부모클래스가 직렬화되어 있기 때문에 자식 클래스인 classD도 직렬화 가능
class classD extends ClassC{
	
}
class A{
	
}
class B extends A implements Serializable{
	
}