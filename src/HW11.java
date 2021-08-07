import java.util.Scanner;
class Add extends Calc{
	public int calculate() {
		return a+b;
	}
}
class Sub extends Calc{
	public int calculate() {
		return a-b;
	}
}
class Mul extends Calc{
	public int calculate() {
		return a*b;
	}
}
class Div extends Calc{
	public int calculate() {
		if(b!=0) return a/b;
		else return -1;
	}
}

public class HW11 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>> ");
		int a= s.nextInt();
		int b= s.nextInt();
		char c= s.next().charAt(0);
		Calc cal; //??
		switch(c) {
		 case '+' : 
	         cal = new Add();
	         break;
	      case '-' :
	         cal = new Sub();
	         break;
	      case '*' :
	         cal = new Mul();
	         break;
	      case '/' :
	         cal = new Div();
	         break;
	      default :
	         System.out.println("�߸��� ������ �Դϴ�.");
	         s.close();
	         return;
	      }
		
		cal.setValue(a, b);
		System.out.println(cal.calculate());
		s.close();
		}

	}


