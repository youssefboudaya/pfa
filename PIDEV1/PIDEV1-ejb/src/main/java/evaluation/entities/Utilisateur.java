package evaluation.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import evaluation.entities.EvaluationSheet;

@Entity
public class Utilisateur implements Serializable {
	private static final long serialVersionUID = 4343374831941890073L;
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer idUser;
	
	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}
	
	@OneToMany(mappedBy="creator",cascade=CascadeType.ALL)
	private List<EvaluationSheet> evaluationSheets;
}
