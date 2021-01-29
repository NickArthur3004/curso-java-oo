package Aula12;

public class Aula {

	public static void main(String[] args) {
		
		Programador p = new Programador();
		p.setName("João");
		p.setSalario(2800.80);
		
		System.out.printf("Programador:%s - R$%.2f ", p.getName(),p.calculaSalario());

		System.out.println();
		
		Analista a = new Analista();
		a.setName("Ricador");
		a.setSalario(2800.80);
		
		System.out.printf("Analista:%s - R$%.2f ", a.getName(),a.calculaSalario());

        System.out.println();
		
		ImplantadorJulior IJ = new ImplantadorJulior();
		IJ.setName("Alice");
		IJ.setSalario(2800.80);
		
		System.out.printf("Analista:%s - R$%.2f ", IJ.getName(),IJ.calculaSalario());

	}

}
