package number28;

public class C {
	
	private Object object;

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public C(Object object) {
		super();
		this.object = object;
	}
	
	public void print(){
		System.out.println("type is:"+object.getClass().getName());
	}

}
