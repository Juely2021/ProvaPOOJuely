package folha.usecase;

import classes.Pessoa;

public class IncluirRegistrosUseCase {
	public void incluirPessoa(Pessoa pess) {
		folha.dados.FolhaPagamento.GetInstance().dados.Pessoas.add(pess);
	}

}
