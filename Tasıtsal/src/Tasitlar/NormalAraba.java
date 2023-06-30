package Tasitlar;

public class NormalAraba extends Araba {
	
	float benzin_durumu;
	int vitesin_durumu = 0;
	
	public void vitesi_arttir()
	{
		System.out.println("vites arttırıldı");
		vitesin_durumu++;
	}

	

}
