package Controle;



import java.util.Date;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import model.Livro;

@Model
public class LivroMB {

	private Date dt;
	
	private Livro product = new Livro();
	
	@Inject
	private BookDAO bookDAO;
	
	

	public void save() {
		System.out.println("salvar libro " + getProduct().getTitle());
		bookDAO.save(product);
		
	}

	public Livro getProduct() {
		return product;
	}

	public void setProduct(Livro product) {
		this.product = product;
	}

	public Date getDt() {
		return dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}



	
}
