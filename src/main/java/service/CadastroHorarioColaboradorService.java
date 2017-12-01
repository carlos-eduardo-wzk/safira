package service;

import java.io.Serializable;

import javax.inject.Inject;
import javax.transaction.Transactional;

import model.HorarioColaborador;
import repository.HorarioColaboradores;
import util.jsf.FacesUtil;

public class CadastroHorarioColaboradorService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private HorarioColaboradores horarioColaboradores;

	@Transactional
	public HorarioColaborador salvar(HorarioColaborador horarioColaborador) {
		return horarioColaboradores.guardar(horarioColaborador);
	}

	public void excluir(HorarioColaborador horarioColaborador) {
		horarioColaboradores.remover(horarioColaborador);
		FacesUtil.addInfoMessage("Horario colaborador excluido.");

	}

}
