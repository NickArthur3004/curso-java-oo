package Aula23;

@FunctionalInterface
public interface Funcionario {
	
	abstract double remunera��o();
	
	default void imprimi() {
		System.out.println(remunera��o());
	}

}
