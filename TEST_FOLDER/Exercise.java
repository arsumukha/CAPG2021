package day7.practicetest;
class Fruit{
	String taste="sweet";
	String name="guava";
	public void eat() {
		System.out.println("the fruite is "+name+" tastes "+taste);
	}
}
class Apple extends Fruit{
	String taste="crunchy and sweet";
	String name="Apple";
	@Override
	public void eat() {
		System.out.println("the fruite is "+name+" tastes "+taste);
	}
}
class Orange extends Fruit{
	String taste="sour";
	String name="Orange";
	@Override
	public void eat() {
		System.out.println("the fruite is "+name+"tastes"+taste);
	}
}
public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit fruit = new Fruit();
		Fruit fruit2 = new Apple();
		Fruit fruit3 = new Orange();
		fruit.eat();
		fruit2.eat();
		fruit3.eat();
		
	}

}
