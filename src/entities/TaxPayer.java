package entities;

public class TaxPayer {

	private Double salaryIncome;
	private Double servicesIncome;
	private Double capitalIncome;
	private Double healthSpending;
	private Double educationSpending;

	public TaxPayer() {
	}

	public TaxPayer(Double salaryIncome, Double servicesIncome, Double capitalIncome, Double healthSpending,
			Double educationSpending) {
		super();
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}

	public Double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(Double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public Double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(Double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}

	public Double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(Double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public Double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(Double educationSpending) {
		this.educationSpending = educationSpending;
	}

	public Double salaryTax() { 

		double salary = salaryIncome / 12.0;

		if (salary < 3000.00) {
			return 0.0;
		} else if (salary < 5000.00) {
			return salaryIncome * 0.10;
		} else {
			return salaryIncome * 0.20;
		}

	}

	public Double servicesTax() {
		return servicesIncome * 0.15;
	}

	public Double capitalTax() {
		return capitalIncome * 0.20;
	}

	public Double grossTax() {
		return salaryTax() + servicesTax() + capitalTax();
	}

	public Double taxRebate() {

		double spendings = healthSpending + educationSpending;
		double thirtyPercent = grossTax() * 0.30;

		if (spendings < thirtyPercent) {
			return spendings;
		} else {
			return thirtyPercent;
		}

	}

	public Double netTax() {
		return grossTax() - taxRebate();
	}

	@Override
	public String toString() {
		return String.format("Imposto bruto total: %.2f\n", grossTax())
			 + String.format("Abatimento: %.2f\n", taxRebate()) 
			 + String.format("Imposto devido: %.2f", netTax());
	}
}




