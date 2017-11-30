package controle;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Norma;
import model.Ocorrencia;
import repository.Ocorrencias;
import service.CadastroNormaService;
import util.Rotinas;
import util.jsf.FacesUtil;

@Named
@ViewScoped
public class CadastroNormaBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private CadastroNormaService cadastroServiceNorma;;
	private Norma norma;
	private List<Ocorrencia> listaOcorrencia;

		
	// USADO PARA LER E GRAVAR SELECONEMENU
	private Ocorrencia ocoSegDiurno1;
	private Ocorrencia ocoSegDiurno2;
	private Ocorrencia ocoSegDiurno3;
	private Ocorrencia ocoSegNoturno1;
	private Ocorrencia ocoSegNoturno2;
	private Ocorrencia ocoSegNoturno3;
	private String horSegDiurno1;
	private String horSegDiurno2;
	private String horSegDiurno3;
	private String horSegNoturno1;
	private String horSegNoturno2;
	private String horSegNoturno3;

	private Ocorrencia ocoTerDiurno1;
	private Ocorrencia ocoTerDiurno2;
	private Ocorrencia ocoTerDiurno3;
	private Ocorrencia ocoTerNoturno1;
	private Ocorrencia ocoTerNoturno2;
	private Ocorrencia ocoTerNoturno3;
	private String horTerDiurno1;
	private String horTerDiurno2;
	private String horTerDiurno3;
	private String horTerNoturno1;
	private String horTerNoturno2;
	private String horTerNoturno3;

	private Ocorrencia ocoQuaDiurno1;
	private Ocorrencia ocoQuaDiurno2;
	private Ocorrencia ocoQuaDiurno3;
	private Ocorrencia ocoQuaNoturno1;
	private Ocorrencia ocoQuaNoturno2;
	private Ocorrencia ocoQuaNoturno3;
	private String horQuaDiurno1;
	private String horQuaDiurno2;
	private String horQuaDiurno3;
	private String horQuaNoturno1;
	private String horQuaNoturno2;
	private String horQuaNoturno3;

	private Ocorrencia ocoQuiDiurno1;
	private Ocorrencia ocoQuiDiurno2;
	private Ocorrencia ocoQuiDiurno3;
	private Ocorrencia ocoQuiNoturno1;
	private Ocorrencia ocoQuiNoturno2;
	private Ocorrencia ocoQuiNoturno3;
	private String horQuiDiurno1;
	private String horQuiDiurno2;
	private String horQuiDiurno3;
	private String horQuiNoturno1;
	private String horQuiNoturno2;
	private String horQuiNoturno3;

	private Ocorrencia ocoSexDiurno1;
	private Ocorrencia ocoSexDiurno2;
	private Ocorrencia ocoSexDiurno3;
	private Ocorrencia ocoSexNoturno1;
	private Ocorrencia ocoSexNoturno2;
	private Ocorrencia ocoSexNoturno3;
	private String horSexDiurno1;
	private String horSexDiurno2;
	private String horSexDiurno3;
	private String horSexNoturno1;
	private String horSexNoturno2;
	private String horSexNoturno3;

	private Ocorrencia ocoSabDiurno1;
	private Ocorrencia ocoSabDiurno2;
	private Ocorrencia ocoSabDiurno3;
	private Ocorrencia ocoSabNoturno1;
	private Ocorrencia ocoSabNoturno2;
	private Ocorrencia ocoSabNoturno3;
	private String horSabDiurno1;
	private String horSabDiurno2;
	private String horSabDiurno3;
	private String horSabNoturno1;
	private String horSabNoturno2;
	private String horSabNoturno3;

	private Ocorrencia ocoDomDiurno1;
	private Ocorrencia ocoDomDiurno2;
	private Ocorrencia ocoDomDiurno3;
	private Ocorrencia ocoDomNoturno1;
	private Ocorrencia ocoDomNoturno2;
	private Ocorrencia ocoDomNoturno3;
	private String horDomDiurno1;
	private String horDomDiurno2;
	private String horDomDiurno3;
	private String horDomNoturno1;
	private String horDomNoturno2;
	private String horDomNoturno3;

	private Ocorrencia ocoFerDiurno1;
	private Ocorrencia ocoFerDiurno2;
	private Ocorrencia ocoFerDiurno3;
	private Ocorrencia ocoFerNoturno1;
	private Ocorrencia ocoFerNoturno2;
	private Ocorrencia ocoFerNoturno3;
	private String horFerDiurno1;
	private String horFerDiurno2;
	private String horFerDiurno3;
	private String horFerNoturno1;
	private String horFerNoturno2;
	private String horFerNoturno3;

	private Ocorrencia ocoFolDiurno1;
	private Ocorrencia ocoFolDiurno2;
	private Ocorrencia ocoFolDiurno3;
	private Ocorrencia ocoFolNoturno1;
	private Ocorrencia ocoFolNoturno2;
	private Ocorrencia ocoFolNoturno3;
	private String horFolDiurno1;
	private String horFolDiurno2;
	private String horFolDiurno3;
	private String horFolNoturno1;
	private String horFolNoturno2;
	private String horFolNoturno3;

	private Ocorrencia ocoEspDiurno1;
	private Ocorrencia ocoEspDiurno2;
	private Ocorrencia ocoEspDiurno3;
	private Ocorrencia ocoEspNoturno1;
	private Ocorrencia ocoEspNoturno2;
	private Ocorrencia ocoEspNoturno3;
	private String horEspDiurno1;
	private String horEspDiurno2;
	private String horEspDiurno3;
	private String horEspNoturno1;
	private String horEspNoturno2;
	private String horEspNoturno3;

	private Ocorrencia ocoFalta;;
	private Ocorrencia ocoAdicionalNoturno;
	private Ocorrencia ocoAfastamento;
	private Ocorrencia ocoDSR;
	private Ocorrencia ocoAtraso;
	private Ocorrencia ocoHorasNormais;
	private Ocorrencia ocoHorasNormaisNoturna;
	private Ocorrencia ocoHorasNormaisTolerancia;
	private Ocorrencia ocoHorasAtraso;
	private Ocorrencia ocoHorasAtraso2;
	private Ocorrencia ocoHorasSaidaAntecipada;
	private Ocorrencia ocoHorasSaidaAntecipada2;
	private Ocorrencia ocoHorasAtrasoNaoDescontado;
	private Ocorrencia ocoHorasSaidaAntecipadaNaoDescontada;
	private Ocorrencia ocoFolga;
	private Ocorrencia ocoDebito;
	private Ocorrencia ocoCredito;
	
	
	@Inject
	private Ocorrencias ocorrencias;

	public CadastroNormaBean() {
		norma = new Norma();
		
	}

	public void inicializar() {
		if (FacesUtil.isNotPostback()) {
			listaOcorrencia = carregarOcorrencia();
		}
	}

	public Norma getNorma() {
		return norma;
	}

	public void setNorma(Norma norma) {
		this.norma = norma;
	}

	public List<Ocorrencia> carregarOcorrencia() {
		return listaOcorrencia = ocorrencias.carregarListaOcorrencia();
	}

	public void salvar() {
		System.out.println("salvar " + norma );
		cadastroServiceNorma.salvar(norma);
		FacesUtil.addInfoMessage("Cadastrado com sucesso");
	}

	public boolean isEditando() {
		return this.norma.getId() != null;

	}

	public List<Ocorrencia> getListaOcorrencia() {
		return listaOcorrencia;
	}

	public void setListaOcorrencia(List<Ocorrencia> listaOcorrencia) {
		this.listaOcorrencia = listaOcorrencia;
	}

	public Ocorrencias getOcorrencias() {
		return ocorrencias;
	}

	public void setOcorrencias(Ocorrencias ocorrencias) {
		this.ocorrencias = ocorrencias;					
	}
	
	
	// -------------------------
	// segunda
	// --------------------------

	public Ocorrencia getOcoSegDiurno1() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeSegFaixaDiurno1())) {
					ocoSegDiurno1 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoSegDiurno1;

	}

	public void setOcoSegDiurno1(Ocorrencia ocoSegDiurno1) {
		try {
			norma.setOcorrenciaHeSegFaixaDiurno1(ocoSegDiurno1.getId());
		} catch (Exception e) {
			norma.setOcorrenciaHeSegFaixaDiurno1(null);
		}	
		this.ocoSegDiurno1 = ocoSegDiurno1;
	}

	public Ocorrencia getOcoSegDiurno2() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeSegFaixaDiurno2())) {
					ocoSegDiurno2 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoSegDiurno2;

	}

	public void setOcoSegDiurno2(Ocorrencia ocoSegDiurno2) {
		try {
			norma.setOcorrenciaHeSegFaixaDiurno2(ocoSegDiurno2.getId());

		} catch (Exception e) {
			norma.setOcorrenciaHeSegFaixaDiurno2(null);
		}

		this.ocoSegDiurno2 = ocoSegDiurno2;
	}

	public Ocorrencia getOcoSegDiurno3() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeSegFaixaDiurno3())) {
					ocoSegDiurno3 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoSegDiurno3;

	}

	public void setOcoSegDiurno3(Ocorrencia ocoSegDiurno3) {
		try {
			norma.setOcorrenciaHeSegFaixaDiurno3(ocoSegDiurno3.getId());

		} catch (Exception e) {
			norma.setOcorrenciaHeSegFaixaDiurno3(null);

		}

		this.ocoSegDiurno3 = ocoSegDiurno3;
	}

	public Ocorrencia getOcoSegNoturno1() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeSegFaixaNot1())) {
					ocoSegNoturno1 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoSegNoturno1;
	}

	public void setOcoSegNoturno1(Ocorrencia ocoSegNoturno1) {
		try {
			norma.setOcorrenciaHeSegFaixaNot1(ocoSegNoturno1.getId());

		} catch (Exception e) {
			norma.setOcorrenciaHeSegFaixaNot1(null);
		}

		this.ocoSegNoturno1 = ocoSegNoturno1;
	}

	public Ocorrencia getOcoSegNoturno2() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeSegFaixaNot2())) {
					ocoSegNoturno2 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoSegNoturno2;
	}

	public void setOcoSegNoturno2(Ocorrencia ocoSegNoturno2) {
		try {
			norma.setOcorrenciaHeSegFaixaNot2(ocoSegNoturno2.getId());
		} catch (Exception e) {
			norma.setOcorrenciaHeSegFaixaNot2(null);
		}

		this.ocoSegNoturno2 = ocoSegNoturno2;
	}

	public Ocorrencia getOcoSegNoturno3() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeSegFaixaNot3())) {
					ocoSegNoturno3 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoSegNoturno3;
	}

	public void setOcoSegNoturno3(Ocorrencia ocoSegNoturno3) {
		try {
			norma.setOcorrenciaHeSegFaixaNot3(ocoSegNoturno3.getId());
		} catch (Exception e) {
			norma.setOcorrenciaHeSegFaixaNot3(null);
		}

		this.ocoSegNoturno3 = ocoSegNoturno3;
	}

	public String getHorSegDiurno1() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimSegFaixaDiurno1() != null) {
			h = rt.InteitoToHora(norma.getLimSegFaixaDiurno1());
		}
		return h;
	}

	public void setHorSegDiurno1(String horSegDiurno1) {
		Rotinas rt = new Rotinas();
		norma.setLimSegFaixaDiurno1(rt.Hora2int(horSegDiurno1));
		this.horSegDiurno1 = horSegDiurno1;
		
	}

	public String getHorSegDiurno2() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimSegFaixaDiurno2() != null) {
			h = rt.InteitoToHora(norma.getLimSegFaixaDiurno2());
		}
		return h;
	}

	public void setHorSegDiurno2(String horSegDiurno2) {
		Rotinas rt = new Rotinas();
		norma.setLimSegFaixaDiurno2(rt.Hora2int(horSegDiurno2));
	}

	public String getHorSegDiurno3() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimSegFaixaDiurno3() != null) {
			h = rt.InteitoToHora(norma.getLimSegFaixaDiurno3());
		}
		return h;
	}

	public void setHorSegDiurno3(String horSegDiurno3) {
		Rotinas rt = new Rotinas();
		norma.setLimSegFaixaDiurno3(rt.Hora2int(horSegDiurno3));
	}

	public String getHorSegNoturno1() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimSegFaixaNot1() != null) {
			h = rt.InteitoToHora(norma.getLimSegFaixaNot1());
		}
		return h;
	}

	public void setHorSegNoturno1(String horSegNoturno1) {
		Rotinas rt = new Rotinas();
		norma.setLimSegFaixaNot1(rt.Hora2int(horSegNoturno1));
	}

	public String getHorSegNoturno2() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimSegFaixaNot2() != null) {
			h = rt.InteitoToHora(norma.getLimSegFaixaNot2());
		}
		return h;
	}

	public void setHorSegNoturno2(String horSegNoturno2) {
		Rotinas rt = new Rotinas();
		norma.setLimSegFaixaNot2(rt.Hora2int(horSegNoturno2));
	}

	public String getHorSegNoturno3() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimSegFaixaNot3() != null) {
			h = rt.InteitoToHora(norma.getLimSegFaixaNot3());
		}
		return h;
	}

	public void setHorSegNoturno3(String horSegNoturno3) {
		Rotinas rt = new Rotinas();
		norma.setLimSegFaixaNot3(rt.Hora2int(horSegNoturno3));
	}

	// -------------------------
	// terca
	// --------------------------

	public Ocorrencia getOcoTerDiurno1() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeTerFaixaDiurno1())) {
					ocoTerDiurno1 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoTerDiurno1;

	}

	public void setOcoTerDiurno1(Ocorrencia ocoTerDiurno1) {
		try {
			norma.setOcorrenciaHeTerFaixaDiurno1(ocoTerDiurno1.getId());
		} catch (Exception e) {
			norma.setOcorrenciaHeTerFaixaDiurno1(null);
		}

		this.ocoTerDiurno1 = ocoTerDiurno1;
	}

	public String getHorTerDiurno1() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimTerFaixaDiurno1() != null) {
			h = rt.InteitoToHora(norma.getLimTerFaixaDiurno1());
		}
		return h;
	}

	public void setHorTerDiurno1(String horTerDiurno1) {
		Rotinas rt = new Rotinas();
		norma.setLimTerFaixaDiurno1(rt.Hora2int(horTerDiurno1));
	}

	public Ocorrencia getOcoTerDiurno2() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeTerFaixaDiurno2())) {
					ocoTerDiurno2 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoTerDiurno2;
	}

	public void setOcoTerDiurno2(Ocorrencia ocoTerDiurno2) {
		try {
			norma.setOcorrenciaHeTerFaixaDiurno2(ocoTerDiurno2.getId());
		} catch (Exception e) {
			norma.setOcorrenciaHeTerFaixaDiurno2(null);
		}
		this.ocoTerDiurno2 = ocoTerDiurno2;
	}

	public String getHorTerDiurno2() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimTerFaixaDiurno2() != null) {
			h = rt.InteitoToHora(norma.getLimTerFaixaDiurno2());
		}
		return h;
	}

	public void setHorTerDiurno2(String horTerDiurno2) {
		Rotinas rt = new Rotinas();
		norma.setLimTerFaixaDiurno2(rt.Hora2int(horTerDiurno2));
	}

	public Ocorrencia getOcoTerDiurno3() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeTerFaixaDiurno3())) {
					ocoTerDiurno3 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoTerDiurno3;
	}

	public void setOcoTerDiurno3(Ocorrencia ocoTerDiurno3) {
		try {
			norma.setOcorrenciaHeTerFaixaDiurno3(ocoTerDiurno3.getId());
		} catch (Exception e) {
			norma.setOcorrenciaHeTerFaixaDiurno3(null);
		}
		this.ocoTerDiurno3 = ocoTerDiurno3;
	}

	public String getHorTerDiurno3() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimTerFaixaDiurno3() != null) {
			h = rt.InteitoToHora(norma.getLimTerFaixaDiurno3());
		}
		return h;
	}

	public void setHorTerDiurno3(String horTerDiurno3) {
		Rotinas rt = new Rotinas();
		norma.setLimTerFaixaDiurno3(rt.Hora2int(horTerDiurno3));
	}

	public void setOcoTerNoturno1(Ocorrencia ocoTerNoturno1) {
		try {
			norma.setOcorrenciaHeTerFaixaNot1(ocoTerNoturno1.getId());

		} catch (Exception e) {
			norma.setOcorrenciaHeTerFaixaNot1(null);
		}

		this.ocoTerNoturno1 = ocoTerNoturno1;
	}

	public Ocorrencia getOcoTerNoturno1() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeTerFaixaNot1())) {
					ocoTerNoturno1 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoTerNoturno1;
	}

	public void setOcoTerNoturno2(Ocorrencia ocoTerNoturno2) {
		try {
			norma.setOcorrenciaHeTerFaixaNot1(ocoTerNoturno2.getId());

		} catch (Exception e) {
			norma.setOcorrenciaHeTerFaixaNot2(null);
		}

		this.ocoTerNoturno2 = ocoTerNoturno2;
	}

	public Ocorrencia getOcoTerNoturno2() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeTerFaixaNot2())) {
					ocoTerNoturno2 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoTerNoturno2;
	}

	public void setOcoTerNoturno3(Ocorrencia ocoTerNoturno3) {
		try {
			norma.setOcorrenciaHeTerFaixaNot3(ocoTerNoturno3.getId());

		} catch (Exception e) {
			norma.setOcorrenciaHeTerFaixaNot3(null);
		}

		this.ocoTerNoturno3 = ocoTerNoturno3;
	}

	public Ocorrencia getOcoTerNoturno3() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeTerFaixaNot3())) {
					ocoTerNoturno3 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoTerNoturno3;
	}

	public String getHorTerNoturno1() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimTerFaixaNot1() != null) {
			h = rt.InteitoToHora(norma.getLimTerFaixaNot1());
		}
		return h;
	}

	public void setHorTerNoturno1(String horTerNoturno1) {
		Rotinas rt = new Rotinas();
		norma.setLimTerFaixaNot1(rt.Hora2int(horTerNoturno1));
	}

	public String getHorTerNoturno2() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimTerFaixaNot2() != null) {
			h = rt.InteitoToHora(norma.getLimTerFaixaNot2());
		}
		return h;
	}

	public void setHorTerNoturno2(String horTerNoturno2) {
		Rotinas rt = new Rotinas();
		norma.setLimTerFaixaNot2(rt.Hora2int(horTerNoturno2));
	}

	public String getHorTerNoturno3() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimTerFaixaNot3() != null) {
			h = rt.InteitoToHora(norma.getLimTerFaixaNot3());
		}
		return h;
	}

	public void setHorTerNoturno3(String horTerNoturno3) {
		Rotinas rt = new Rotinas();
		norma.setLimTerFaixaNot3(rt.Hora2int(horTerNoturno3));
	}

	// -------------------------
	// quarta
	// --------------------------

	public Ocorrencia getOcoQuaDiurno1() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeQuaFaixaDiurno1())) {
					ocoQuaDiurno1 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoQuaDiurno1;

	}

	public void setOcoQuaDiurno1(Ocorrencia ocoQuaDiurno1) {
		try {
			norma.setOcorrenciaHeQuaFaixaDiurno1(ocoQuaDiurno1.getId());
		} catch (Exception e) {
			norma.setOcorrenciaHeQuaFaixaDiurno1(null);
		}

		this.ocoQuaDiurno1 = ocoQuaDiurno1;
	}

	public Ocorrencia getOcoQuaDiurno2() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeQuaFaixaDiurno2())) {
					ocoQuaDiurno2 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoQuaDiurno2;

	}

	public void setOcoQuaDiurno2(Ocorrencia ocoQuaDiurno2) {
		try {
			norma.setOcorrenciaHeQuaFaixaDiurno2(ocoQuaDiurno2.getId());
		} catch (Exception e) {
			norma.setOcorrenciaHeQuaFaixaDiurno2(null);
		}

		this.ocoQuaDiurno2 = ocoQuaDiurno2;
	}

	public Ocorrencia getOcoQuaDiurno3() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeQuaFaixaDiurno3())) {
					ocoQuaDiurno3 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoQuaDiurno3;

	}

	public void setOcoQuaDiurno3(Ocorrencia ocoQuaDiurno3) {
		try {
			norma.setOcorrenciaHeQuaFaixaDiurno3(ocoQuaDiurno3.getId());
		} catch (Exception e) {
			norma.setOcorrenciaHeQuaFaixaDiurno3(null);
		}

		this.ocoQuaDiurno3 = ocoQuaDiurno3;
	}

	public void setOcoQuaNoturno1(Ocorrencia ocoQuaNoturno1) {
		try {
			norma.setOcorrenciaHeQuaFaixaNot1(ocoQuaNoturno1.getId());

		} catch (Exception e) {
			norma.setOcorrenciaHeQuaFaixaNot1(null);
		}

		this.ocoQuaNoturno1 = ocoQuaNoturno1;
	}

	public Ocorrencia getOcoQuaNoturno1() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeQuaFaixaNot1())) {
					ocoQuaNoturno1 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoQuaNoturno1;
	}

	public void setOcoQuaNoturno2(Ocorrencia ocoQuaNoturno2) {
		try {
			norma.setOcorrenciaHeQuaFaixaNot2(ocoQuaNoturno2.getId());

		} catch (Exception e) {
			norma.setOcorrenciaHeQuaFaixaNot2(null);
		}

		this.ocoQuaNoturno2 = ocoQuaNoturno2;
	}

	public Ocorrencia getOcoQuaNoturno2() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeQuaFaixaNot2())) {
					ocoQuaNoturno2 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoQuaNoturno2;
	}

	public void setOcoQuaNoturno3(Ocorrencia ocoQuaNoturno3) {
		try {
			norma.setOcorrenciaHeQuaFaixaNot3(ocoQuaNoturno3.getId());

		} catch (Exception e) {
			norma.setOcorrenciaHeQuaFaixaNot3(null);
		}

		this.ocoQuaNoturno3 = ocoQuaNoturno3;
	}

	public Ocorrencia getOcoQuaNoturno3() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeQuaFaixaNot3())) {
					ocoQuaNoturno3 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoQuaNoturno3;
	}

	public String getHorQuaDiurno1() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimQuaFaixaDiurno1() != null) {
			h = rt.InteitoToHora(norma.getLimQuaFaixaDiurno1());
		}
		return h;
	}

	public void setHorQuaDiurno1(String horQuaDiurno1) {
		Rotinas rt = new Rotinas();
		norma.setLimQuaFaixaDiurno1(rt.Hora2int(horQuaDiurno1));
	}

	public String getHorQuaDiurno2() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimQuaFaixaDiurno2() != null) {
			h = rt.InteitoToHora(norma.getLimQuaFaixaDiurno2());
		}
		return h;
	}

	public void setHorQuaDiurno2(String horQuaDiurno2) {
		Rotinas rt = new Rotinas();
		norma.setLimQuaFaixaDiurno2(rt.Hora2int(horQuaDiurno2));
	}

	public String getHorQuaDiurno3() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimQuaFaixaDiurno3() != null) {
			h = rt.InteitoToHora(norma.getLimQuaFaixaDiurno3());
		}
		return h;
	}

	public void setHorQuaDiurno3(String horQuaDiurno3) {
		Rotinas rt = new Rotinas();
		norma.setLimQuaFaixaDiurno3(rt.Hora2int(horQuaDiurno3));
	}

	public void setHorQuaNoturno1(String horQuaNoturno1) {
		Rotinas rt = new Rotinas();
		norma.setLimQuaFaixaNot1(rt.Hora2int(horQuaNoturno1));
	}

	public String getHorQuaNoturno1() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimQuaFaixaNot1() != null) {
			h = rt.InteitoToHora(norma.getLimQuaFaixaNot1());
		}
		return h;
	}

	public void setHorQuaNoturno2(String horQuaNoturno2) {
		Rotinas rt = new Rotinas();
		norma.setLimQuaFaixaNot2(rt.Hora2int(horQuaNoturno2));
	}

	public String getHorQuaNoturno2() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimQuaFaixaNot2() != null) {
			h = rt.InteitoToHora(norma.getLimQuaFaixaNot2());
		}
		return h;
	}

	public void setHorQuaNoturno3(String horQuaNoturno3) {
		Rotinas rt = new Rotinas();
		norma.setLimQuaFaixaNot3(rt.Hora2int(horQuaNoturno3));
	}

	public String getHorQuaNoturno3() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimQuaFaixaNot3() != null) {
			h = rt.InteitoToHora(norma.getLimQuaFaixaNot3());
		}
		return h;
	}

	// -------------------------
	// Quinta
	// --------------------------

	public Ocorrencia getOcoQuiDiurno1() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeQuiFaixaDiurno1())) {
					ocoQuiDiurno1 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoQuiDiurno1;

	}

	public void setOcoQuiDiurno1(Ocorrencia ocoQuiDiurno1) {
		try {
			norma.setOcorrenciaHeQuiFaixaDiurno1(ocoQuiDiurno1.getId());
		} catch (Exception e) {
			norma.setOcorrenciaHeQuiFaixaDiurno1(null);
		}

		this.ocoQuiDiurno1 = ocoQuiDiurno1;
	}

	public Ocorrencia getOcoQuiDiurno2() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeQuiFaixaDiurno2())) {
					ocoQuiDiurno2 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoQuiDiurno2;

	}

	public void setOcoQuiDiurno2(Ocorrencia ocoQuiDiurno2) {
		try {
			norma.setOcorrenciaHeQuiFaixaDiurno2(ocoQuiDiurno2.getId());
		} catch (Exception e) {
			norma.setOcorrenciaHeQuiFaixaDiurno2(null);
		}

		this.ocoQuiDiurno2 = ocoQuiDiurno2;
	}

	public Ocorrencia getOcoQuiDiurno3() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeQuiFaixaDiurno3())) {
					ocoQuiDiurno3 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoQuiDiurno3;

	}

	public void setOcoQuiDiurno3(Ocorrencia ocoQuiDiurno3) {
		try {
			norma.setOcorrenciaHeQuiFaixaDiurno3(ocoQuiDiurno3.getId());
		} catch (Exception e) {
			norma.setOcorrenciaHeQuiFaixaDiurno3(null);
		}

		this.ocoQuiDiurno3 = ocoQuiDiurno3;
	}

	public void setOcoQuiNoturno1(Ocorrencia ocoQuiNoturno1) {
		try {
			norma.setOcorrenciaHeQuiFaixaNot1(ocoQuiNoturno1.getId());

		} catch (Exception e) {
			norma.setOcorrenciaHeQuiFaixaNot1(null);
		}

		this.ocoQuiNoturno1 = ocoQuiNoturno1;
	}

	public Ocorrencia getOcoQuiNoturno1() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeQuiFaixaNot1())) {
					ocoQuiNoturno1 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoQuiNoturno1;
	}

	public void setOcoQuiNoturno2(Ocorrencia ocoQuiNoturno2) {
		try {
			norma.setOcorrenciaHeQuiFaixaNot2(ocoQuiNoturno2.getId());

		} catch (Exception e) {
			norma.setOcorrenciaHeQuiFaixaNot2(null);
		}

		this.ocoQuiNoturno2 = ocoQuiNoturno2;
	}

	public Ocorrencia getOcoQuiNoturno2() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeQuiFaixaNot2())) {
					ocoQuiNoturno2 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoQuiNoturno2;
	}

	public void setOcoQuiNoturno3(Ocorrencia ocoQuiNoturno3) {
		try {
			norma.setOcorrenciaHeQuiFaixaNot3(ocoQuiNoturno3.getId());

		} catch (Exception e) {
			norma.setOcorrenciaHeQuiFaixaNot3(null);
		}

		this.ocoQuiNoturno3 = ocoQuiNoturno3;
	}

	public Ocorrencia getOcoQuiNoturno3() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeQuiFaixaNot3())) {
					ocoQuiNoturno3 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoQuiNoturno3;
	}

	public String getHorQuiDiurno1() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimQuiFaixaDiurno1() != null) {
			h = rt.InteitoToHora(norma.getLimQuiFaixaDiurno1());
		}
		return h;
	}

	public void setHorQuiDiurno1(String horQuiDiurno1) {
		Rotinas rt = new Rotinas();
		norma.setLimQuiFaixaDiurno1(rt.Hora2int(horQuiDiurno1));
	}

	public String getHorQuiDiurno2() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimQuiFaixaDiurno2() != null) {
			h = rt.InteitoToHora(norma.getLimQuiFaixaDiurno2());
		}
		return h;
	}

	public void setHorQuiDiurno2(String horQuiDiurno2) {
		Rotinas rt = new Rotinas();
		norma.setLimQuiFaixaDiurno2(rt.Hora2int(horQuiDiurno2));
	}

	public String getHorQuiDiurno3() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimQuiFaixaDiurno3() != null) {
			h = rt.InteitoToHora(norma.getLimQuiFaixaDiurno3());
		}
		return h;
	}

	public void setHorQuiDiurno3(String horQuiDiurno3) {
		Rotinas rt = new Rotinas();
		norma.setLimQuiFaixaDiurno3(rt.Hora2int(horQuiDiurno3));
	}

	public void setHorQuiNoturno1(String horQuiNoturno1) {
		Rotinas rt = new Rotinas();
		norma.setLimQuiFaixaNot1(rt.Hora2int(horQuiNoturno1));
	}

	public String getHorQuiNoturno1() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimQuiFaixaNot1() != null) {
			h = rt.InteitoToHora(norma.getLimQuiFaixaNot1());
		}
		return h;
	}

	public void setHorQuiNoturno2(String horQuiNoturno2) {
		Rotinas rt = new Rotinas();
		norma.setLimQuiFaixaNot2(rt.Hora2int(horQuiNoturno2));
	}

	public String getHorQuiNoturno2() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimQuiFaixaNot2() != null) {
			h = rt.InteitoToHora(norma.getLimQuiFaixaNot2());
		}
		return h;
	}

	public void setHorQuiNoturno3(String horQuiNoturno3) {
		Rotinas rt = new Rotinas();
		norma.setLimQuiFaixaNot3(rt.Hora2int(horQuiNoturno3));
	}

	public String getHorQuiNoturno3() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimQuiFaixaNot3() != null) {
			h = rt.InteitoToHora(norma.getLimQuiFaixaNot3());
		}
		return h;
	}

	// -------------------------
	// Sexta
	// --------------------------

	public Ocorrencia getOcoSexDiurno1() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeSexFaixaDiurno1())) {
					ocoSexDiurno1 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoSexDiurno1;

	}

	public void setOcoSexDiurno1(Ocorrencia ocoSexDiurno1) {
		try {
			norma.setOcorrenciaHeSexFaixaDiurno1(ocoSexDiurno1.getId());
		} catch (Exception e) {
			norma.setOcorrenciaHeSexFaixaDiurno1(null);
		}

		this.ocoSexDiurno1 = ocoSexDiurno1;
	}

	public Ocorrencia getOcoSexDiurno2() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeSexFaixaDiurno2())) {
					ocoSexDiurno2 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoSexDiurno2;

	}

	public void setOcoSexDiurno2(Ocorrencia ocoSexDiurno2) {
		try {
			norma.setOcorrenciaHeSexFaixaDiurno2(ocoSexDiurno2.getId());
		} catch (Exception e) {
			norma.setOcorrenciaHeSexFaixaDiurno2(null);
		}

		this.ocoSexDiurno2 = ocoSexDiurno2;
	}

	public Ocorrencia getOcoSexDiurno3() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeSexFaixaDiurno3())) {
					ocoSexDiurno3 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoSexDiurno3;

	}

	public void setOcoSexDiurno3(Ocorrencia ocoSexDiurno3) {
		try {
			norma.setOcorrenciaHeSexFaixaDiurno3(ocoSexDiurno3.getId());
		} catch (Exception e) {
			norma.setOcorrenciaHeSexFaixaDiurno3(null);
		}

		this.ocoSexDiurno3 = ocoSexDiurno3;
	}

	public void setOcoSexNoturno1(Ocorrencia ocoSexNoturno1) {
		try {
			norma.setOcorrenciaHeSexFaixaNot1(ocoSexNoturno1.getId());

		} catch (Exception e) {
			norma.setOcorrenciaHeSexFaixaNot1(null);
		}

		this.ocoSexNoturno1 = ocoSexNoturno1;
	}

	public Ocorrencia getOcoSexNoturno1() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeSexFaixaNot1())) {
					ocoSexNoturno1 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoSexNoturno1;
	}

	public void setOcoSexNoturno2(Ocorrencia ocoSexNoturno2) {
		try {
			norma.setOcorrenciaHeSexFaixaNot2(ocoSexNoturno2.getId());

		} catch (Exception e) {
			norma.setOcorrenciaHeSexFaixaNot2(null);
		}

		this.ocoSexNoturno2 = ocoSexNoturno2;
	}

	public Ocorrencia getOcoSexNoturno2() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeSexFaixaNot2())) {
					ocoSexNoturno2 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoSexNoturno2;
	}

	public void setOcoSexNoturno3(Ocorrencia ocoSexNoturno3) {
		try {
			norma.setOcorrenciaHeSexFaixaNot3(ocoSexNoturno3.getId());

		} catch (Exception e) {
			norma.setOcorrenciaHeSexFaixaNot3(null);
		}

		this.ocoSexNoturno3 = ocoSexNoturno3;
	}

	public Ocorrencia getOcoSexNoturno3() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeSexFaixaNot3())) {
					ocoSexNoturno3 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoSexNoturno3;
	}

	public String getHorSexDiurno1() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimSexFaixaDiurno1() != null) {
			h = rt.InteitoToHora(norma.getLimSexFaixaDiurno1());
		}
		return h;
	}

	public void setHorSexDiurno1(String horSexDiurno1) {
		Rotinas rt = new Rotinas();
		norma.setLimSexFaixaDiurno1(rt.Hora2int(horSexDiurno1));
	}

	public String getHorSexDiurno2() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimSexFaixaDiurno2() != null) {
			h = rt.InteitoToHora(norma.getLimSexFaixaDiurno2());
		}
		return h;
	}

	public void setHorSexDiurno2(String horSexDiurno2) {
		Rotinas rt = new Rotinas();
		norma.setLimSexFaixaDiurno2(rt.Hora2int(horSexDiurno2));
	}

	public String getHorSexDiurno3() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimSexFaixaDiurno3() != null) {
			h = rt.InteitoToHora(norma.getLimSexFaixaDiurno3());
		}
		return h;
	}

	public void setHorSexDiurno3(String horSexDiurno3) {
		Rotinas rt = new Rotinas();
		norma.setLimSexFaixaDiurno3(rt.Hora2int(horSexDiurno3));
	}

	public void setHorSexNoturno1(String horSexNoturno1) {
		Rotinas rt = new Rotinas();
		norma.setLimSexFaixaNot1(rt.Hora2int(horSexNoturno1));
	}

	public String getHorSexNoturno1() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimSexFaixaNot1() != null) {
			h = rt.InteitoToHora(norma.getLimSexFaixaNot1());
		}
		return h;
	}

	public void setHorSexNoturno2(String horSexNoturno2) {
		Rotinas rt = new Rotinas();
		norma.setLimSexFaixaNot2(rt.Hora2int(horSexNoturno2));
	}

	public String getHorSexNoturno2() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimSexFaixaNot2() != null) {
			h = rt.InteitoToHora(norma.getLimSexFaixaNot2());
		}
		return h;
	}

	public void setHorSexNoturno3(String horSexNoturno3) {
		Rotinas rt = new Rotinas();
		norma.setLimSexFaixaNot3(rt.Hora2int(horSexNoturno3));
	}

	public String getHorSexNoturno3() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimSexFaixaNot3() != null) {
			h = rt.InteitoToHora(norma.getLimSexFaixaNot3());
		}
		return h;
	}

	// -------------------------
	// Sab
	// --------------------------

	public Ocorrencia getOcoSabDiurno1() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeSabFaixaDiurno1())) {
					ocoSabDiurno1 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoSabDiurno1;

	}

	public void setOcoSabDiurno1(Ocorrencia ocoSabDiurno1) {
		try {
			norma.setOcorrenciaHeSabFaixaDiurno1(ocoSabDiurno1.getId());
		} catch (Exception e) {
			norma.setOcorrenciaHeSabFaixaDiurno1(null);
		}

		this.ocoSabDiurno1 = ocoSabDiurno1;
	}

	public Ocorrencia getOcoSabDiurno2() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeSabFaixaDiurno2())) {
					ocoSabDiurno2 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoSabDiurno2;

	}

	public void setOcoSabDiurno2(Ocorrencia ocoSabDiurno2) {
		try {
			norma.setOcorrenciaHeSabFaixaDiurno2(ocoSabDiurno2.getId());
		} catch (Exception e) {
			norma.setOcorrenciaHeSabFaixaDiurno2(null);
		}

		this.ocoSabDiurno2 = ocoSabDiurno2;
	}

	public Ocorrencia getOcoSabDiurno3() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeSabFaixaDiurno3())) {
					ocoSabDiurno3 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoSabDiurno3;

	}

	public void setOcoSabDiurno3(Ocorrencia ocoSabDiurno3) {
		try {
			norma.setOcorrenciaHeSabFaixaDiurno3(ocoSabDiurno3.getId());
		} catch (Exception e) {
			norma.setOcorrenciaHeSabFaixaDiurno3(null);
		}

		this.ocoSabDiurno3 = ocoSabDiurno3;
	}

	public void setOcoSabNoturno1(Ocorrencia ocoSabNoturno1) {
		try {
			norma.setOcorrenciaHeSabFaixaNot1(ocoSabNoturno1.getId());

		} catch (Exception e) {
			norma.setOcorrenciaHeSabFaixaNot1(null);
		}

		this.ocoSabNoturno1 = ocoSabNoturno1;
	}

	public Ocorrencia getOcoSabNoturno1() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeSabFaixaNot1())) {
					ocoSabNoturno1 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoSabNoturno1;
	}

	public void setOcoSabNoturno2(Ocorrencia ocoSabNoturno2) {
		try {
			norma.setOcorrenciaHeSabFaixaNot2(ocoSabNoturno2.getId());

		} catch (Exception e) {
			norma.setOcorrenciaHeSabFaixaNot2(null);
		}

		this.ocoSabNoturno2 = ocoSabNoturno2;
	}

	public Ocorrencia getOcoSabNoturno2() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeSabFaixaNot2())) {
					ocoSabNoturno2 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoSabNoturno2;
	}

	public void setOcoSabNoturno3(Ocorrencia ocoSabNoturno3) {
		try {
			norma.setOcorrenciaHeSabFaixaNot3(ocoSabNoturno3.getId());

		} catch (Exception e) {
			norma.setOcorrenciaHeSabFaixaNot3(null);
		}

		this.ocoSabNoturno3 = ocoSabNoturno3;
	}

	public Ocorrencia getOcoSabNoturno3() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeSabFaixaNot3())) {
					ocoSabNoturno3 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoSabNoturno3;
	}

	public String getHorSabDiurno1() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimSabFaixaDiurno1() != null) {
			h = rt.InteitoToHora(norma.getLimSabFaixaDiurno1());
		}
		return h;
	}

	public void setHorSabDiurno1(String horSabDiurno1) {
		Rotinas rt = new Rotinas();
		norma.setLimSabFaixaDiurno1(rt.Hora2int(horSabDiurno1));
	}

	public String getHorSabDiurno2() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimSabFaixaDiurno2() != null) {
			h = rt.InteitoToHora(norma.getLimSabFaixaDiurno2());
		}
		return h;
	}

	public void setHorSabDiurno2(String horSabDiurno2) {
		Rotinas rt = new Rotinas();
		norma.setLimSabFaixaDiurno2(rt.Hora2int(horSabDiurno2));
	}

	public String getHorSabDiurno3() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimSabFaixaDiurno3() != null) {
			h = rt.InteitoToHora(norma.getLimSabFaixaDiurno3());
		}
		return h;
	}

	public void setHorSabDiurno3(String horSabDiurno3) {
		Rotinas rt = new Rotinas();
		norma.setLimSabFaixaDiurno3(rt.Hora2int(horSabDiurno3));
	}

	public void setHorSabNoturno1(String horSabNoturno1) {
		Rotinas rt = new Rotinas();
		norma.setLimSabFaixaNot1(rt.Hora2int(horSabNoturno1));
	}

	public String getHorSabNoturno1() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimSabFaixaNot1() != null) {
			h = rt.InteitoToHora(norma.getLimSabFaixaNot1());
		}
		return h;
	}

	public void setHorSabNoturno2(String horSabNoturno2) {
		Rotinas rt = new Rotinas();
		norma.setLimSabFaixaNot2(rt.Hora2int(horSabNoturno2));
	}

	public String getHorSabNoturno2() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimSabFaixaNot2() != null) {
			h = rt.InteitoToHora(norma.getLimSabFaixaNot2());
		}
		return h;
	}

	public void setHorSabNoturno3(String horSabNoturno3) {
		Rotinas rt = new Rotinas();
		norma.setLimSabFaixaNot3(rt.Hora2int(horSabNoturno3));
	}

	public String getHorSabNoturno3() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimSabFaixaNot3() != null) {
			h = rt.InteitoToHora(norma.getLimSabFaixaNot3());
		}
		return h;
	}

	// -------------------------
	// dom
	// --------------------------

	public Ocorrencia getOcoDomDiurno1() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeDomFaixaDiurno1())) {
					ocoDomDiurno1 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoDomDiurno1;

	}

	public void setOcoDomDiurno1(Ocorrencia ocoDomDiurno1) {
		try {
			norma.setOcorrenciaHeDomFaixaDiurno1(ocoDomDiurno1.getId());
		} catch (Exception e) {
			norma.setOcorrenciaHeDomFaixaDiurno1(null);
		}

		this.ocoDomDiurno1 = ocoDomDiurno1;
	}

	public Ocorrencia getOcoDomDiurno2() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeDomFaixaDiurno2())) {
					ocoDomDiurno2 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoDomDiurno2;

	}

	public void setOcoDomDiurno2(Ocorrencia ocoDomDiurno2) {
		try {
			norma.setOcorrenciaHeDomFaixaDiurno2(ocoDomDiurno2.getId());
		} catch (Exception e) {
			norma.setOcorrenciaHeDomFaixaDiurno2(null);
		}

		this.ocoDomDiurno2 = ocoDomDiurno2;
	}

	public Ocorrencia getOcoDomDiurno3() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeDomFaixaDiurno3())) {
					ocoDomDiurno3 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoDomDiurno3;

	}

	public void setOcoDomDiurno3(Ocorrencia ocoDomDiurno3) {
		try {
			norma.setOcorrenciaHeDomFaixaDiurno3(ocoDomDiurno3.getId());
		} catch (Exception e) {
			norma.setOcorrenciaHeDomFaixaDiurno3(null);
		}

		this.ocoDomDiurno3 = ocoDomDiurno3;
	}

	public void setOcoDomNoturno1(Ocorrencia ocoDomNoturno1) {
		try {
			norma.setOcorrenciaHeDomFaixaNot1(ocoDomNoturno1.getId());

		} catch (Exception e) {
			norma.setOcorrenciaHeDomFaixaNot1(null);
		}

		this.ocoDomNoturno1 = ocoDomNoturno1;
	}

	public Ocorrencia getOcoDomNoturno1() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeDomFaixaNot1())) {
					ocoDomNoturno1 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoDomNoturno1;
	}

	public void setOcoDomNoturno2(Ocorrencia ocoDomNoturno2) {
		try {
			norma.setOcorrenciaHeDomFaixaNot2(ocoDomNoturno2.getId());

		} catch (Exception e) {
			norma.setOcorrenciaHeDomFaixaNot2(null);
		}

		this.ocoDomNoturno2 = ocoDomNoturno2;
	}

	public Ocorrencia getOcoDomNoturno2() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeDomFaixaNot2())) {
					ocoDomNoturno2 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoDomNoturno2;
	}

	public void setOcoDomNoturno3(Ocorrencia ocoDomNoturno3) {
		try {
			norma.setOcorrenciaHeDomFaixaNot3(ocoDomNoturno3.getId());

		} catch (Exception e) {
			norma.setOcorrenciaHeDomFaixaNot3(null);
		}

		this.ocoDomNoturno3 = ocoDomNoturno3;
	}

	public Ocorrencia getOcoDomNoturno3() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeDomFaixaNot3())) {
					ocoDomNoturno3 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoDomNoturno3;
	}

	public String getHorDomDiurno1() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimDomFaixaDiurno1() != null) {
			h = rt.InteitoToHora(norma.getLimDomFaixaDiurno1());
		}
		return h;
	}

	public void setHorDomDiurno1(String horDomDiurno1) {
		Rotinas rt = new Rotinas();
		norma.setLimDomFaixaDiurno1(rt.Hora2int(horDomDiurno1));
	}

	public String getHorDomDiurno2() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimDomFaixaDiurno2() != null) {
			h = rt.InteitoToHora(norma.getLimDomFaixaDiurno2());
		}
		return h;
	}

	public void setHorDomDiurno2(String horDomDiurno2) {
		Rotinas rt = new Rotinas();
		norma.setLimDomFaixaDiurno2(rt.Hora2int(horDomDiurno2));
	}

	public String getHorDomDiurno3() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimDomFaixaDiurno3() != null) {
			h = rt.InteitoToHora(norma.getLimDomFaixaDiurno3());
		}
		return h;
	}

	public void setHorDomDiurno3(String horDomDiurno3) {
		Rotinas rt = new Rotinas();
		norma.setLimDomFaixaDiurno3(rt.Hora2int(horDomDiurno3));
	}

	public void setHorDomNoturno1(String horDomNoturno1) {
		Rotinas rt = new Rotinas();
		norma.setLimDomFaixaNot1(rt.Hora2int(horDomNoturno1));
	}

	public String getHorDomNoturno1() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimDomFaixaNot1() != null) {
			h = rt.InteitoToHora(norma.getLimDomFaixaNot1());
		}
		return h;
	}

	public void setHorDomNoturno2(String horDomNoturno2) {
		Rotinas rt = new Rotinas();
		norma.setLimDomFaixaNot2(rt.Hora2int(horDomNoturno2));
	}

	public String getHorDomNoturno2() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimDomFaixaNot2() != null) {
			h = rt.InteitoToHora(norma.getLimDomFaixaNot2());
		}
		return h;
	}

	public void setHorDomNoturno3(String horDomNoturno3) {
		Rotinas rt = new Rotinas();
		norma.setLimDomFaixaNot3(rt.Hora2int(horDomNoturno3));
	}

	public String getHorDomNoturno3() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimDomFaixaNot3() != null) {
			h = rt.InteitoToHora(norma.getLimDomFaixaNot3());
		}
		return h;
	}

	// -------------------------
	// Fer
	// --------------------------

	public Ocorrencia getOcoFerDiurno1() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeFerFaixaDiurno1())) {
					ocoFerDiurno1 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoFerDiurno1;

	}

	public void setOcoFerDiurno1(Ocorrencia ocoFerDiurno1) {
		try {
			norma.setOcorrenciaHeFerFaixaDiurno1(ocoFerDiurno1.getId());
		} catch (Exception e) {
			norma.setOcorrenciaHeFerFaixaDiurno1(null);
		}

		this.ocoFerDiurno1 = ocoFerDiurno1;
	}

	public Ocorrencia getOcoFerDiurno2() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeFerFaixaDiurno2())) {
					ocoFerDiurno2 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoFerDiurno2;

	}

	public void setOcoFerDiurno2(Ocorrencia ocoFerDiurno2) {
		try {
			norma.setOcorrenciaHeFerFaixaDiurno2(ocoFerDiurno2.getId());
		} catch (Exception e) {
			norma.setOcorrenciaHeFerFaixaDiurno2(null);
		}

		this.ocoFerDiurno2 = ocoFerDiurno2;
	}

	public Ocorrencia getOcoFerDiurno3() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeFerFaixaDiurno3())) {
					ocoFerDiurno3 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoFerDiurno3;

	}

	public void setOcoFerDiurno3(Ocorrencia ocoFerDiurno3) {
		try {
			norma.setOcorrenciaHeFerFaixaDiurno3(ocoFerDiurno3.getId());
		} catch (Exception e) {
			norma.setOcorrenciaHeFerFaixaDiurno3(null);
		}

		this.ocoFerDiurno3 = ocoFerDiurno3;
	}

	public void setOcoFerNoturno1(Ocorrencia ocoFerNoturno1) {
		try {
			norma.setOcorrenciaHeFerFaixaNot1(ocoFerNoturno1.getId());

		} catch (Exception e) {
			norma.setOcorrenciaHeFerFaixaNot1(null);
		}

		this.ocoFerNoturno1 = ocoFerNoturno1;
	}

	public Ocorrencia getOcoFerNoturno1() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeFerFaixaNot1())) {
					ocoFerNoturno1 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoFerNoturno1;
	}

	public void setOcoFerNoturno2(Ocorrencia ocoFerNoturno2) {
		try {
			norma.setOcorrenciaHeFerFaixaNot2(ocoFerNoturno2.getId());

		} catch (Exception e) {
			norma.setOcorrenciaHeFerFaixaNot2(null);
		}

		this.ocoFerNoturno2 = ocoFerNoturno2;
	}

	public Ocorrencia getOcoFerNoturno2() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeFerFaixaNot2())) {
					ocoFerNoturno2 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoFerNoturno2;
	}

	public void setOcoFerNoturno3(Ocorrencia ocoFerNoturno3) {
		try {
			norma.setOcorrenciaHeFerFaixaNot3(ocoFerNoturno3.getId());

		} catch (Exception e) {
			norma.setOcorrenciaHeFerFaixaNot3(null);
		}

		this.ocoFerNoturno3 = ocoFerNoturno3;
	}

	public Ocorrencia getOcoFerNoturno3() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeFerFaixaNot3())) {
					ocoFerNoturno3 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoFerNoturno3;
	}

	public String getHorFerDiurno1() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimFerFaixaDiurno1() != null) {
			h = rt.InteitoToHora(norma.getLimFerFaixaDiurno1());
		}
		return h;
	}

	public void setHorFerDiurno1(String horFerDiurno1) {
		Rotinas rt = new Rotinas();
		norma.setLimFerFaixaDiurno1(rt.Hora2int(horFerDiurno1));
	}

	public String getHorFerDiurno2() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimFerFaixaDiurno2() != null) {
			h = rt.InteitoToHora(norma.getLimFerFaixaDiurno2());
		}
		return h;
	}

	public void setHorFerDiurno2(String horFerDiurno2) {
		Rotinas rt = new Rotinas();
		norma.setLimFerFaixaDiurno2(rt.Hora2int(horFerDiurno2));
	}

	public String getHorFerDiurno3() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimFerFaixaDiurno3() != null) {
			h = rt.InteitoToHora(norma.getLimFerFaixaDiurno3());
		}
		return h;
	}

	public void setHorFerDiurno3(String horFerDiurno3) {
		Rotinas rt = new Rotinas();
		norma.setLimFerFaixaDiurno3(rt.Hora2int(horFerDiurno3));
	}

	public void setHorFerNoturno1(String horFerNoturno1) {
		Rotinas rt = new Rotinas();
		norma.setLimFerFaixaNot1(rt.Hora2int(horFerNoturno1));
	}

	public String getHorFerNoturno1() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimFerFaixaNot1() != null) {
			h = rt.InteitoToHora(norma.getLimFerFaixaNot1());
		}
		return h;
	}

	public void setHorFerNoturno2(String horFerNoturno2) {
		Rotinas rt = new Rotinas();
		norma.setLimFerFaixaNot2(rt.Hora2int(horFerNoturno2));
	}

	public String getHorFerNoturno2() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimFerFaixaNot2() != null) {
			h = rt.InteitoToHora(norma.getLimFerFaixaNot2());
		}
		return h;
	}

	public void setHorFerNoturno3(String horFerNoturno3) {
		Rotinas rt = new Rotinas();
		norma.setLimFerFaixaNot3(rt.Hora2int(horFerNoturno3));
	}

	public String getHorFerNoturno3() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimFerFaixaNot3() != null) {
			h = rt.InteitoToHora(norma.getLimFerFaixaNot3());
		}
		return h;
	}

	// -------------------------
	// Fol
	// --------------------------
	public Ocorrencia getOcoFolDiurno1() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeFolFaixaDiurno1())) {
					ocoFolDiurno1 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoFolDiurno1;

	}

	public void setOcoFolDiurno1(Ocorrencia ocoFolDiurno1) {
		try {
			norma.setOcorrenciaHeFolFaixaDiurno1(ocoFolDiurno1.getId());
		} catch (Exception e) {
			norma.setOcorrenciaHeFolFaixaDiurno1(null);
		}

		this.ocoFolDiurno1 = ocoFolDiurno1;
	}

	public Ocorrencia getOcoFolDiurno2() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeFolFaixaDiurno2())) {
					ocoFolDiurno2 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoFolDiurno2;

	}

	public void setOcoFolDiurno2(Ocorrencia ocoFolDiurno2) {
		try {
			norma.setOcorrenciaHeFolFaixaDiurno2(ocoFolDiurno2.getId());
		} catch (Exception e) {
			norma.setOcorrenciaHeFolFaixaDiurno2(null);
		}

		this.ocoFolDiurno2 = ocoFolDiurno2;
	}

	public Ocorrencia getOcoFolDiurno3() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeFolFaixaDiurno3())) {
					ocoFolDiurno3 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoFolDiurno3;

	}

	public void setOcoFolDiurno3(Ocorrencia ocoFolDiurno3) {
		try {
			norma.setOcorrenciaHeFolFaixaDiurno3(ocoFolDiurno3.getId());
		} catch (Exception e) {
			norma.setOcorrenciaHeFolFaixaDiurno3(null);
		}

		this.ocoFolDiurno3 = ocoFolDiurno3;
	}

	public void setOcoFolNoturno1(Ocorrencia ocoFolNoturno1) {
		try {
			norma.setOcorrenciaHeFolFaixaNot1(ocoFolNoturno1.getId());

		} catch (Exception e) {
			norma.setOcorrenciaHeFolFaixaNot1(null);
		}

		this.ocoFolNoturno1 = ocoFolNoturno1;
	}

	public Ocorrencia getOcoFolNoturno1() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeFolFaixaNot1())) {
					ocoFolNoturno1 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoFolNoturno1;
	}

	public void setOcoFolNoturno2(Ocorrencia ocoFolNoturno2) {
		try {
			norma.setOcorrenciaHeFolFaixaNot2(ocoFolNoturno2.getId());

		} catch (Exception e) {
			norma.setOcorrenciaHeFolFaixaNot2(null);
		}

		this.ocoFolNoturno2 = ocoFolNoturno2;
	}

	public Ocorrencia getOcoFolNoturno2() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeFolFaixaNot2())) {
					ocoFolNoturno2 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoFolNoturno2;
	}

	public void setOcoFolNoturno3(Ocorrencia ocoFolNoturno3) {
		try {
			norma.setOcorrenciaHeFolFaixaNot3(ocoFolNoturno3.getId());

		} catch (Exception e) {
			norma.setOcorrenciaHeFolFaixaNot3(null);
		}

		this.ocoFolNoturno3 = ocoFolNoturno3;
	}

	public Ocorrencia getOcoFolNoturno3() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals( norma.getOcorrenciaHeFolFaixaNot3())) {
					ocoFolNoturno3 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoFolNoturno3;
	}

	public String getHorFolDiurno1() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimFolFaixaDiurno1() != null) {
			h = rt.InteitoToHora(norma.getLimFolFaixaDiurno1());
		}
		return h;
	}

	public void setHorFolDiurno1(String horFolDiurno1) {
		Rotinas rt = new Rotinas();
		norma.setLimFolFaixaDiurno1(rt.Hora2int(horFolDiurno1));
	}

	public String getHorFolDiurno2() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimFolFaixaDiurno2() != null) {
			h = rt.InteitoToHora(norma.getLimFolFaixaDiurno2());
		}
		return h;
	}

	public void setHorFolDiurno2(String horFolDiurno2) {
		Rotinas rt = new Rotinas();
		norma.setLimFolFaixaDiurno2(rt.Hora2int(horFolDiurno2));
	}

	public String getHorFolDiurno3() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimFolFaixaDiurno3() != null) {
			h = rt.InteitoToHora(norma.getLimFolFaixaDiurno3());
		}
		return h;
	}

	public void setHorFolDiurno3(String horFolDiurno3) {
		Rotinas rt = new Rotinas();
		norma.setLimFolFaixaDiurno3(rt.Hora2int(horFolDiurno3));
	}

	public void setHorFolNoturno1(String horFolNoturno1) {
		Rotinas rt = new Rotinas();
		norma.setLimFolFaixaNot1(rt.Hora2int(horFolNoturno1));
	}

	public String getHorFolNoturno1() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimFolFaixaNot1() != null) {
			h = rt.InteitoToHora(norma.getLimFolFaixaNot1());
		}
		return h;
	}

	public void setHorFolNoturno2(String horFolNoturno2) {
		Rotinas rt = new Rotinas();
		norma.setLimFolFaixaNot2(rt.Hora2int(horFolNoturno2));
	}

	public String getHorFolNoturno2() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimFolFaixaNot2() != null) {
			h = rt.InteitoToHora(norma.getLimFolFaixaNot2());
		}
		return h;
	}

	public void setHorFolNoturno3(String horFolNoturno3) {
		Rotinas rt = new Rotinas();
		norma.setLimFolFaixaNot3(rt.Hora2int(horFolNoturno3));
	}

	public String getHorFolNoturno3() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimFolFaixaNot3() != null) {
			h = rt.InteitoToHora(norma.getLimFolFaixaNot3());
		}
		return h;
	}

	// -------------------------
	// Esp
	// --------------------------
	public Ocorrencia getOcoEspDiurno1() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeEspFaixaDiurno1())) {
					ocoEspDiurno1 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoEspDiurno1;

	}

	public void setOcoEspDiurno1(Ocorrencia ocoEspDiurno1) {
		try {
			norma.setOcorrenciaHeEspFaixaDiurno1(ocoEspDiurno1.getId());
		} catch (Exception e) {
			norma.setOcorrenciaHeEspFaixaDiurno1(null);
		}

		this.ocoEspDiurno1 = ocoEspDiurno1;
	}

	public Ocorrencia getOcoEspDiurno2() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeEspFaixaDiurno2())) {
					ocoEspDiurno2 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoEspDiurno2;

	}

	public void setOcoEspDiurno2(Ocorrencia ocoEspDiurno2) {
		try {
			norma.setOcorrenciaHeEspFaixaDiurno2(ocoEspDiurno2.getId());
		} catch (Exception e) {
			norma.setOcorrenciaHeEspFaixaDiurno2(null);
		}

		this.ocoEspDiurno2 = ocoEspDiurno2;
	}

	public Ocorrencia getOcoEspDiurno3() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeEspFaixaDiurno3())) {
					ocoEspDiurno3 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoEspDiurno3;

	}

	public void setOcoEspDiurno3(Ocorrencia ocoEspDiurno3) {
		try {
			norma.setOcorrenciaHeEspFaixaDiurno3(ocoEspDiurno3.getId());
		} catch (Exception e) {
			norma.setOcorrenciaHeEspFaixaDiurno3(null);
		}

		this.ocoEspDiurno3 = ocoEspDiurno3;
	}

	public void setOcoEspNoturno1(Ocorrencia ocoEspNoturno1) {
		try {
			norma.setOcorrenciaHeEspFaixaNot1(ocoEspNoturno1.getId());

		} catch (Exception e) {
			norma.setOcorrenciaHeEspFaixaNot1(null);
		}

		this.ocoEspNoturno1 = ocoEspNoturno1;
	}

	public Ocorrencia getOcoEspNoturno1() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeEspFaixaNot1())) {
					ocoEspNoturno1 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoEspNoturno1;
	}

	public void setOcoEspNoturno2(Ocorrencia ocoEspNoturno2) {
		try {
			norma.setOcorrenciaHeEspFaixaNot2(ocoEspNoturno2.getId());

		} catch (Exception e) {
			norma.setOcorrenciaHeEspFaixaNot2(null);
		}

		this.ocoEspNoturno2 = ocoEspNoturno2;
	}

	public Ocorrencia getOcoEspNoturno2() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeEspFaixaNot2())) {
					ocoEspNoturno2 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoEspNoturno2;
	}

	public void setOcoEspNoturno3(Ocorrencia ocoEspNoturno3) {
		try {
			norma.setOcorrenciaHeEspFaixaNot3(ocoEspNoturno3.getId());

		} catch (Exception e) {
			norma.setOcorrenciaHeEspFaixaNot3(null);
		}

		this.ocoEspNoturno3 = ocoEspNoturno3;
	}

	public Ocorrencia getOcoEspNoturno3() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHeEspFaixaNot3())) {
					ocoEspNoturno3 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoEspNoturno3;
	}

	public String getHorEspDiurno1() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimEspFaixaDiurno1() != null) {
			h = rt.InteitoToHora(norma.getLimEspFaixaDiurno1());
		}
		return h;
	}

	public void setHorEspDiurno1(String horEspDiurno1) {
		Rotinas rt = new Rotinas();
		norma.setLimEspFaixaDiurno1(rt.Hora2int(horEspDiurno1));
	}

	public String getHorEspDiurno2() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimEspFaixaDiurno2() != null) {
			h = rt.InteitoToHora(norma.getLimEspFaixaDiurno2());
		}
		return h;
	}

	public void setHorEspDiurno2(String horEspDiurno2) {
		Rotinas rt = new Rotinas();
		norma.setLimEspFaixaDiurno2(rt.Hora2int(horEspDiurno2));
	}

	public String getHorEspDiurno3() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimEspFaixaDiurno3() != null) {
			h = rt.InteitoToHora(norma.getLimEspFaixaDiurno3());
		}
		return h;
	}

	public void setHorEspDiurno3(String horEspDiurno3) {
		Rotinas rt = new Rotinas();
		norma.setLimEspFaixaDiurno3(rt.Hora2int(horEspDiurno3));
	}

	public void setHorEspNoturno1(String horEspNoturno1) {
		Rotinas rt = new Rotinas();
		norma.setLimEspFaixaNot1(rt.Hora2int(horEspNoturno1));
	}

	public String getHorEspNoturno1() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimEspFaixaNot1() != null) {
			h = rt.InteitoToHora(norma.getLimEspFaixaNot1());
		}
		return h;
	}

	public void setHorEspNoturno2(String horEspNoturno2) {
		Rotinas rt = new Rotinas();
		norma.setLimEspFaixaNot2(rt.Hora2int(horEspNoturno2));
	}

	public String getHorEspNoturno2() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimEspFaixaNot2() != null) {
			h = rt.InteitoToHora(norma.getLimEspFaixaNot2());
		}
		return h;
	}

	public void setHorEspNoturno3(String horEspNoturno3) {
		Rotinas rt = new Rotinas();
		norma.setLimEspFaixaNot3(rt.Hora2int(horEspNoturno3));
	}

	public String getHorEspNoturno3() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (norma.getLimEspFaixaNot3() != null) {
			h = rt.InteitoToHora(norma.getLimEspFaixaNot3());
		}
		return h;
	}

	public Ocorrencia getOcoFalta() {
		
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaFaltas())) {
					ocoFalta = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoFalta;
	}

	public void setOcoFalta(Ocorrencia ocoFalta) {
		try {
			norma.setOcorrenciaFaltas(ocoFalta.getId());

		} catch (Exception e) {
			norma.setOcorrenciaFaltas(null);
		}
		this.ocoFalta = ocoFalta;
	}

	public Ocorrencia getOcoAdicionalNoturno() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaAdicionalNoturno())) {
					ocoAdicionalNoturno = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoAdicionalNoturno;
	}

	public void setOcoAdicionalNoturno(Ocorrencia ocoAdicionalNoturno) {
		try {
			norma.setOcorrenciaAdicionalNoturno(ocoAdicionalNoturno.getId());
		} catch (Exception e) {
			norma.setOcorrenciaFaltas(null);
		}
		this.ocoAdicionalNoturno = ocoAdicionalNoturno;
	}

	public Ocorrencia getOcoAfastamento() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
			    if (o.getId().equals(norma.getOcorrenciaAfastamento())) {
					ocoAfastamento = o;
				}
			}
			
		} catch (Exception e) {
		}
		return ocoAfastamento;
	}

	public void setOcoAfastamento(Ocorrencia ocoAfastamento) {
		try {
			norma.setOcorrenciaAfastamento(ocoAfastamento.getId());
		} catch (Exception e) {
			System.out.println("nao gravei afastamento");
			norma.setOcorrenciaAfastamento(null);
		}
		this.ocoAfastamento = ocoAfastamento;
		
		
		
	}

	public Ocorrencia getOcoDSR() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaDSR())) {
					ocoDSR = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoDSR;
	}

	public void setOcoDSR(Ocorrencia ocoDSR) {
		try {
			norma.setOcorrenciaDSR(ocoDSR.getId());
		} catch (Exception e) {
			norma.setOcorrenciaDSR(null);
		}
		this.ocoDSR = ocoDSR;
	}

	public Ocorrencia getOcoAtraso() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaAtraso())) {
					ocoAtraso = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoAtraso;
	}

	public void setOcoAtraso(Ocorrencia ocoAtraso) {
		try {
			norma.setOcorrenciaAtraso(ocoAtraso.getId());
		} catch (Exception e) {
			norma.setOcorrenciaAtraso(null);
		}
		this.ocoAtraso = ocoAtraso;
	}

	public Ocorrencia getOcoHorasNormais() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHorasNormais())) {
					ocoHorasNormais = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoHorasNormais;
	}

	public void setOcoHorasNormais(Ocorrencia ocoHorasNormais) {
		try {
			norma.setOcorrenciaHorasNormais(ocoHorasNormais.getId());
		} catch (Exception e) {
			norma.setOcorrenciaHorasNormais(null);
		}
		this.ocoHorasNormais = ocoHorasNormais;
	}

	public Ocorrencia getOcoHorasNormaisTolerancia() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHorasNormaisTolerancia())) {
					ocoHorasNormaisTolerancia = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoHorasNormaisTolerancia;
	}

	public void setOcoHorasNormaisTolerancia(
			Ocorrencia ocoHorasNormaisTolerancia) {
		try {
			norma.setOcorrenciaHorasNormaisTolerancia(ocoHorasNormaisTolerancia
					.getId());
		} catch (Exception e) {
			norma.setOcorrenciaHorasNormaisTolerancia(null);
		}
		this.ocoHorasNormaisTolerancia = ocoHorasNormaisTolerancia;
	}

	public Ocorrencia getOcoHorasAtraso() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaAtraso())) {
					ocoHorasAtraso = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoHorasAtraso;
	}

	public void setOcoHorasAtraso(Ocorrencia ocoHorasAtraso) {
		try {
			norma.setOcorrenciaAtraso(ocoHorasAtraso.getId());
		} catch (Exception e) {
			norma.setOcorrenciaAtraso(null);
		}
		this.ocoHorasAtraso = ocoHorasAtraso;
	}

	public Ocorrencia getOcoHorasAtraso2() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaAtraso2())) {
					ocoHorasAtraso2 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoHorasAtraso2;
	}

	public void setOcoHorasAtraso2(Ocorrencia ocoHorasAtraso2) {
		try {
			norma.setOcorrenciaAtraso2(ocoHorasAtraso2.getId());
		} catch (Exception e) {
			norma.setOcorrenciaAtraso2(null);
		}
		this.ocoHorasAtraso2 = ocoHorasAtraso2;
	}

	public Ocorrencia getOcoHorasSaidaAntecipada() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaSaidaAntecipada())) {
					ocoHorasSaidaAntecipada = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoHorasSaidaAntecipada;
	}

	public void setOcoHorasSaidaAntecipada(Ocorrencia ocoHorasSaidaAntecipada) {
		try {
			norma.setOcorrenciaSaidaAntecipada(ocoHorasSaidaAntecipada.getId());
		} catch (Exception e) {
			norma.setOcorrenciaSaidaAntecipada(null);
		}
		this.ocoHorasSaidaAntecipada = ocoHorasSaidaAntecipada;
	}

	public Ocorrencia getOcoHorasSaidaAntecipada2() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaSaidaAntecipada2())) {
					ocoHorasSaidaAntecipada2 = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoHorasSaidaAntecipada2;
	}

	public void setOcoHorasSaidaAntecipada2(Ocorrencia ocoHorasSaidaAntecipada2) {
		try {
			norma.setOcorrenciaSaidaAntecipada2(ocoHorasSaidaAntecipada2.getId());
		} catch (Exception e) {
			norma.setOcorrenciaSaidaAntecipada2(null);
		}
		this.ocoHorasSaidaAntecipada2 = ocoHorasSaidaAntecipada2;
	}

	
	public Ocorrencia getOcoHorasAtrasoNaoDescontado() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaAtrasoNaoDescontato())) {
					ocoHorasAtrasoNaoDescontado = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoHorasAtrasoNaoDescontado;
	}

	public void setOcoHorasAtrasoNaoDescontado(Ocorrencia ocoHorasAtrasoNaoDescontado) {
		try {
			norma.setOcorrenciaAtrasoNaoDescontato(ocoHorasAtrasoNaoDescontado .getId());
		} catch (Exception e) {
			norma.setOcorrenciaAtrasoNaoDescontato(null);
		}
		this.ocoHorasAtrasoNaoDescontado = ocoHorasAtrasoNaoDescontado;
	}

	public Ocorrencia getOcoHorasSaidaAntecipadaNaoDescontada() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaSaidaAntecipadaNaoDescontada())) {
					ocoHorasSaidaAntecipadaNaoDescontada = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoHorasSaidaAntecipadaNaoDescontada;
	}

	public void setOcoHorasSaidaAntecipadaNaoDescontada(
			Ocorrencia ocoHorasSaidaAntecipadaNaoDescontada) {
		try {
			norma.setOcorrenciaSaidaAntecipadaNaoDescontada(ocoHorasSaidaAntecipadaNaoDescontada.getId());
		} catch (Exception e) {
			norma.setOcorrenciaSaidaAntecipadaNaoDescontada(null);
		}
		this.ocoHorasSaidaAntecipadaNaoDescontada = ocoHorasSaidaAntecipadaNaoDescontada;
	}

	public Ocorrencia getOcoFolga() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaFolga())) {
					ocoFolga = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoFolga;
	}

	public void setOcoFolga(Ocorrencia ocoFolga) {
		try {
			norma.setOcorrenciaFolga(ocoFolga.getId());
		} catch (Exception e) {
			norma.setOcorrenciaFolga(null);
		}
		this.ocoFolga = ocoFolga;
	}
	
	public Ocorrencia getOcoHorasNormaisNoturna() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaHorasNormaisNoturna())) {
					ocoHorasNormaisNoturna = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoHorasNormaisNoturna;
		
	}

	public void setOcoHorasNormaisNoturna(Ocorrencia ocoHorasNormaisNoturna) {
		try {
			norma.setOcorrenciaHorasNormaisNoturna(ocoHorasNormaisNoturna.getId());
		} catch (Exception e) {
			norma.setOcorrenciaHorasNormaisNoturna(null);
		}
		this.ocoHorasNormaisNoturna = ocoHorasNormaisNoturna;
	}
	
	
	

  public Ocorrencia getOcoDebito() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaDebito())) {
					ocoDebito = o;
				}
			}
		} catch (Exception e) {
		}
		return ocoDebito;
	}

	public void setOcoDebito(Ocorrencia ocoDebito) {		
		try {
			norma.setOcorrenciaDebito(ocoDebito.getId());
		} catch (Exception e) {
			norma.setOcorrenciaDebito(null);
		}		
		this.ocoDebito = ocoDebito;
	}

	public Ocorrencia getOcoCredito() {
		try {
			for (Ocorrencia o : listaOcorrencia) {
				if (o.getId().equals(norma.getOcorrenciaCredito())) {
					ocoCredito = o;
				}
			}
		} catch (Exception e) {
		}

		return ocoCredito;
	}

	public void setOcoCredito(Ocorrencia ocoCredito) {
		try {
			norma.setOcorrenciaCredito(ocoCredito.getId());
		} catch (Exception e) {
			norma.setOcorrenciaCredito(null);
		}		
		this.ocoCredito = ocoCredito;
	}

