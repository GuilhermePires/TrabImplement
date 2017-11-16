
public class Speakers {
	private static String nome;
	private static String assunto;

	public Speakers(String nome, String assunto) {
		this.nome = nome;
		this.assunto = assunto;
	}

	public static String getNome() {
		return nome;
	}

	public static String getAssunto() {
		return assunto;
	}

}