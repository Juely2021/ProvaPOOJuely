package MainP;

import java.math.BigDecimal;
import java.util.Scanner;

import classes.ContraCheque;
import classes.FolhaPagamento;
import classes.Pessoa;
import folha.usecase.CalculoUseCase;
import folha.usecase.IncluirRegistrosUseCase;

public class Main {
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		int escolha = -1;
		
		while (escolha !=0) {
			String menu = "Olá escolha uma opção:\n\n1. Calcular folha\n2. Calcular proventos\n3. Caucular decontos\n4. Incluir\n0. Sair\n\nDigite sua opção: ";
			System.out.println(menu);
			escolha = input.nextInt();

			switch (escolha) {
				case 1:
					BigDecimal result = new CalculoUseCase().GetCalculo();
					System.out.printf("Cálculo folha: %.2f\n ",result);
					break;
				case 2:
					BigDecimal result2 = new CalculoUseCase().GetCalculoProvento();
					System.out.printf("Cálculo Proventos: %.2f\n",result2);
					break;
				case 3:
					BigDecimal result3 = new CalculoUseCase().GetCalculoDesconto();
					System.out.printf("Cálculo Desconto: %.2f\n",result3);
					break;
				case 4:
					System.out.println("Lançamento");
					Pessoa pe = new Pessoa();
					System.out.printf("Informe o número da matrícula: ");
					pe.matricula = input.nextInt();
					System.out.printf("Informe nome: ");
					pe.nome = input.next();
					ContraCheque cc = new ContraCheque();
					System.out.printf("Informe o mes: ");
					cc.mes = input.nextInt();
					System.out.printf("Informe o ano: ");
					cc.ano = input.nextInt();
					System.out.printf("Informe o valor liquido: ");
					cc.valorLiquido = input.nextBigDecimal();
					System.out.printf("Informe valor bruto: ");
					cc.valorBruto = input.nextBigDecimal();
					System.out.printf("Informe o valor dos proventos: ");
					cc.valorProventos = input.nextBigDecimal();
					System.out.printf("Informe o desconto: ");
					cc.valorDesconto = input.nextBigDecimal();
					pe.contracheques.add(cc);
					new IncluirRegistrosUseCase().incluirPessoa(pe);
					break;
				case 0:
					System.out.println("Sair");
					break;
				default:
					System.out.println("Opção inválida!");
		
			}
		}
		System.out.println("Até logo!");
		
	}//destrutor do método

}
