package controle;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.Part;

import org.primefaces.event.FileUploadEvent;

import model.Cargo;
import model.Colaborador;
import model.Depto;
import model.Empresa;
import model.Filial;
import model.Horario;
import model.HorarioColaborador;
import model.UnidadeFederacao;
import repository.Cargos;
import repository.Deptos;
import repository.Empresas;
import repository.Filiais;
import repository.Horarios;
import service.CadastroColaboradorService;
import service.CadastroHorarioColaboradorService;
import util.jsf.FacesUtil;

@Named
@ViewScoped
public class CadastroColaborador implements Serializable {

	private String destination = "c:\\lixo\\";

	private static final long serialVersionUID = 1L;

	
	
	@Inject
	private CadastroColaboradorService cadastroServiceColaborador;

	@Inject
	private CadastroHorarioColaboradorService cadastroHorarioColaboradorService;

	private Colaborador colaborador;
	private List<Depto> listaDepartamento;
	private List<Filial> listaFilial;
	private List<Cargo> listaCargo;
	private List<Empresa> listaEmpresa;
	private List<Horario> listaHorario;

	private HorarioColaborador horarioColaborador;

	// private HorarioColaborador hc;

	@Inject
	private Deptos departamentos;

	@Inject
	private Filiais filiais;

	@Inject
	private Cargos cargos;

	@Inject
	private Empresas empresas;

	@Inject
	private Horarios horarios;

	private Part foto;

	public void inicializar() {
		if (FacesUtil.isNotPostback()) {
			listaDepartamento = carregarDepto();
			listaFilial = carregarFilial();
			listaCargo = carregarCargo();
			listaEmpresa = carregarEmpresa();
			listaHorario = carregarHorario();
			horarioColaborador = new HorarioColaborador();

		}
	}

	public HorarioColaborador getHorarioColaborador() {
		return horarioColaborador;
	}

	public void setHorarioColaborador(HorarioColaborador horarioColaborador) {
		this.horarioColaborador = horarioColaborador;
	}

	public List<Horario> carregarHorario() {
		return horarios.carregarListaHorarios();
	}

	public List<Depto> carregarDepto() {
		return departamentos.carregarListaDeptos();
	}

	public List<Filial> carregarFilial() {
		return filiais.carregarListaFiliais();
	}

	public List<Cargo> carregarCargo() {
		return cargos.carregarListaCargos();
	}

	public List<Empresa> carregarEmpresa() {
		return empresas.carregarListaEmpresas();

	}

	public List<Depto> getListaDepartamento() {
		return listaDepartamento;
	}

	public void setListaDepartamento(List<Depto> listaDepartamento) {
		this.listaDepartamento = listaDepartamento;
	}

	public List<Filial> getListaFilial() {
		return listaFilial;
	}

	public void setListaFilial(List<Filial> listaFilial) {
		this.listaFilial = listaFilial;
	}

	public List<Cargo> getListaCargo() {
		return listaCargo;
	}

	public void setListaCargo(List<Cargo> listaCargo) {
		this.listaCargo = listaCargo;
	}

	public List<Empresa> getListaEmpresa() {
		return listaEmpresa;
	}

	public void setListaEmpresa(List<Empresa> listaEmpresa) {
		this.listaEmpresa = listaEmpresa;
	}

	public CadastroColaborador() {
		colaborador = new Colaborador();
	}

	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public void salvar() {
		cadastroServiceColaborador.salvar(colaborador);
		FacesUtil.addInfoMessage("Cadastrado com sucesso");
	}

	public boolean isEditando() {
		return this.colaborador.getId() != null;

	}

	public UnidadeFederacao[] getUf() {
		return UnidadeFederacao.values();
	}

	public boolean isDemitido() {
		return this.colaborador.getDataDemissao() != null;
	}

	public List<Horario> getListaHorario() {
		return listaHorario;
	}

	public void setListaHorario(List<Horario> listaHorario) {
		this.listaHorario = listaHorario;
	}

	public boolean isCarregadoColaborador() {
		return this.colaborador.getId() != null ? false : true;
	}

	public void novoHorario() {
		horarioColaborador = new HorarioColaborador();
	}

	// usado para fazer upload
	public void handleFileUpload(FileUploadEvent event) {
		System.out.println("handleFileUpload");
		FacesMessage message = new FacesMessage("Sucesso", event.getFile().getFileName() + " is uploaded.");
		System.out.println("file foto " + event.getFile().getFileName());
		FacesContext.getCurrentInstance().addMessage(null, message);

		try {
			copyFile(event.getFile().getFileName(), event.getFile().getInputstream());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void copyFile(String fileName, InputStream in) {
		try {

			String caminho = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/");
			// String file = event.getFile().getFileName(); // pego o nome do
			// arquivo

			// imagemTemporaria = event.getFile().getFileName();
			// FacesContext facesContext = FacesContext.getCurrentInstance();
			// ServletContext scontext = (ServletContext)
			// facesContext.getExternalContext().getContext();
			// String arquivo = scontext.getRealPath("/resources/upload/" +
			// imagemTemporaria);

			// +"//web//seu_diretorio//"
			System.out.println(caminho);

			// write the inputStream to a FileOutputStream
			// OutputStream out = new FileOutputStream(new File(destination +
			// colaborador.getPis() ));
			OutputStream out = new FileOutputStream(new File(destination + fileName));

			int read = 0;
			byte[] bytes = new byte[1024];

			while ((read = in.read(bytes)) != -1) {
				out.write(bytes, 0, read);
			}

			in.close();
			out.flush();
			out.close();

			System.out.println("novo arquivo criado!");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
