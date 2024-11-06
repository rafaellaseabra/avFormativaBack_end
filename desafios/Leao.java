package avFormativa.desafios;

public class Leao extends  DesafioAnimal{

		public  Leao (String nome, String sexo, String raca) {
		      super(nome,sexo,raca);
		}
		
		@Override
		public void emitirSom() {  //sobrescreve o método
			System.out.println("ruorrr!!.");
			
		}
	}


