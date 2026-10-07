package asdfghjkl;

//
class Parent 
{
	void marry()
	{
		System.out.println("slelcted by family");
	}
	void propert()
	{
		System.out.println("propety of family");
	}
}

class Demo extends Parent {
	void marry()
	{
		System.out.println("campus selected");
	}
	public static void main(String[] args) {
		Demo bb = new Demo();
		bb.marry();
		bb.propert();
	}

}

-----------------------------------

package asdfghjkl;

//
class Parent {
	private int a;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
}

class Demo extends Parent {

	public static void main(String[] args) {
		Demo bb = new Demo();
		bb.setA(7);
		int ss = bb.getA();
		System.out.println(ss);
	}

}