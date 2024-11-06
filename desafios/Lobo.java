package avFormativa.desafios;

public class Lobo extends DesafioAnimal{

	public  Lobo (String nome, String sexo, String raca) {
		super(nome,sexo,raca);
	}

	@Override
	public void emitirSom() {  //sobrescreve o método
		System.out.println("auuuuuu!!.");



	}

}
