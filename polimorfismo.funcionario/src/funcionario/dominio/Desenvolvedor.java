package funcionario.dominio;

public class Desenvolvedor extends Funcionario{
	private int programasDesenvolvidos;
	public static final double BONUS_DESENVOLVEDOR = 0.05;
	public static final double DESCONTO_INSS = 254F;
	public static final double DESCONTO_IRRF= 17F;
	public static final double DESCONTO_FGTS= 65F;

	
	public Desenvolvedor(String nome, String cargo, double salario) {
		super(nome, cargo, salario);
	}
	
	@Override
	public double calculaBonus() {
		return this.salario * BONUS_DESENVOLVEDOR;
	}
	
	@Override
	public double salarioComBonus() {
		return this.salario * BONUS_DESENVOLVEDOR + this.salario;
	}

	@Override
	public double salarioComDesconto() {
		System.out.println("Calculando salario com descontos: ");
		return this.salarioComBonus() - DESCONTO_INSS;
	}
	
	@Override
	public double salarioDescontoIRRF() {
		return (this.salarioComBonus() - DESCONTO_INSS) - DESCONTO_IRRF;
	}
	
	@Override
	public double salarioDescontoFGTS() {
		return (this.salarioComBonus() - DESCONTO_INSS - DESCONTO_IRRF) - DESCONTO_FGTS;
	}
	public int getProgramasDesenvolvidos() {
		return programasDesenvolvidos;
	}
	public void setProgramasDesenvolvidos(int programasDesenvolvidos) {
		this.programasDesenvolvidos = programasDesenvolvidos;
	}
	
	
	

}
