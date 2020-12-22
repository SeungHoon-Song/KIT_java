package p7;

public class ButtonEx {
	int a = 20;
	static int sa = 30;
	void aMethod() {
		new OnClickListener() {
			@Override
			public void off() {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void on() {
				// TODO Auto-generated method stub
				
			}
		};
	}
	static void saMethod() {
		
	}
	
	interface OnClickListener{
		default void dMethod() {
			//a=a+10;
			sa=sa+20;
			//aMethod();
			saMethod();
		}
		void off();
		void on();
		
	}
}
