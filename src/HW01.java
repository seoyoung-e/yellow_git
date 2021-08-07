class TV{
	private int size;
	public TV(int size) { this.size=size;}
	protected int getSize() {return size;}
}

class ColorTV extends TV{
	int color;
	public ColorTV(int size, int color) {
		super(size);
		this.color=color;
	}
	public void printProperty() {
		System.out.println(getSize() + "인치 "+color+"컬러");
	}
}
public class HW01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorTV myTV= new ColorTV(32,1024);
		myTV.printProperty();
	}

}
