package co.edu.unbosque.model;

public class ClownDTO extends PersonDTO {
	
	private int cronies;
	
	public ClownDTO() {
	}

	public ClownDTO(String name, long identification, String studiesLevel,int cronies) {
		super(name, identification, studiesLevel);
		this.cronies=cronies;
	}
	
	public ClownDTO(int cronies) {
		this.cronies=cronies;
	}

	public int getCronies() {
		return cronies;
	}

	public void setCronies(int cronies) {
		this.cronies = cronies;
	}
	
	
	
	
	
	

}
