package Aula04;

public class ExercicioAula4 {

	public static void main(String[] args) {
		
		ExercicioAula4 ex = new ExercicioAula4();
		ex.tabuada(2);

	}
	void tabuada(int a) {
		for(int i = 1; i <= 10;i++) {
		int tabuada = a * i;
		System.out.println(a +" * " + i + " = " + tabuada);
		}
	}

}
