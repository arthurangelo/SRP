
public class DezOuVintePorCento implements RegraDeCalculo{

	@Override
	public Double calcula(Funcionario f) {
		if(f.getSalarioBase() > 2000) {
			return f.getSalarioBase() * 0.75;
		}
		else {
			return f.getSalarioBase() * 0.85;
		}
	}

}
