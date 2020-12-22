package p7;

public interface ObjectInter {
	//상수 MAX = 99999 MIN = -99999
	static final int MAX=99999;
	static final int MIN=-99999;
	//추상메소드 calc() avg()
	public abstract void calc();
	public abstract void avg();
	//default number() 
	default void number() {}
	//static stnumber()
	static void stnumber() {}
}
