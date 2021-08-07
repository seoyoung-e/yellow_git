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
		
		System.out.print("두 정수의 연산자를 입력하시오>> ");
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
	         System.out.println("잘못된 연산자 입니다.");
	         s.close();
	         return;
	      }
		
		cal.setValue(a, b);
		System.out.println(cal.calculate());
		s.close();
		}

	}


