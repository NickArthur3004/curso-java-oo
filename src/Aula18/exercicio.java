package Aula18;

public class exercicio {
	
	private class MyInnerClass{
		public void hello() {
			System.out.println("Ola, eu sou uma classe interna regular");
		}
	}

	public static void main(String[] args) {
	
		 MyInnerClass mic = new exercicio().new MyInnerClass();
		 mic.hello();

	}

}
