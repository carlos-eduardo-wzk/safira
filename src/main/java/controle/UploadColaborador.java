package controle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Colaborador;
import model.Depto;
import model.Empresa;
import model.Filial;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import repository.Colaboradores;
import repository.Deptos;
import repository.Empresas;
import repository.Filiais;
import util.jsf.FacesUtil;

@Named
@ViewScoped
public class UploadColaborador implements Serializable {

	private static final long serialVersionUID = 1L;

	private UploadedFile file;

	@Inject
	private Colaboradores colaboradores;

	@Inject
	private Empresas empresas;

	@Inject
	private Filiais filias;

	@Inject
	private Deptos deptos;

	private Date dataini;
	private Date datafim;

	private List<Empresa> listaEmpresa;
	private List<Filial> listaFilial;
	private List<Depto> listaDepto;

	private boolean csv;

	private Empresa empresaSelecionada;
	private Filial filialSelecionada;
	private Depto deptoSelecionada;

	private Integer posNome = 1;
	private Integer tamNome = 50;

	private Integer posPIS = 51;
	private Integer tamPIS = 12;

	private Integer posMat = 65;
	private Integer tamMat = 8;

	private Integer posCTPS = 73;
	private Integer tamCTPS = 8;

	private Integer posCTPSSerie = 81;
	private Integer tamCTPSSerie = 8;

	private Integer posData = 89;
	private Integer tamData = 8;
	
	List<String> listaLog = new ArrayList<String>();

	public List<String> getListaLog() {
		return listaLog;
	}

	public void setListaLog(List<String> listaLog) {
		this.listaLog = listaLog;
	}

	public Colaboradores getColaboradores() {
		return colaboradores;
	}

	public void setColaboradores(Colaboradores colaboradores) {
		this.colaboradores = colaboradores;
	}

	public Empresas getEmpresas() {
		return empresas;
	}

	public void setEmpresas(Empresas empresas) {
		this.empresas = empresas;
	}

	public Filiais getFilias() {
		return filias;
	}

	public void setFilias(Filiais filias) {
		this.filias = filias;
	}

	public Deptos getDeptos() {
		return deptos;
	}

	public void setDeptos(Deptos deptos) {
		this.deptos = deptos;
	}

	public List<Depto> getListaDepto() {
		return listaDepto;
	}

	public void setListaDepto(List<Depto> listaDepto) {
		this.listaDepto = listaDepto;
	}

	public Depto getDeptoSelecionada() {
		return deptoSelecionada;
	}

	public void setDeptoSelecionada(Depto deptoSelecionada) {
		this.deptoSelecionada = deptoSelecionada;
	}

	public Integer getPosCTPS() {
		return posCTPS;
	}

	public void setPosCTPS(Integer posCTPS) {
		this.posCTPS = posCTPS;
	}

	public Integer getTamCTPS() {
		return tamCTPS;
	}

	public void setTamCTPS(Integer tamCTPS) {
		this.tamCTPS = tamCTPS;
	}

	public Integer getPosCTPSSerie() {
		return posCTPSSerie;
	}

	public void setPosCTPSSerie(Integer posCTPSSerie) {
		this.posCTPSSerie = posCTPSSerie;
	}

	public Integer getTamCTPSSerie() {
		return tamCTPSSerie;
	}

	public void setTamCTPSSerie(Integer tamCTPSSerie) {
		this.tamCTPSSerie = tamCTPSSerie;
	}

	public Integer getPosData() {
		return posData;
	}

	public void setPosData(Integer posData) {
		this.posData = posData;
	}

	public Integer getTamData() {
		return tamData;
	}

	public void setTamData(Integer tamData) {
		this.tamData = tamData;
	}

	public Integer getTamNome() {
		return tamNome;
	}

	public void setTamNome(Integer tamNome) {
		this.tamNome = tamNome;
	}

	public Integer getPosNome() {
		return posNome;
	}

	public void setPosNome(Integer posNome) {
		this.posNome = posNome;
	}

