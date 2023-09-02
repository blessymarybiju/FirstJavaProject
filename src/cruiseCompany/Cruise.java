package cruiseCompany;

public class Cruise {
	private String cruiseName;
	private String departurePort;
	private String destination;
	private String returnPort;

	public Cruise(String cruiseName, String departurePort, String destination, String returnPort) {

		this.cruiseName = cruiseName;
		this.departurePort = departurePort;
		this.destination = destination;
		this.returnPort = returnPort;
	}

	public String getReturnPort() {
		return returnPort;
	}

	public String getDestination() {
		return destination;
	}

	public String getDeparturePort() {
		return departurePort;
	}

	public String getCruiseName() {
		return cruiseName;
	}

}
