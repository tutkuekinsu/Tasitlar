package Tasitlar;

public class MotorluTasit extends Tasit {
	
	
	Motor m;
	Lastik [] lastikler;

	
	public MotorluTasit()
	{
		super();
		System.out.println("Motorlu constrcutor'ı çalıştı");
		tasit_no = 12345;
	}
	
	
	void yavaslat(int a) { 
		System.out.println("MotorluTasit sınıfındaki yavaşlat metodu çalışıyor");
		setHiz(getHiz()-a);
	}
	
	
	public void calistir() {
		System.out.println("Araba çalıştı");
		setHiz(5);
	}
	
	public void dur() {
		System.out.println("Araba durdu");
		setHiz(0);
		
	}
	
	public void yakit_tasrufu_sistemini_devreye_al() {
		
	}
}
