
public class QuinzeOuVinteCintoPorCento implements RegraDeCalculo {

	@Override
	public Double calcula(Funcionario f) {
		if(f.getSalarioBase() > 3000) {
			return f.getSalarioBase() * 0.8;
		}
		else {
			return f.getSalarioBase() * 0.9;
		}
	}

}
