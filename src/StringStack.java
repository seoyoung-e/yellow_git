
public class StringStack implements Stack{
	private int num, set; //���� ������ ����, ���� �ε��� 
	private String [] stack;
	public StringStack(int num) {
		this.num=num;
		this.set= 0;
		stack= new String[num]; //
	}
	
	@Override
	public int length() {
		return set;
	}
	@Override
	public int capacity() {
		return stack.length; //length()�� �� �� �ɱ�....
	}
	@Override
	public String pop() {
		if(set<1) {// ���ÿ� �ƹ��͵� �� ����
			return null;
		}
		set --;
		String b= stack[set];
		return b;
	}
	@Override
	public boolean push(String val) {
		if(set<num) { //���� �� �� ��
			stack[set]=val;
			set++;
			return true;
		}
		else return false;
		
}}
