import java.math.BigDecimal;

public class Rental {

	Movie rented;
	int days;

	public Rental(Movie rented, int days) {
		this.rented = rented;
		this.days = days;
	}
	
	public BigDecimal calculateFees() {
		return rented.calculateFees(days);
	}

	public String getTitle() {
		return rented.getTitle();
	}

	public String getPriceCode() {
		return rented.getPriceCode();
	}

	public int getDays() {
		return days;
	}


}
