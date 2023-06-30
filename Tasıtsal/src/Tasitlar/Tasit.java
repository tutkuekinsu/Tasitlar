package Tasitlar;

public class Tasit {

	
	public String marka;
	private int hiz;
	protected int tasit_no;
	int package_variable;
	
	
	public Tasit() {}
	
	public Tasit(int a)
	{
		super();
		System.out.println("Tasit constrcutor'ı çalıştı");
		tasit_no = 12345;
	}
	
	public int getHiz() {
		return hiz;
	}
	
	public void setHiz(int hiz) {
		if(hiz < 0)
			System.out.println("hiz sifirdan küçük olamaz");
		else
			this.hiz = hiz;
	}
}