	public Integer getPosPIS() {
		return posPIS;
	}

	public void setPosPIS(Integer posPIS) {
		this.posPIS = posPIS;
	}

	public Integer getTamPIS() {
		return tamPIS;
	}

	public void setTamPIS(Integer tamPIS) {
		this.tamPIS = tamPIS;
	}

	public Integer getPosMat() {
		return posMat;
	}

	public void setPosMat(Integer posMat) {
		this.posMat = posMat;
	}

	public Integer getTamMat() {
		return tamMat;
	}

	public void setTamMat(Integer tamMat) {
		this.tamMat = tamMat;
	}

	public UploadedFile getFile() {
		return file;
	}

	public void setFile(UploadedFile file) {
		this.file = file;
	}

	public Date getDataini() {
		return dataini;
	}

	public void setDataini(Date dataini) {
		this.dataini = dataini;
	}

	public Date getDatafim() {
		return datafim;
	}

	public void setDatafim(Date datafim) {
		this.datafim = datafim;
	}

	public boolean isCsv() {
		return csv;
	}

	public void setCsv(boolean csv) {
		this.csv = csv;
	}

	@PostConstruct
	public void inicializar() {
		listaEmpresa = carregaEmpresa();
		listaFilial = carregaFilial();
		listaDepto = carregaDepto();
	}

	public List<Empresa> carregaEmpresa() {
		return this.empresas.carregarListaEmpresas();
	}

	public List<Filial> carregaFilial() {
		return this.filias.carregarListaFiliais();
	}

	public List<Depto> carregaDepto() {
		return this.deptos.carregarListaDeptos();
	}

	public List<Empresa> getListaEmpresa() {
		return listaEmpresa;
	}

	public void setListaEmpresa(List<Empresa> listaEmpresa) {
		this.listaEmpresa = listaEmpresa;
	}

	public Empresa getEmpresaSelecionada() {
		return empresaSelecionada;
	}

	public void setEmpresaSelecionada(Empresa empresaSelecionada) {
		this.empresaSelecionada = empresaSelecionada;
	}

	public List<Filial> getListaFilial() {
		return listaFilial;
	}

	public void setListaFilial(List<Filial> listaFilial) {
		this.listaFilial = listaFilial;
	}

	public Filial getFilialSelecionada() {
		return filialSelecionada;
	}

	public void setFilialSelecionada(Filial filialSelecionada) {
		this.filialSelecionada = filialSelecionada;
	}

