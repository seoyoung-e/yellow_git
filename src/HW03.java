class Won2Dollar extends Converter{
	public Won2Dollar(double ratio){
		this.ratio=ratio;
	}
	@Override
	protected double convert(double src) {
		return src/ratio;
	}
	
	@Override
	protected String getSrcString() {
		return "¿ø";
	}
	@Override
	protected String getDestString() {
		return "´Þ·¯";
	}
	
}

public class HW03 {

	public static void main(String[] args) {
		Won2Dollar toDollar= new Won2Dollar(1200);
		toDollar.run();

	}

}
