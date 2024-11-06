package avFormativa.desafios;

public class PrincipalDesafioAnimal {

	public static void main(String[] args) {

		Lobo lobo = new Lobo("Alpha", "M", "Qualquer");

		System.out.println("----LOBO----");
		System.out.println("Nome: " + lobo.getNome());
		System.out.println("Sexo: " + lobo.getSexo());
		System.out.println("Raça: " + lobo.getRaca());
		System.out.println("\n ");
		lobo.emitirSom();
		lobo.carminhar();

		Leao leao = new Leao("Mufasa", "M", "Qualquer");

		System.out.println("----LEÃO----");
		System.out.println("Nome: " + leao.getNome());
		System.out.println("Sexo: " + leao.getSexo());
		System.out.println("Raça: " + leao.getRaca());
		System.out.println("\n ");
		leao.emitirSom();
		leao.correr();

	}

}
