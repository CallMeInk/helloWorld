package number28;

public class CC <T>{

	private T t;

	public CC(T t) {
		super();
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public void print(){
		System.out.println("type is:"+t.getClass().getName());
	}
}
