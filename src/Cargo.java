
public enum Cargo {
	
	DESENVOLVEDOR(new DezOuVintePorCento()),
	DBA(new QuinzeOuVinteCintoPorCento()),
	TESTER(new QuinzeOuVinteCintoPorCento());
	
	
	private RegraDeCalculo regra;

	Cargo(RegraDeCalculo regra) {
		this.regra = regra;
	}
	
	public RegraDeCalculo getRegra() {
		return regra;
	}

	public void setRegra(RegraDeCalculo regra) {
		this.regra = regra;
	}
	
}
