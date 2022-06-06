package folha.dados;

import java.math.BigDecimal;

import classes.ContraCheque;
import classes.Pessoa;

public class FolhaPagamento {
	private static FolhaPagamento instance;
	public classes.FolhaPagamento dados;
	
	public static synchronized FolhaPagamento GetInstance() {
		if(instance == null) {
			instance = new FolhaPagamento();
		
		}
		return instance;
	}
	
	public FolhaPagamento() {
		dados = new classes.FolhaPagamento();
		classes.Pessoa juely = new Pessoa();
		juely.nome = "Juely";
		juely.matricula = 1;
		classes.ContraCheque cc = new ContraCheque();
		cc.ano = 2022;
		cc.mes = 3;
		cc.valorBruto = new BigDecimal(1000);
		cc.valorDesconto = new BigDecimal(100);
		cc.valorLiquido = new BigDecimal(900);
		cc.valorProventos = new BigDecimal(0);
		
		juely.contracheques.add(cc);

		dados.Pessoas.add(juely);
	}


}
