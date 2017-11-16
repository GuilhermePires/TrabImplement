
public class Convidados {
	private static String nome;
	private static String email;
	private static String curriculum;

	public Convidados(String nome, String email, String curriculum) {
		this.nome = nome;
		this.email = email;
		this.curriculum = curriculum;
	}

	public static String getNome() {
		return nome;
	}
	public static String getEmail() {
		return email;
	}
	public static String getCurriculum() {
		return curriculum;
	}

}
