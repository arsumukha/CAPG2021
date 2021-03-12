package labbook.lab4;

import java.util.Random;

class Person{
	private String name;
	private float age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
class Account{
	private double balance;
	private long accnumber;
	private Person person;
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public long getAccnumber() {
		return accnumber;
	}
	public void setAccnumber(long accnumber) {
		this.accnumber = accnumber;
	}
	public Person getP() {
		return person;
	}
	public void setP(Person person) {
		this.person = person;
	}
	public void deposit(double ammount) {
		balance+=ammount;
	}
	public void withdraw(double ammount) {
		balance-=ammount;
	}
	@Override
	public String toString() {
		return "Account [balance=" + balance + ", accnumber=" + accnumber + ", person=" + person + "]";
	}
	
}
class SavingsAccount extends Account{
	public final double minimumBalance=500;
	public void withdraw(double ammount) {
		if(super.getBalance()-ammount==minimumBalance) {
			super.withdraw(ammount);
		}
		else {
			System.out.println("MINIMUM BALANCE VOIDED ");
		}
	}
}
class CurrentAccount extends Account{
	public final double overdraftlimit=25000;
	public void withdraw(double ammount) {
		if(ammount>overdraftlimit) {
			System.out.println("overdraft limit");
		}
		else {
			super.withdraw(ammount);
		}
	}
}
public class Exercise1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Account a1 = new Account();
		Account a2 = new Account();
		Person p1 = new Person();
		Person p2 = new Person();
		p1.setName("smith");
		p2.setName("Kathy");
		p1.setAge(19);
		p2.setAge(24);
		a1.setAccnumber(random.nextLong());
		a2.setAccnumber(random.nextLong());
		a1.setBalance(2000);
		a2.setBalance(3000);
		a1.setP(p1);
		a2.setP(p2);
		//System.out.println(a1);
		//System.out.println(a2);
		a1.deposit(2000);
		a2.withdraw(2000);
		System.out.println(a1.getP()+" "+a1.getBalance());
		System.out.println(a2.getP()+" "+a2.getBalance());
	}

}
