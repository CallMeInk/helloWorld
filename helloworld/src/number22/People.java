package number22;

public class People {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public People(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return (  (((People)obj).name).equals(this.name));
	}

	public static void main(String[] args) {
		People p1 = new People("ink1");
		People p2 = new People("ink1");
		People p3 = new People("ink3");
		System.out.println(p1);
		System.out.println(p1.toString());
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));

	}


}
