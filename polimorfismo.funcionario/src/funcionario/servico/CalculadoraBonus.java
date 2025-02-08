package funcionario.servico;

import funcionario.dominio.Desenvolvedor;
import funcionario.dominio.Funcionario;
import funcionario.dominio.Vendedor;

public class CalculadoraBonus {
	public static void CalcularBonus(Funcionario funcionario) {
		System.out.println("Relatorio de Salários: ");
		double bonus = funcionario.calculaBonus();
		System.out.println("Cargo: "+funcionario.getCargo());
		System.out.println("Nome: "+funcionario.getNome());
		System.out.println("Salário: "+funcionario.getSalario());
		System.out.printf("Bônus: %.2f\n",bonus);
		double salarioComBonus = funcionario.salarioComBonus();
		System.out.printf("Salário com bônus: %.2f\n",salarioComBonus);
		double salarioComDesconto = funcionario.salarioComDesconto();
		System.out.printf("Salário com desconto de INSS: %.2f\n",salarioComDesconto);
		double salarioDescontoIRRF = funcionario.salarioDescontoIRRF();
		System.out.printf("Salário com desconto de IRRF: %.2f\n",salarioDescontoIRRF);
		double salarioDescontoFGTS = funcionario.salarioDescontoFGTS();
		System.out.printf("Salário com desconto de FGTS: %.2f\n",salarioDescontoFGTS);
		double salarioFinal = funcionario.salarioDescontoFGTS();
		System.out.println("Salário final: "+salarioFinal);
		if(funcionario instanceof Vendedor) {
			Vendedor vendedor = (Vendedor) funcionario;
			System.out.println("Quantidade de vendas: "+vendedor.getQuantidadeVendas());
		}
		else if(funcionario instanceof Desenvolvedor) {
			Desenvolvedor desenvolvedor = (Desenvolvedor) funcionario;
			System.out.println("Quantidade de programas feitos no mês: "+desenvolvedor.getProgramasDesenvolvidos());
		}
		
	}

}
