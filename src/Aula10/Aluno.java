package Aula10;

import java.time.LocalDate;
import java.util.Date;

public class Aluno extends Pessoa {
	
	private Turno turno;
	
	

	public Aluno(String name, String sobrenome, LocalDate dataDeNasc, char sexo, Turno turno) {
		super(name, sobrenome, dataDeNasc, sexo);
		this.turno = turno;
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return super.toString()+ " turno=" + turno + "]";
	}
	
	

}
