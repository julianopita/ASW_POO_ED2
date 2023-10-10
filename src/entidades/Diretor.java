package entidades;

public class Diretor extends Usuario {

	//atributos privados de diretor
		private String areaEspecialidade;
		
	
	public Diretor(String login, String senha, String email, String areaEspecialidade) {
		super(login, senha, email);
		this.areaEspecialidade = areaEspecialidade;
		// TODO Auto-generated constructor stub
	}


	public String getAreaEspecialidade() {
		return areaEspecialidade;
	}


	public void setAreaEspecialidade(String areaEspecialidade) {
		this.areaEspecialidade = areaEspecialidade;
	}


	@Override
	public String toString() {
		return "Diretor [areaEspecialidade=" + areaEspecialidade + "]";
	}
	
	

}
