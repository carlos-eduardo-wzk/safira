package Controle;

import java.util.Date;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import model.Livro;

@Model
public class LivroMB {

	private Date dt;

	private Livro liv = new Livro();

	@Inject
	private BookDAO bookDAO;

	public void save() {
		System.out.println("salvar libro " +  getLiv().getTitle());
		bookDAO.salva(liv);

	}

	

	public Livro getLiv() {
		return liv;
	}



	public void setLiv(Livro liv) {
		this.liv = liv;
	}



	public Date getDt() {
		return dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}

}
