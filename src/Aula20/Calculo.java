package Aula20;

public class Calculo implements Adi��o,Multiplica��o {

	@Override
	public int multiplica��o(int a, int b) {
		
		return a * b;
	}

	@Override
	public int somar(int a, int b) {
		return a + b;
	}

}
