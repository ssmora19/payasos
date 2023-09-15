package co.edu.unbosque.model;

public class PersonDTO {
	
	private String name;
	private long identification;
	private String studiesLevel;
	
	public PersonDTO() {
	}

	public PersonDTO(String name, long identification, String studiesLevel) {
		super();
		this.name = name;
		this.identification = identification;
		this.studiesLevel = studiesLevel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getIdentification() {
		return identification;
	}

	public void setIdentification(long identification) {
		this.identification = identification;
	}

	public String getStudiesLevel() {
		return studiesLevel;
	}

	public void setStudiesLevel(String studiesLevel) {
		this.studiesLevel = studiesLevel;
	}
	
	
	

}
