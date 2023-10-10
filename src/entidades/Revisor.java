package entidades;

public class Revisor extends Usuario {
	
	//atributos privados de revisor
	private String lattes;
	private String instituicao;
	private String researchId;

	public Revisor(String login, String senha, String email, String lattes, String instituicao, String researchId) {
		super(login, senha, email);
		this.lattes = lattes;
		this.instituicao = instituicao;
		this.researchId = researchId;
		// TODO Auto-generated constructor stub
	}

	public String getLattes() {
		return lattes;
	}

	public void setLattes(String lattes) {
		this.lattes = lattes;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public String getResearchId() {
		return researchId;
	}

	public void setResearchId(String researchId) {
		this.researchId = researchId;
	}

	@Override
	public String toString() {
		return "Revisor [lattes=" + lattes + ", instituicao=" + instituicao + ", researchId=" + researchId + "]";
	}

	
	
}