	public void handleFileUpload(FileUploadEvent event) {
		String nomeArquivo = event.getFile().getFileName();
		String caminho = "c:/lixo";
		BufferedReader br = null;
		String line = "";
		List<Colaborador> lstColaborador = new ArrayList<Colaborador>();
		Colaborador cola = new Colaborador();
		

		// try {
		// File targetFolder = new File(caminho);
		// nomeArquivo = event.getFile().getFileName();
		// InputStream inputStream = event.getFile().getInputstream();
		// OutputStream out = new FileOutputStream(new File(targetFolder,
		// event.getFile().getFileName()));
		// int read = 0;
		// byte[] bytes = new byte[1024];
		//
		// while ((read = inputStream.read(bytes)) != -1) {
		// out.write(bytes, 0, read);
		// }
		// inputStream.close();
		// out.flush();
		// out.close();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

		if (csv == true) {
			try {
				br = new BufferedReader(new FileReader(caminho + "/"
						+ nomeArquivo));

	//			while ((line = br.readLine()) != null) {
					try {

						while ((line = br.readLine()) != null) {

							cola = new Colaborador();
							// "," ou ";" de acordo com o arquivo
							String[] row = line.split(";");
							System.out.println(row[0] + " - " + row[1] + " - "
									+ row[2] + " - " + row[3] + " - " + row[4]
									+ " - " + row[5]);

							cola.setNome(row[0]);
							cola.setPis(row[1]);
							cola.setMatricula(row[2]);
							cola.setCtps(row[3]);
							cola.setCtpsSerie(row[4]);
							cola.setEmpresa(empresaSelecionada);
							cola.setFilial(filialSelecionada);
							cola.setDepto(deptoSelecionada);

							try {
								DateFormat formatter = new SimpleDateFormat(
										"dd/MM/yyyy");
								Date date = (Date) formatter.parse(row[5]);
								cola.setDataAdmissao(date);
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
								cola = new Colaborador();
								continue;
							}

							lstColaborador.add(cola);
							cola = new Colaborador();
						}// while
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
			//	} // while

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (br != null) {
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}// try
		} else // se nao é csv
		{
			try {
				br = new BufferedReader(new FileReader(caminho + "/"
						+ nomeArquivo));

				try {

					while ((line = br.readLine()) != null) {

						cola = new Colaborador();

						System.out.println("Nome "
								+ line.substring(posNome - 1, posNome + tamNome
										- 1));
						System.out.println("PIS "
								+ line.substring(posPIS - 1, posPIS + tamPIS
										- 1));
						System.out.println("Mat "
								+ line.substring(posMat - 1, posMat + tamMat
										- 1));
						System.out.println("CTPS "
								+ line.substring(posCTPS - 1, posCTPS + tamCTPS
										- 1));
						System.out.println("CTPS Serie "
								+ line.substring(posCTPSSerie - 1, posCTPSSerie
										+ tamCTPSSerie - 1));
						System.out.println("Data "
								+ line.substring(posData - 1, posData + tamData
										- 1));

						cola.setNome(line.substring(posNome - 1, tamNome
								+ posNome - 1));
						cola.setPis(line.substring(posPIS - 1, posPIS + tamPIS
								- 1));
						cola.setMatricula(line.substring(posMat - 1, posMat
								+ tamMat - 1));
						cola.setCtps(line.substring(posCTPS - 1, posCTPS
								+ tamCTPS - 1));
						cola.setCtpsSerie(line.substring(posCTPSSerie - 1,
								posCTPSSerie + tamCTPSSerie - 1));
						cola.setEmpresa(empresaSelecionada);
						cola.setFilial(filialSelecionada);
						cola.setDepto(deptoSelecionada);

						try {
							DateFormat formatter = new SimpleDateFormat(
									"ddMMyyyy");
							Date date = (Date) formatter.parse(line.substring(
									posData - 1, posData + tamData - 1));
							cola.setDataAdmissao(date);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							listaLog.add("Data invalida " + line.substring(
									posData - 1, posData + tamData - 1) );
							cola = new Colaborador();
							continue;
						}

						lstColaborador.add(cola);
						cola = new Colaborador();
					}// while
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (br != null) {
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}// try

		}// nao csv

		for (Colaborador c : lstColaborador) {

			if ((c.getPis() != null) && (c.getPis() != "")) {
				System.out.println(" PIS " + c.getPis());
				cola = new Colaborador();
				cola = colaboradores.porPIS(c.getPis());

				if (cola == null) {
					System.out.println("Guarda cola " + c.getNome());
					colaboradores.guardar(c);
				} else {
					listaLog.add("Colaborador já cadastradado : PIS " + cola.getPis() + "  -  Nome " + cola.getNome() );
				}

			} else {
				listaLog.add("Pis não encontrado, nulo" );
			}

		}// for

		System.out.println("LISTA " + listaLog.size());
		for(int i=0;i<listaLog.size();i++){
			System.out.println(listaLog.get(i));
		}

		// apagar arquivo
		File targetFolder = new File(caminho);
		targetFolder.delete();

		FacesUtil.addInfoMessage("Importação finalizada com sucesso");
	}// handleFileUpload

	
	public String carregaLog(){
		
		System.out.println("Carrega Log rotina "  );
		System.out.println(listaLog.size());
		for(String s : listaLog){
			System.out.println(s);
		}
		return "";
	}
	
	
}
