package entidades;

public class Autor extends Usuario {
	
	//devemos colocar nome nos autores/palestrantes?
	private String areaProfissional;

	public Autor(String login, String senha, String email, String areaProfissional) {
		super(login, senha, email);
		this.areaProfissional = areaProfissional;
		// TODO Auto-generated constructor stub
	}

	public String getAreaProfissional() {
		return areaProfissional;
	}

	public void setAreaProfissional(String areaProfissional) {
		this.areaProfissional = areaProfissional;
	}

	@Override
	public String toString() {
		return "Autor [areaProfissional=" + areaProfissional + "]";
	}
	
	

}
