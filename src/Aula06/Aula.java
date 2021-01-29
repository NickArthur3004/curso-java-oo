package Aula06;

import Aula05.ClasseB;

public class Aula extends ClasseB{

	public static void main(String[] args) {
		
		ClasseA a = new ClasseA();
		a.pacote = "Pacote a";
		a.protegido = "Protegido a";
		a.publico = "Public a";
		
		ClasseB b = new ClasseB();
		b.publico = "public b";

		
		Aula aula= new Aula();
		aula.protegido = "protegido b por herança";
		aula.publico = "Publico b";
		
		ClasseD d = new ClasseD();
		d.metodoD();
	}

}
