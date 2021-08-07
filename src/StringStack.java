
public class StringStack implements Stack{
	private int num, set; //저장 가능한 개수, 저장 인덱스 
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
		return stack.length; //length()는 왜 안 될까....
	}
	@Override
	public String pop() {
		if(set<1) {// 스택에 아무것도 안 넣음
			return null;
		}
		set --;
		String b= stack[set];
		return b;
	}
	@Override
	public boolean push(String val) {
		if(set<num) { //아직 다 안 참
			stack[set]=val;
			set++;
			return true;
		}
		else return false;
		
}}
