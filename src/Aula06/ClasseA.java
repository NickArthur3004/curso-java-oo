package Aula06;

public class ClasseA {
	
	public String  publico;
	private String  privado;
	protected String protegido;
	String pacote;
	
    public static void main(String[] args) {
		
		ClasseA a = new ClasseA();
		a.pacote = "Pacote a";
		a.protegido = "Protegido a";
		a.publico = "Public a";
		

	}
}
