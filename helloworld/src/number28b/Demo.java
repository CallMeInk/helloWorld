package number28b;

public class Demo <T extends Animal>{

	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public Demo(T t) {
		super();
		this.t = t;
	}
	
	public void print(){
		System.out.println("type is:"+t.getClass().getName());
	}
	
	
}
