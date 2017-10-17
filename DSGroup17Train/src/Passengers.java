
public class Passengers {
	private int passengerId;
	private int startWait;
	private int boardAt;
	private int destination;
	private boolean boardedTrain;
	//constructor of the passenger class
	public Passenger(int createdAt,int dest,int id) {
		passengerId=id;
		startWait=createdAt;
		destination=dest;
		boardedTrain=false;
		System.out.println("Passenger "+id+" at station "+createdAt+" and heading to "+dest);
	}//end of constructor
	public int getDestination(){
		return destination;
	}
}
