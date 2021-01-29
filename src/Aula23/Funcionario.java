package Aula23;

@FunctionalInterface
public interface Funcionario {
	
	abstract double remuneração();
	
	default void imprimi() {
		System.out.println(remuneração());
	}

}
