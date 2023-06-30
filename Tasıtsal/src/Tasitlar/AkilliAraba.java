package Tasitlar;

public class AkilliAraba extends Araba{
	
	
	Bilgisayar yolasistani;
	
	public void rotayi_belirle() {
		yolasistani = new Bilgisayar();
		yolasistani.calistir();
		System.out.println("rota belirlendi");
	}
	
	protected void yavaslat(int x) { // override
		System.out.println("akıllı araba yavaşlıyor.");
		System.out.println("fren sistemi aktif edildi");
		setHiz(getHiz()-x);
	}
	
	
	public void slowdown(int x) { // overload
		System.out.println("akıllı araba yavaşlıyor.");
		System.out.println("fren sistemi aktif edildi");
		setHiz(getHiz()-x);
	}
	
	public void yavaslat(String x) { // overload
		System.out.println("akıllı araba yavaşlıyor." + x);
		System.out.println("fren sistemi aktif edildi");
		setHiz(getHiz()-1);
	}
	
	public void yavaslat(int x, int y) { // overload
		System.out.println("akıllı araba yavaşlıyor." + x);
		System.out.println("fren sistemi aktif edildi");
		setHiz(getHiz()-y);
	}
	
	/*
	public void yavaslat(int x, String y) { // override çünkü bu isimde ve int,String alan bir metot var Araba.java'da
		System.out.println("akıllı araba yavaşlıyor." + y);
		System.out.println("fren sistemi aktif edildi");
		setHiz(getHiz()-x);
	}*/
	
	
	public void yavaslat(String y, int x) { // overload
		System.out.println("akıllı araba yavaşlıyor." + y);
		System.out.println("fren sistemi aktif edildi");
		setHiz(getHiz()-x);
	}
	
	
	
	
	public void yavaslat() { // override
		System.out.println("akıllı araba yavaşlıyor.");
		System.out.println("fren sistemi aktif edildi");
		setHiz(getHiz()-1);
	}
	
	
	
	
	
	
	/*
	 *
	public int hizlandir() {
		setHiz(getHiz()+1);
		return getHiz();
	}
	*/
	
	
	
	
	
	
	public void test() {
		yavaslat(5);
		System.out.println("----");
		super.yavaslat(5);
	//	super.super.yavaslat(5);
	}
	
	public AkilliAraba(String s) {
		super(s);
		System.out.println("this kodu olan constructor çalıştı");
	}
	
	public AkilliAraba() {
		this("abc");
		System.out.println("Akıllı araba constructor'ı çalıştı");
		
	}
	
	
	public void calistir(AkilliAraba a){
		System.out.println("akıllı araba sınıfındaki çalıştır metodu çalıştı");
	}
	
	public AkilliAraba calistir_ve_dondur(Araba a)
	{
		System.out.println("akıllı araba sınıfındaki çalıştır metodu çalıştı");
		return null;
	}

	
	
	
	
	public static void main(String[] args) {
		
		Araba a = new Araba();
		AkilliAraba akilli_araba = new AkilliAraba();
		
		akilli_araba.calistir_ve_dondur(a);
		
		
		Tasit [] tasitlar = new Tasit[5];
		tasitlar[0] = new AkilliAraba();
		tasitlar[1] = new NormalAraba();
		tasitlar[2] = new Araba();
		tasitlar[3] = new MotorluTasit();
		tasitlar[4] = new Tasit();
	NormalAraba n_araba = new NormalAraba();
		
		akilli_araba.test();
		
		/*akilli_araba.calistir();
		n_araba.calistir();
		
		akilli_araba.yavaslat();
		n_araba.yavaslat();
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*akilli_araba.calistir();
		System.out.println(akilli_araba.getHiz());
		akilli_araba.setHiz(-1);
		akilli_araba.yavaslat();
		
		akilli_araba.tasit_no = 10;
		
		akilli_araba.rotayi_belirle();
		
		
		akilli_araba.dur();
		System.out.println(akilli_araba.getHiz());
		
		n_araba.calistir();
		
		
		n_araba.vitesi_arttir();
		
		
		n_araba.dur();
		
		*/
		
		
	}

}
