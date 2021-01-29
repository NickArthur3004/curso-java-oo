package Aula14;

public class AVI implements Player, Video, Audio{

	@Override
	public void play() {
		System.out.println("Play...");
		
	}

	@Override
	public void stop() {
		System.out.println("Stop...");
		
	}

	@Override
	public void pause() {
		
		System.out.println("Pause...");
	}

	@Override
	public void volume(int volume) {
	  System.out.println(volume);
		
	}

	@Override
	public void TaxaDeQuadros() {
		System.out.println("120 fps");
		
	}

	@Override
	public void TaxaDeBits() {
		System.out.println("128 bits");
		
	}

}
