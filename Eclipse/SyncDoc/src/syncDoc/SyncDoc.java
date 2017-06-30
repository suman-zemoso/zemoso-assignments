package syncDoc;

public class SyncDoc {

	public static void main(String[] args) {
		SyncDocFacade sdf = new SyncDocFacade();
		if(sdf.login()) {sdf.bookAppointment();}
		
	}

}
