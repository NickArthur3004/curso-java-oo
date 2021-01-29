package Aula20;

public class Calculo implements Adição,Multiplicação {

	@Override
	public int multiplicação(int a, int b) {
		
		return a * b;
	}

	@Override
	public int somar(int a, int b) {
		return a + b;
	}

}