public void copiaHe(){
	  setOcoTerDiurno1( ocoSegDiurno1);
	  setOcoTerDiurno2( ocoSegDiurno2);
	  setOcoTerDiurno3( ocoSegDiurno3);
	  setOcoTerNoturno1(ocoSegNoturno1);
	  setOcoTerNoturno2(ocoSegNoturno2);
	  setOcoTerNoturno3(ocoSegNoturno3);

	  setOcoQuaDiurno1( ocoSegDiurno1);
	  setOcoQuaDiurno2( ocoSegDiurno2);
	  setOcoQuaDiurno3( ocoSegDiurno3);
	  setOcoQuaNoturno1(ocoSegNoturno1);
	  setOcoQuaNoturno2(ocoSegNoturno2);
	  setOcoQuaNoturno3(ocoSegNoturno3);
	  
	  setOcoQuiDiurno1( ocoSegDiurno1);
	  setOcoQuiDiurno2( ocoSegDiurno2);
	  setOcoQuiDiurno3( ocoSegDiurno3);
	  setOcoQuiNoturno1(ocoSegNoturno1);
	  setOcoQuiNoturno2(ocoSegNoturno2);
	  setOcoQuiNoturno3(ocoSegNoturno3);
	  	  
	  setOcoSexDiurno1( ocoSegDiurno1);
	  setOcoSexDiurno2( ocoSegDiurno2);
	  setOcoSexDiurno3( ocoSegDiurno3);
	  setOcoSexNoturno1(ocoSegNoturno1);
	  setOcoSexNoturno2(ocoSegNoturno2);
	  setOcoSexNoturno3(ocoSegNoturno3);
	  	 	  
  }

		  
	
}
