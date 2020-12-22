package q7;

public class Account {
	private String owner;
    private long balance;
    
    public Account(String owner) {
    	this.owner=owner;
    }
    public Account(long balance) {
    	this.balance = balance;
    }
    public Account(String owner,long balance) {
    	this.owner=owner;
    	this.balance=balance;
    }
    public Account(long balance,String owner) {
    	this.balance=balance;
    	this.owner=owner;
    }
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public long deposit(long amount) {	//저축
		return this.balance+=amount;
	}
	public long withdraw(long amount) {	//인출
		return this.balance-=amount;
	}
	public static void main(String[] args) {
		Account ac = new Account("송승훈",1000000);
		ac.deposit(500000);
		ac.withdraw(700000);
		System.out.println(ac.getOwner()+ac.getBalance());
	}
    
}
