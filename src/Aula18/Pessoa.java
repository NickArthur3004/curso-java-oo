package Aula18;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
	
	private String name;
	
	private String sobrenome;
	
	private LocalDate DtNasc;
	
	public CalculaIdade getIdade() {
		return new Idade();
	}
	
	private class Idade implements CalculaIdade{

		@Override
		public int getAnos() {
			Period p = Period.between(DtNasc, LocalDate.now());
			return p.getYears();
		}

		@Override
		public int getMeses() {
			Period p = Period.between(DtNasc, LocalDate.now());
			return p.getMonths();
		}

		@Override
		public int getDias() {
			Period p = Period.between(DtNasc, LocalDate.now());
			return p.getDays();
		}
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public LocalDate getDtNasc() {
		return DtNasc;
	}
	public void setDtNasc(LocalDate dtNasc) {
		DtNasc = dtNasc;
	}
	
	

}
