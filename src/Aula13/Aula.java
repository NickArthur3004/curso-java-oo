package Aula13;

public class Aula {
	
	private Veiculo veiculo;
	
	private Carro carro;
	
	private Moto moto;
	
	void carrosEmotos() {
		carro = new Ford();
		carro.setCor("Amarelo");
		carro.setPeso(600);
		System.out.println(carro.toString());
		
		moto =new Yamara();
		moto.setCor("roxo");
		moto.setPeso(100);
		moto.setName("Fazer250");
		System.out.println(moto.toString() + moto.getName());
	}
	
	void veiculos() {
		veiculo = new Ford();
		veiculo.setCor("Amarelo");
		veiculo.setPeso(600);
		System.out.println(veiculo.toString());
		
		veiculo = new Yamara();
		veiculo.setCor("roxo");
		veiculo.setPeso(100);
		
		System.out.println(veiculo.toString());
		
	}

	public static void main(String[] args) {
		
		
		Ford f = new Ford();
		f.setCor("Preta");
		f.setPeso(600);
		
		System.out.println(f.toString());
		
		Yamara y = new Yamara();
		y.setCor("Azul");
		y.setPeso(120);
		
		System.out.println(y.toString());
		
		new Aula().veiculos();
		new Aula().carrosEmotos();

	}

}
