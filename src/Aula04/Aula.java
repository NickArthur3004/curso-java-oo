package Aula04;

public class Aula {
	
	int x = 1;
	
	String y = "Ola";
	
	String z = "mundo";
	
	void soma(int a, int b) {
		int soma = a + b;
		System.out.println("a soma �: "+soma);
	}
	
	int subtra��o(int a,int b) {
		return a - b;
	}

	public static void main(String[] args) {
		

		Aula a = new Aula();
		int x2 = a.x + 2;
		
		System.out.println(x2);
		System.out.println(a.y + " " + a.z);
		
		a.soma(2, 5);
		
		System.out.println(a.subtra��o(5, 3));
		
		for(int i = 0; i < 5; i++) {
			a.soma(x2, i);
		}
		
	}

}
