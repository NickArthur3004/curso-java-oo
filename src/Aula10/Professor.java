package Aula10;

import java.time.LocalDate;
import java.util.Date;

public class Professor extends Pessoa {
	
	public Professor(String name, String sobrenome, LocalDate dataDeNasc, char sexo) {
		super(name, sobrenome, dataDeNasc, sexo);
		// TODO Auto-generated constructor stub
	}

	private Horas horas;

	public Horas getHoras() {
		return horas;
	}

	public void setHoras(Horas horas) {
		this.horas = horas;
	}

	@Override
	public String toString() {
		return super.toString()+" horas=" + horas + "]";
	}
	
	
}
