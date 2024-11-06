package avFormativa.desafios;

public class Pessoa {

	private String nome;
	private int idade;

	public Pessoa() {   //método construtor vazio

	}

	public Pessoa(String nome, int idade) { //método contrutos com dois argumentos
		this.nome = nome;      //Este nome será atribuido ao mesmo atributo de cima
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;

	}
}
