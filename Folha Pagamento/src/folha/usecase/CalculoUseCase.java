package folha.usecase;

import java.math.BigDecimal;

import folha.dados.FolhaPagamento;

public class CalculoUseCase {
	public BigDecimal GetCalculo() {
		folha.dados.FolhaPagamento dados = FolhaPagamento.GetInstance();
		BigDecimal total = new BigDecimal(0);
		for(classes.Pessoa p : dados.dados.Pessoas) {
			for (classes.ContraCheque cc : p.contracheques) {
				total = total.add(cc.valorBruto);
			}
		
		}
		
		return total;
	}
	
	public BigDecimal GetCalculoProvento() {
		folha.dados.FolhaPagamento dados = FolhaPagamento.GetInstance();
		BigDecimal total = new BigDecimal(0);
		for(classes.Pessoa p : dados.dados.Pessoas) {
			for (classes.ContraCheque cc : p.contracheques) {
				total = total.add(cc.valorProventos);
			}
		
		}
		
		return total;
	}
	
	public BigDecimal GetCalculoDesconto() {
		folha.dados.FolhaPagamento dados = FolhaPagamento.GetInstance();
		BigDecimal total = new BigDecimal(0);
		for(classes.Pessoa p : dados.dados.Pessoas) {
			for (classes.ContraCheque cc : p.contracheques) {
				total = total.add(cc.valorDesconto);
			}
		
		}
		
		return total;
	}

}
