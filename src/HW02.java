class IPTV extends ColorTV{
	String address;
	public IPTV(String address, int size, int color) {
		super(size, color);
		this.address=address;
	}
	public void printProperty() {
		System.out.println("���� IPTV�� "+ address+ " �ּ��� " + getSize() + "��ġ "+color+"�÷�");
	}
}

public class HW02 {

	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();

	}

}

