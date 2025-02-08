package funcionario.teste;

import funcionario.dominio.Desenvolvedor;
import funcionario.dominio.Funcionario;
import funcionario.dominio.Gerente;
import funcionario.dominio.Vendedor;
import funcionario.servico.CalculadoraBonus;

public class FuncionarioTeste {

	public static void main(String[] args) {
		Funcionario funcionario = new Gerente("Maria","Gerente",5435);
		Desenvolvedor desenvolvedor = new Desenvolvedor("João Pedro","Desenvolvedor Java",3520);
		desenvolvedor.setProgramasDesenvolvidos(45);
		Vendedor vendedor = new Vendedor("Bartolo","Vendas",3200);
		vendedor.setQuantidadeVendas(82);
		
		CalculadoraBonus.CalcularBonus(funcionario);
		System.out.println("--------------------------");
		CalculadoraBonus.CalcularBonus(desenvolvedor);
		System.out.println("--------------------------");
		CalculadoraBonus.CalcularBonus(vendedor);

		
	}

}
