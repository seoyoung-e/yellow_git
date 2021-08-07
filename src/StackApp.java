//9번
import java.util.Scanner;
public class StackApp {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 >>");
		int num= s.nextInt();
		StringStack stack= new StringStack(num);
		
		
		while(true) {
			System.out.print("문자열 입력>>");
			String val= s.next();
			if(val.equals("그만")) break;
			if(!stack.push(val)) { //초과시 
				System.out.println("스택이 꽉 차서 푸시 불가!");
			}
		}
		
		System.out.print("스택에 저장된 모든 문자열 팝 ");
		int length1= stack.length();
		for(int i=0; i<length1;i++) {
			System.out.print(stack.pop()+" ");
		}
		s.close();
	}

}
