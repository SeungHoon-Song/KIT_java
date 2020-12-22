package q6;

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
    
}