package avFormativa.desafios;

public class DesafioAnimal {
	private String nome;
	private String sexo;
	private String raca;


	public  DesafioAnimal (String nome, String sexo, String raca) {
		this.nome = nome;
		this.sexo = sexo;
		this.raca = raca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca){
		this.raca = raca;
	}
	public void dormir() {
		System.out.println("DORMINDO");
	}
	public void carminhar() {
		System.out.println("CAMINHANDO");
	}
	public void correr() {
		System.out.println("CORRENDO");
	}
	public void emitirSom() {
		System.out.println("Emitindo Som");
	}
}