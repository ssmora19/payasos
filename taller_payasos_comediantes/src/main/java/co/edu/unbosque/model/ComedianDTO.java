package co.edu.unbosque.model;

public class ComedianDTO extends PersonDTO {
	
	private int openmic;
	
	public ComedianDTO() {
	}

	public ComedianDTO(String name, long identification, String studiesLevel,int openmic) {
		super(name, identification, studiesLevel);
		this.openmic=openmic;
	}
	
	public ComedianDTO(int openmic) {
		this.openmic=openmic;
	}

	public int getOpenmic() {
		return openmic;
	}

	public void setOpenmic(int openmic) {
		this.openmic = openmic;
	}
	
	
	
	

}
