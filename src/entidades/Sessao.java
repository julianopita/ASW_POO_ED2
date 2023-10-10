package entidades;

import java.time.LocalDateTime;

public class Sessao {
	  private String tema;
	  private String atividade;
	  private LocalDateTime dataHoraInicio;

	  public Sessao (String tema, String atividade, LocalDateTime dataHoraInicio) {
	    this.tema = tema;
	    this.atividade = atividade;
	    this.dataHoraInicio = dataHoraInicio;
	  }
	}
