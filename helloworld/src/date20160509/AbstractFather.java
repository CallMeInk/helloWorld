package date20160509;

public abstract class AbstractFather {

	private String name = "jibajie";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void speak();
}
