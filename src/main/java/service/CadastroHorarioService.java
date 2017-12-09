package service;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import model.Horario;
import model.Jornada;
import repository.Horarios;

public class CadastroHorarioService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Horarios horarios;

	public Horario salvar(Horario horario) {
		return horarios.guardar(horario);
	}

	public void excluir(Horario horarioSelecionado) {
		horarios.remover(horarioSelecionado);

	}

	public void apagaJornadasHorario(Long id) {
		horarios.apagaJornadasHorario(id);
	}

	public void insereJornadasHorario(Long id, List<Jornada> lista) {
		horarios.insereJornadasHorario(id, lista);
	}

}
