package entidades;

/*motivo de colocar classe abstrata
 * normalmente possui métodos abstratos. Esses métodos são implementados nas 
 * suas classes derivadas concretas com o objetivo de definir o comportamento específico.
 */

public abstract class Usuario {
	protected String login;
	protected String senha;
	protected String email;
	
	public Usuario(String login, String senha, String email) {
		super();
		this.login = login;
		this.senha = senha;
		this.email = email;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}


