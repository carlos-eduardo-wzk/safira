package controle;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Jornada;
import service.CadastroJornadaService;
import util.Rotinas;
import util.jsf.FacesUtil;

@Named
@ViewScoped
public class CadastroJornadaBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private CadastroJornadaService cadastroServiceJornada;;
	private Jornada jornada;

	private String horIniE1;
	private String horIniS1;
	private String horIniE2;
	private String horIniS2;
	private String horIniE3;
	private String horIniS3;
	private String horIniE4;
	private String horIniS4;
		
	private String HorPreAssinaladoS1;
	private String HorPreAssinaladoE2;
			
	private String fechamento;
	
	private String descontaIntervalo;
	private String dsr;

	
	
	public CadastroJornadaBean() {
		jornada = new Jornada();
	}

	public Jornada getJornada() {
		return jornada;
	}

	public void setJornada(Jornada jornada) {
		this.jornada = jornada;
	}

	public void salvar() {
		cadastroServiceJornada.salvar(jornada);
		FacesUtil.addInfoMessage("Cadastrado com sucesso");
	}

	public boolean isEditando() {
		return this.jornada.getId() != null;

	}

		
	public String getHorIniE1() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (jornada.getE1() != null) {
			h = rt.InteitoToHora(jornada.getE1());
		}
		return h;
	}

	public void setHorIniE1(String horIni) {
		Rotinas rt = new Rotinas();
		jornada.setE1(rt.Hora2int(horIni));
	}

	public String getHorIniS1() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (jornada.getS1() != null) {
			h = rt.InteitoToHora(jornada.getS1());
		}
		return h;
	}

	public void setHorIniS1(String horIniS1) {
		Rotinas rt = new Rotinas();
		jornada.setS1(rt.Hora2int(horIniS1));
	}

	public String getHorIniE2() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (jornada.getE2() != null) {
			h = rt.InteitoToHora(jornada.getE2());
		}
		return h;
	}

	public void setHorIniE2(String horIniE2) {
		Rotinas rt = new Rotinas();
		jornada.setE2(rt.Hora2int(horIniE2));
	}

	public String getHorIniS2() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (jornada.getS2() != null) {
			h = rt.InteitoToHora(jornada.getS2());
		}
		return h;
	}

	public void setHorIniS2(String horIniS2) {
		Rotinas rt = new Rotinas();
		jornada.setS2(rt.Hora2int(horIniS2));
	}

	public String getHorIniE3() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (jornada.getE3() != null) {
			h = rt.InteitoToHora(jornada.getE3());
		}
		return h;
	}

	public void setHorIniE3(String horIniE3) {
		Rotinas rt = new Rotinas();
		jornada.setE3(rt.Hora2int(horIniE3));
	}

	public String getHorIniS3() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (jornada.getS3() != null) {
			h = rt.InteitoToHora(jornada.getS3());
		}
		return h;
	}

	public void setHorIniS3(String horIniS3) {
		Rotinas rt = new Rotinas();
		jornada.setS3(rt.Hora2int(horIniS3));
	}

	public String getHorIniE4() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (jornada.getE4() != null) {
			h = rt.InteitoToHora(jornada.getE4());
		}
		return h;
	}

	public void setHorIniE4(String horIniE4) {
		Rotinas rt = new Rotinas();
		jornada.setE4(rt.Hora2int(horIniE4));
	}

	public String getHorIniS4() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (jornada.getS4() != null) {
			h = rt.InteitoToHora(jornada.getS4());
		}
		return h;
	}

	public void setHorIniS4(String horIniS4) {
		Rotinas rt = new Rotinas();
		jornada.setS4(rt.Hora2int(horIniS4));
	}

	public String getHorPreAssinaladoS1() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (jornada.getPreassinalados1() != null) {
			h = rt.InteitoToHora(jornada.getPreassinalados1());
		}
		return h;
		
	}

	public void setHorPreAssinaladoS1(String horPreAssinaladoS1) {
		Rotinas rt = new Rotinas();
		jornada.setPreassinalados1(rt.Hora2int(horPreAssinaladoS1));

	}

	public String getHorPreAssinaladoE2() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (jornada.getPreassinaladoe2() != null) {
			h = rt.InteitoToHora(jornada.getPreassinaladoe2());
		}
		return h;
	}

	public void setHorPreAssinaladoE2(String horPreAssinaladoE2) {
		Rotinas rt = new Rotinas();
		jornada.setPreassinaladoe2(rt.Hora2int(horPreAssinaladoE2));
	}

	public String getFechamento() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (jornada.getFechamento() != null) {
			h = rt.InteitoToHora(jornada.getFechamento());
		}
		return h;
	}

	public void setFechamento(String fechamento) {
		Rotinas rt = new Rotinas();
		jornada.setFechamento(rt.Hora2int(fechamento));
	}


	public String getDescontaIntervalo() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (jornada.getDescIntervaloDuasMarcacoes() != null) {
			h = rt.InteitoToHora(jornada.getDescIntervaloDuasMarcacoes());
		}
		return h;		
	}

	public void setDescontaIntervalo(String dscontaIntervalo) {
		Rotinas rt = new Rotinas();
		jornada.setDescIntervaloDuasMarcacoes(rt.Hora2int(dscontaIntervalo));		
	}

	public String getDsr() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (jornada.getDSR() != null) {
			h = rt.InteitoToHora(jornada.getDSR());
		}
		return h;		

	}

	public void setDsr(String dsr) {
		System.out.println("dsr "+dsr);
		Rotinas rt = new Rotinas();
		jornada.setDSR(rt.Hora2int(dsr));		
	}
	
	
	
	
}
