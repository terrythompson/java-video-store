import java.math.BigDecimal;

public class ChildrensMovie extends Movie {

	public ChildrensMovie(String title) {
		super(title, "Childrens");
	}
	
	public BigDecimal calculateFees(int days) {
		BigDecimal rentalCost = new BigDecimal("1.50");

		if (days > 3) {
			BigDecimal extraDays = new BigDecimal(days - 3);
			rentalCost = rentalCost.add(new BigDecimal("1.5").multiply(extraDays));
		}
		
		return rentalCost;

	}

}
