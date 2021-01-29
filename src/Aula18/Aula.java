package Aula18;

import java.time.LocalDate;

public class Aula {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.setName("Ana");
		p.setSobrenome("Souza");
		p.setDtNasc(LocalDate.of(1980, 5, 15));
		
		System.out.printf("%s %s possui %d anos, %d meses, %d dias", 
	    p.getName(), p.getSobrenome(),p.getIdade().getAnos(),
	    p.getIdade().getMeses(),p.getIdade().getDias());

	}

}
