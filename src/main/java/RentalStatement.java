import java.util.ArrayList;
import java.util.List;

public class RentalStatement {

	private List<Rental> rentalsList = new ArrayList<Rental>();

	public void addRental(Rental movie) {
		rentalsList.add(movie);
	}

	public void print() {
		for (Rental rental : rentalsList) {
			System.out.println("Rental Price Code: " + rental.getPriceCode());
			System.out.println("Rental Title: " + rental.getTitle());
			System.out.println("Rental Days Borrowed: " + rental.getDays());
			System.out.println("Rental Accrued Fees: " + rental.calculateFees() + "\n");
		}

	}

}
