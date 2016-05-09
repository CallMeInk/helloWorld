package date20160509;

public abstract class AbstractFather {

	private String name = "第二次修改";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void speak();
}
