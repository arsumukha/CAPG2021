package day7.practicetest;
class Shape{
public void draw() {
	System.out.println("Drawing shape");
}
public void erase() {
	System.out.println("Erasing shape");
}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Drawing circle");
	}
	public void erase() {
		System.out.println("Erasing circle");
	}
}
class Triangle extends Shape{
	public void draw() {
		System.out.println("Drawing triangle");
	}
	public void erase() {
		System.out.println("Erasing triangle");
	}
}
class Square extends Shape{
	public void draw() {
		System.out.println("Drawing square");
	}
	public void erase() {
		System.out.println("Erasing square");
	}
}

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape triangle = new Triangle();
		Shape circle = new Circle();
		Shape square = new Square();
		Shape shape = new Shape();
		shape.draw();
		shape.erase();
		circle.draw();
		circle.erase();
		triangle.draw();
		triangle.erase();
		square.draw();
		square.erase();
	}

}
