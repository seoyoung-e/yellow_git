class Point2{
	private int x,y;
	public Point2() {this.x=0; this.y=0;}
	public Point2(int x,int y) {this.x=x ; this.y=y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {this.x=x ; this.y=y;}
}

class ColorPoint2 extends Point2{
	private String color;
	public ColorPoint2() {this.color="BLACK";	}
	public ColorPoint2(int x,int y) {super(x,y);	}
	
	public void setXY(int x,int y) {move(x,y);}
	public void setColor(String color) {this.color=color;	}
	public String toString() {
		return color+"���� ("+ getX()+ ","+ getY()+")�� ��";
	}
}


public class HW06 {

	public static void main(String[] args) {
		ColorPoint2 zeroPoint = new ColorPoint2();
		System.out.println(zeroPoint.toString()+ "�Դϴ�.");
		
		ColorPoint2 cp= new ColorPoint2(10,10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString()+ "�Դϴ�.");
	}

}
