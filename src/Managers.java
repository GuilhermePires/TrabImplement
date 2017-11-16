
public class Managers {
	private static String nome;
	private static String email;

	public Managers(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public static String getNome() {
		return nome;
	}
	public static String getEmail() {
		return email;
	}
}