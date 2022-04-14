package Exercicio;

public class FactoryMethodFlores {

	public static void main(String[] args) {
		
		FlorFactory tipoFlor = new FlorFactory();
		
		FlorIF minhaFlor = tipoFlor.gerarFlor("Rosa");
		minhaFlor.criarFlor();
		
		minhaFlor = tipoFlor.gerarFlor("Margarida");
		minhaFlor.criarFlor();
		
		minhaFlor = tipoFlor.gerarFlor("orquidea");
		minhaFlor.criarFlor();

	}

}
