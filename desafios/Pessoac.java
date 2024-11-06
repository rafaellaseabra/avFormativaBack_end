package avFormativa.desafios;

public class Pessoac {
 

	private String nome;
	private int coracao;


	public Pessoac(String nome, int coracao) { //método contrutos com dois argumentos
		this.nome = nome; //Este nome será atribuido ao mesmo atributo de cima
		this.coracao = coracao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCoracao() {
		return coracao;
	}

	public void setCoracao(int coracao) {
		this.coracao = coracao;

	}
}

