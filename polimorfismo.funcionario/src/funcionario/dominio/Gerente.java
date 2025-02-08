package funcionario.dominio;

public class Gerente extends Funcionario{
	public static final double BONUS_GERENTE = 0.15;
	public static final double DESCONTO_INSS = 254F;
	public static final double DESCONTO_IRRF= 17F;
	public static final double DESCONTO_FGTS= 65F;;
	
	public Gerente(String nome, String cargo, double salario) {
		super(nome, cargo, salario);
	}
	
	@Override
	public double calculaBonus(){
		return this.salario * BONUS_GERENTE;
	}
	
	@Override
	public double salarioComBonus() {
		return this.salario * BONUS_GERENTE + this.salario;
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
	
}
