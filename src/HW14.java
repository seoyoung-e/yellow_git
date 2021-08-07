class Circle3 implements Shape2{
	private int radius;
	public Circle3(int radius) {
		this.radius=radius;
	}
	
	public void draw() {
		System.out.println("반지름이 "+radius+"인 원입니다.");
	}
	
	public double getArea() {
		return PI*radius*radius;
	}
}

class Oval2 implements Shape2{
	private int a, b;
	public Oval2(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public void draw() {
		System.out.println(a+"x"+b+"에 내접하는 타원입니다.");
	}
	
	public double getArea() {
		return PI*a*b;
	}
}


class Rect2 implements Shape2{
	private int a,b;
	public Rect2(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public void draw() {
		System.out.println(a+"x"+b+"크기의 사각형입니다.");
	}
	
	public double getArea() {
		return a*b;
	}
}

public class HW14 {
	public static void main(String[] args) {
		 Shape2[] list = new Shape2[3]; // Shape을 상속받은 클래스 객체의 레퍼런스 배열
		   list[0] = new Circle3(10); // 반지름이 10인 원 객체
		   list[1] = new Oval2(20, 30); // 20x30 사각형에 내접하는 타원
		   list[2] = new Rect2(10, 40); // 10x40 크기의 사각형
		   for(int i=0; i<list.length; i++) list[i].redraw();
		   for(int i=0; i<list.length; i++) System.out.println("면적은 "+ list[i].getArea());
	}

}
