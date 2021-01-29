package Aula12;

public class ImplantadorJulior extends Implantador {

	@Override
	public double calculaSalario() {
		
		return (getSalario() * 0.15) + getSalario();
	}

}
