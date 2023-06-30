package Tasitlar;

public class Araba  extends MotorluTasit{
	
	String tur="Sedan";
	Lastik [] tekerler;  
	
	public Araba() {}
	
	public Araba(String tur){
		super();
		System.out.println("Parametre alan Araba constrcutor'ı çalıştı");
		tasit_no = 12345;
		tekerler = new Lastik [4];
		this.tur = tur;
	}
	public void yavaslat() {
		System.out.println("araba yavaşlıyor");
		if(getHiz() != 0)
			setHiz(getHiz()-1);
	}
	
	void yavaslat(int a) { 
		System.out.println("Araba sınıfındaki yavaşlat metodu çalışıyor");
		setHiz(getHiz()-a);
	}
	
	public final void yavaslat(int a, String mesaj) {
		System.out.println(mesaj);
		setHiz(getHiz()-a);
	}
	
	public void hizlandir() {
		setHiz(getHiz()+1);
	}
	
	
	public void calistir(Tasit t)
	{
		t.package_variable = 5;
	}
	
	public AkilliAraba calistir_ve_dondur(Araba a)
	{
		System.out.println("araba sınıfındaki çalıştır metodu çalıştı");
		return null;
	}



}
