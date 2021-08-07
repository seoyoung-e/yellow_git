class Circle2 implements Shape2{
	private int radius;
	public Circle2(int radius) {
		this.radius=radius;
	}
	
	public void draw() {
		System.out.println("반지름이 "+radius+"인 원입니다.");
	}
	
	public double getArea() {
		return PI*radius*radius;
	}
}
public class HW13 {
	public static void main(String[] args) {
		Shape2 donut= new Circle2(10);
		donut.redraw();
		System.out.println("면적은 "+ donut.getArea());
	}
}
