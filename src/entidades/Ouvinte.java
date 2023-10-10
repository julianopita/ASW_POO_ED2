package entidades;

public class Ouvinte {
	
	//atributos privados de ouvinte
		private String nome;
		private String email;

	public Ouvinte(String nome, String email) {
		this.nome = nome;
		this.email = email;
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
