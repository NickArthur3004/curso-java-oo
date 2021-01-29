package Aula16;

public class MyClasse extends Aula{
	
	@Override
	void imprimi() {
		System.out.println(Aula.name +  " " + new Aula().sobrenome);
	}

	static void show() {
		System.out.println(Aula.name+ " " + new Aula().sobrenome);
	}
}
