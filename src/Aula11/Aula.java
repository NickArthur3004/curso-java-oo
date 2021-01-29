package Aula11;

public class Aula {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		a.setName("Joana");
		a.setMatriculo("1000000000");
		
		System.out.println(a.getName()+ ", "+ a.getMatricula());
		
		Professor p = new Professor();
		p.setName("Joao");
		p.setMatriculo("10000000");
		
		System.out.println(p.getName()+ ", "+ p.getMatricula());
		
		
		System.out.print("");
		a.print();
		
	}

}
