//10��

class Dictionary extends PairMap{
	private int count; //����� ����
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
				 return; //�ߺ� ������ �����ϰ� ����
			}
		}
		//�ߺ� ���ٸ�
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
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̽�");
		dic.put("���繮", "C++");
		System.out.println("���繮�� ���� " + dic.get("���繮"));
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
		dic.delete("Ȳ����");
		System.out.println("Ȳ������ ���� "+ dic.get("Ȳ����"));
	


	}

}

