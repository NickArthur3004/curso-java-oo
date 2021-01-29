package Aula20;

public class Aula {
	
	

	public static void main(String[] args) {
		Calculo c = new Calculo();
		System.out.println("Soma: "+ c.somar(10, 5));
		System.out.println("Multiplicação: "+ c.multiplicação(10, 5));
		
		Aula a = new Aula();
		System.out.println();
		System.out.println("MySoma: " +a.MySoma(8, 5));
		
		System.out.println();
		
		a.Imprimi(new Executa() {

			@Override
			public void executar() {
				
				Calculo c = new Calculo();
				System.out.println("Soma: "+ c.somar(10, 5));
				System.out.println("Multiplicação: "+ c.multiplicação(10, 5));
				
				
			}
			
		});

	}
	
	void Imprimi(Executa executa) {
		executa.executar();
		
	}
	
	int MySoma(int z, int y) {
		
		Adição adição = new Adição() {
			
			@Override
			public int somar(int a, int b) {
				
				return b + a;
			}
		};
		return adição.somar(z,y);
	}

}
