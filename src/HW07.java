
class Point3D extends Point{
	private int z;
	public Point3D(int x, int y, int z){
		super(x,y);
		this.z=z ;}
	public int getZ() { return z;}
	public String toString() {
		return "("+ getX()+ ","+ getY()+ ","+ getZ()+")�� ��" ;
	}
	
	
	public void moveUp() {
		z++;
	}
	public void moveDown() {
		z--;
	}
	public void move(int x, int y, int z) {
		move(x,y);
		this.z=z;
	}
}
	
	
public class HW07 {

	public static void main(String[] args) {
		Point3D p= new Point3D(1,2,3);
		System.out.println(p.toString() + "�Դϴ�.");
		
		p.moveUp();
		System.out.println(p.toString() + "�Դϴ�.");
		
		p.moveDown();
		p.move(10, 10);
		System.out.println(p.toString() + "�Դϴ�.");
		
		p.move(100,200,300);
		System.out.println(p.toString() + "�Դϴ�.");
		
	}

}
