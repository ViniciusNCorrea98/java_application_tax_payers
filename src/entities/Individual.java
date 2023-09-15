package entities;

public class Individual extends TaxPayer{
	private Double healthExpenditures;
	
	public Individual() {
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double basic_tax = (getAnualIncome() < 20000.0) ? getAnualIncome() * 0.15 : getAnualIncome() * 0.25;
		
		basic_tax -= getHealthExpenditures() * 0.5;
		
		if(basic_tax < 0.0) {
			basic_tax = 0.0;
		}
		
		return basic_tax;
	}

}
