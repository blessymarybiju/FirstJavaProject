package cruiseCompany;

public interface CruiseCompany {
	public double getAdultTicketPrice();

	public double getKidTicketPrice();

	public double calculateCruisePrice(int numOfAdult, int childrenAbove5);

}
