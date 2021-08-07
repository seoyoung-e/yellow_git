//12��
import java.util.Scanner;
class menu{
	private static Scanner s;
	String [][] seats = new String [3][10];
	
	public menu() {
		for(int i=0;i<3;i++) {
			for(int j=0; j<10; j++) {
				seats[i][j]= "--- ";
			}
		}}
	

	public void printseat(int seatChoice) {
		String SAB =null;
		
		switch (seatChoice) {
		case 1:
			SAB = "S>>";
			break;
		case 2:
			SAB = "A>>";
			break;
		case 3:
			SAB = "B>>";
			break;
		}
		System.out.print(SAB);
		
		for (int i=0;i<10;i++) {
			System.out.print(seats[seatChoice-1][i]);
		}
		System.out.println();
	}
	
	public boolean already(int seat, int seatNum, String name) {
		if(seats[seat-1][seatNum-1].equals("--- ")) {
			seats[seat-1][seatNum-1]=(name+" ");
			return true;
		}
		else
			return false;
	}
	
	public void reserve() {
		s= new Scanner(System.in);
		while(true) {
			System.out.print("�¼� ���� : S(1), A(2), B(3)>>>");
			int seat = s.nextInt();
			
			try {
				if(seat<1||seat>3)
					throw new Exception();
			}catch(Exception e) {
				System.out.println("�ٽ� �������ּ���.");
				continue;
			}
			
			printseat(seat);
			boolean flag2=true;
			System.out.print("�̸�>>");
			String name=s.next();
			int seatNum = 0;
			
			while(flag2) {
				
				System.out.print("��ȣ>>");
				seatNum=s.nextInt();
				if(seatNum<1||seatNum>10)
					System.out.println("��ȣ �������� ������ �߻��Ͽ����ϴ�. �ٽ� �Է����ּ���.");
				else
					flag2=false;
			}
			
			if(already(seat,seatNum,name)) {
				System.out.println("������ �Ϸ��Ͽ����ϴ�.");
			}
			else {
				System.out.println("�̹� ����� �¼��Դϴ�.");
			}
			break;
		}
	}
		
	
	
	public void search() {
		for(int i=0; i<3; i++) 
			printseat(i+1);	
		System.out.println("��ȸ�� �Ϸ��Ͽ����ϴ�.");
	}
	
	public void cancel() {
		s= new Scanner(System.in);
		boolean flag3=true;
		int choice=0;
		while(flag3) {
			System.out.print("�¼����� : S(1), A(2), B(3) >>> ");
			choice =s.nextInt();
			if(choice<1||choice>3)
				System.out.println("�¼� �������� ������ �߻��Ͽ����ϴ�. �ٽ� �Է����ּ���.");
			else
				flag3=false;
		}
		printseat(choice);
		
		boolean flag4=true;
		int count=0;
		while(flag4) {
			System.out.print("�̸�>> ");
			String name=s.next();
			boolean flag5=true;
			while(flag5) {
				count=0;
				for(int i=0;i<10;i++) {	
					if(seats[choice-1][i].equals(name+" ")) {
						seats[choice-1][i]="--- ";
						count=1;
					}
				}
				if (count!=1){
					System.out.println("�߸��� �̸��� �Է��ϼ̽��ϴ�. �ٽ� �������ּ���");
					flag4=false;
				}else if(count==1) {
					System.out.print("��Ҹ� �Ϸ��Ͽ����ϴ�."+"\n");
					flag4=false;
					flag5=false;
				}
			}
		}
	
	}
}




public class Concert {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		menu m= new menu();
		boolean flag=true;
		int c;
		 System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		 		
		while(flag) { 
			
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
			c= s.nextInt();
			
			try {
				if (c<1 || c>4)
					throw new Exception();
			}catch (Exception e) {
				System.out.println("�ٽ� �������ּ���.");
				continue;
			}
			
			switch(c) {
			case 1:
				m.reserve();
				break;
			case 2:
				m.search();
				break;
			case 3:
				m.cancel();
				break;
			case 4:
				System.out.println("�����մϴ�.");
				flag=false;
			}
	}
	s.close();
	}
}
