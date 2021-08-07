//10번

class Dictionary extends PairMap{
	private int count; //저장된 개수
	public Dictionary(int capacity) {
		keyArray= new String [capacity];
		valueArray= new  String [capacity];
		this.count=0;
	}
	
	@Override
	String get(String key) {
		for(int i=0;i<keyArray.length ;i++) {
			if(key.equals(keyArray[i])) return valueArray[i];
		}
		return null;
	}
	
	@Override
	void put(String key, String value) {
		for(int i=0;i<count ;i++) {
			if(keyArray[i].equals(key)) {
				 valueArray[i] = value;
				 return; //중복 있으면 수정하고 종료
			}
		}
		//중복 없다면
		keyArray[count]=key;
		valueArray[count]=value;
		count++;
	}
	
	@Override
	String delete(String key) {
		for(int i=0;i<keyArray.length ;i++) {
			if(key.equals(keyArray[i])) {
				String s= valueArray[i];
				keyArray[i]=null;
				valueArray[i]=null;
				return s;
			}
		}
		return null;
	}
	
	@Override
	int length() {
		return count;
	}
}

public class DictionaryApp {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("황기태", "자바");
		dic.put("이재문", "파이썬");
		dic.put("이재문", "C++");
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 "+ dic.get("황기태"));
	


	}

}

