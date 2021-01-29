package Aula10;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Aula {

	public static void main(String[] args) {
		
		
		LocalDate dataDeNasc = LocalDate.of(1990, 8, 25);
		String name = "junior";
		String sobrenome ="rodrigues";
		char sexo ='M';
		Turno turno = Turno.TARDE;
		
		Aluno a1 = new Aluno(name, sobrenome, dataDeNasc, sexo, turno);
		
		System.out.println(a1);
		
		/*Professor p1 = new Professor();
		p1.setDataDeNasc(LocalDate.of(1980, 8, 15));
		p1.setName("Rojer");
		p1.setSobrenome("domingues");
		p1.setSexo('M');
		p1.setHoras(Horas.TRINTA_HORAS);
		
		System.out.println(p1);*/
		

	}

}
