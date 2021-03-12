package day7.practicetest;
class NameExceptions extends RuntimeException{
	public NameExceptions(String s) {
		super(s);
	}
}
class Employee{
	private String firstname;
	private String lastname;
	public Employee(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public void valiation() throws NameExceptions {
		if(firstname.equals(null) && lastname.equals(null)) {
			throw new NullPointerException("Entry Missing");
		}
		else if(firstname.length()<3 && lastname.length()<3) {
			throw new NameExceptions("minimum should be 3 characters");
		}
		else {
			System.out.println("entered string is "+firstname+" "+lastname);
		}
	}
}
public class Exercise3 {

	public static void main(String[] args) throws NameExceptions {
		// TODO Auto-generated method stub
		Employee emp= new Employee("AB","WF");
		emp.valiation();
	}

}
