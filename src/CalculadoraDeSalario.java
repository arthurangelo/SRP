
public class CalculadoraDeSalario {

	private RegraDeCalculo regra;
	
	public CalculadoraDeSalario(RegraDeCalculo regra) {
		this.regra = regra;
	}
	
	public Double calcula(Funcionario f) {
		return regra.calcula(f);
	}


	
}
