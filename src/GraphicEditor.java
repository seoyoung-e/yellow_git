/*HW12*/
import java.util.Scanner;

public class GraphicEditor {
	private String name;
	private Scanner scanner = new Scanner(System.in);
	private Shape start=null, end=null;
	
	public GraphicEditor(String name) {
		this.name = name;}
	
	public void run() {
		System.out.println("�׷��� ������ " + name + "�� �����մϴ�.");
		int choice = 0;
		while (choice != 4) { 
			int type, index;
			System.out.print("����(1), ����(2), ��� ����(3), ����(4)>>");
			choice = scanner.nextInt();
			switch (choice) {
				case 1:	// ����
					System.out.print("Line(1), Rect(2), Circle(3)>>");
					type = scanner.nextInt();
					if (type < 1 || type > 3) {
						System.out.println("�߸� �����ϼ̽��ϴ�.");
						break;
					}
					insert(type);
					break;
				case 2:	// ����
					System.out.print("������ ������ ��ġ>>");
					index = scanner.nextInt();
					if (!delete(index)) {
						System.out.println("������ �� �����ϴ�.");
					}
					break;
				case 3:	// ��� ����
					Shape p = start;
					while(p != null) { //???
						p.draw();
						p = p.getNext();
					}
					break;
				case 4:	// ������
					break;
				default:
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
		System.out.println(name + "�� �����մϴ�.");
	
	}

	private boolean delete(int index) {
		Shape current = start, previous = start; //??
		if (start == null) // ����Ʈ�� �� ���
			return false;
		
		for (int i=0; i<index; i++) {
			previous = current;
			current = current.getNext(); // ���� ���ҷ� �̵�
			if (current == null) // �ε����� ����Ʈ ���� �������� ū ���
				return false;
		}
		
		if (start == end) { // ����Ʈ�� ���Ұ� �Ѱ��ۿ� ���� ���
			start = end = null;
			return true;
		}
		if (current == start) {// ù��° ���Ҹ� �����ϴ� ���
			start = start.getNext(); // ���� ���Ұ� ù��° ���Ұ� ��
		}
		else if (current == end) {// ������ ���Ҹ� �����ϴ� ���
			end = previous; // ���� ���Ұ� ������ ���Ұ� ��
			end.setNext(null);
		} else {
			previous.setNext(current.getNext()); // ���� ���Ҹ� ����Ʈ���� ����
		}
		return true;
	}

	private void insert(int choice) {
		Shape obj=null;
		switch (choice) {
			case 1: // Line
				 obj = new Line();
				 break;
			case 2: // Rect
				obj = new Rect();
				break;
			case 3: // Circle
				obj = new Circle();
		}
		if (start == null) { // ����Ʈ�� ����� ��
			start = end = obj;
		} else {
			end.setNext(obj); // ������ ���� �ڿ� ����
			end = obj;
		}
	}



	public static void main(String [] args) {
		GraphicEditor ge = new GraphicEditor("beauty");
		ge.run();
		}
	
}
