package Aula14;

public class Aula {
	
	private PlayerVideo PL;
	
	void videos() {
		System.out.println("WMV");
		PL = new Wmv();
		PL.play();
		PL.stop();
		PL.pause();
		PL.volume(90);
		PL.TaxaDeQuadros();
		PL.TaxaDeBits();
		
		System.out.println();
		
		System.out.println("RMV");
		PL = new Rmv();
		PL.play();
		PL.stop();
		PL.pause();
		PL.volume(100);
		PL.TaxaDeQuadros();
		PL.TaxaDeBits();
		System.out.println();
	}

	public static void main(String[] args) {
		
		new Aula().videos();
		
		System.out.println("MP3");
		MP3 mp3 = new MP3();
		mp3.play();
		mp3.stop();
		mp3.pause();
		mp3.volume(10);
		mp3.TaxaDeBits();
		
		System.out.println();
		
		System.out.println("AVI");
		AVI avi = new AVI();
		avi.play();
		avi.stop();
		avi.pause();
		avi.volume(40);
		avi.TaxaDeQuadros();
		avi.TaxaDeBits();
		
		System.out.println();
	

	}

}
