import java.math.BigDecimal;

public class RegularMovie extends Movie {

	public RegularMovie(String title) {
		super(title, "Regular");
	}
	
	public BigDecimal calculateFees(int days) {
		BigDecimal rentalCost = new BigDecimal("2.00");

		if (days > 2) {
			BigDecimal extraDays = new BigDecimal(days - 2);
			rentalCost = rentalCost.add(new BigDecimal("1.5").multiply(extraDays));
		}
		return rentalCost;
		
	}

}
