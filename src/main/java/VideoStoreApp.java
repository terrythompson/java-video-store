
public class VideoStoreApp {

	public static void main(String[] args) {

		RentalStatement rentalStatement = new RentalStatement();

		Movie doctorStrange = new NewRelease("Doctor Strange");
		Movie theBlackCauldron = new ChildrensMovie("The Black Cauldron");
		Movie theRoadWarrior = new RegularMovie("The Road Warrior");

		Rental rentalDoctorStrange = new Rental(doctorStrange, 3);
		Rental rentalTheBlackCauldron = new Rental(theBlackCauldron, 4);
		Rental rentalTheRoadWarrior = new Rental(theRoadWarrior, 2);

		rentalStatement.addRental(rentalDoctorStrange);
		rentalStatement.addRental(rentalTheBlackCauldron);
		rentalStatement.addRental(rentalTheRoadWarrior);
		rentalStatement.print();
	}

}
