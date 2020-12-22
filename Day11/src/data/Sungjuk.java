package data;

public class Sungjuk {
	//멤버 필드는 외부에서 접근하지 못하게 막는다.
	private int hakbun;		//학번
	private String name;	//이름
	private String dept;	//학과
	private int kor;
	private int eng;
	private int total;
	private double avg;
	private int rank;
	
	//멤버에 값을 넣을 때 외부에서 메소드를 호출해서 넣기 set~
	//메소드명 이름을 지을 때
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
}
