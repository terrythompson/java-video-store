import java.math.BigDecimal;

public class NewRelease extends Movie {

	public NewRelease(String title) {
		super(title, "New Release");
	}

	@Override
	public BigDecimal calculateFees(int days) {
		BigDecimal rentalCost = new BigDecimal("3.00").multiply(new BigDecimal(days));
		return rentalCost;
	}

}
