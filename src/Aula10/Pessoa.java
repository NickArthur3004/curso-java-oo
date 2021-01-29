package Aula10;

import java.time.LocalDate;
import java.util.Date;

public class Pessoa {
	
	private String Name;
	private String Sobrenome;
	private LocalDate DataDeNasc;
	private char Sexo;
	
	public Pessoa(String name, String sobrenome, LocalDate dataDeNasc, char sexo) {
		Name = name;
		Sobrenome = sobrenome;
		DataDeNasc = dataDeNasc;
		Sexo = sexo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSobrenome() {
		return Sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}
	public LocalDate getDataDeNasc() {
		return DataDeNasc;
	}
	public void setDataDeNasc(LocalDate dataDeNasc) {
		DataDeNasc = dataDeNasc;
	}
	public char getSexo() {
		return Sexo;
	}
	public void setSexo(char sexo) {
		Sexo = sexo;
	}
	@Override
	public String toString() {
		return " [Name=" + Name + ", Sobrenome=" + Sobrenome + ", DataDeNasc=" + DataDeNasc + ", Sexo=" + Sexo
				+ ", ";
	}
	
	

}
