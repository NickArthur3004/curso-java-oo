package Aula09;

public class Aula {

	public static final String OURO = "ouro";
	public static final String PAUS = "paus";
	public static final String ESPADAS = "espadas";
	public static final String COPAS = "copas";
	
	public static void main(String[] args) {
		
		FalseOfTrue t = FalseOfTrue.FALSE;
		System.out.println(t.getIndex());
		System.out.println(t.getDesc());
		
		for(FalseOfTrue t2 : FalseOfTrue.values()) {
			System.out.println(t2);
		}
		
		
        Carta naipe = Carta.COPAS;
		switch (naipe) {
		case OURO:System.out.println("Sua carta é de ouro");
		break;
		case ESPADAS:System.out.println("Sua carta é de espadas");
		break;
		case COPAS:System.out.println("Sua carta é de copas");
		break;
		case PAUS:System.out.println("Sua carta é de paus");
		break;
		
		default:
			System.out.println("Nenhum naipe presente");
			break;
		}
	}
}
