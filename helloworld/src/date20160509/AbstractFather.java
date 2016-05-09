package date20160509;

public abstract class AbstractFather {

	private String name = "修改了这里！！！";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void speak();
}
