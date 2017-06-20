package testspark.service;

public class Windmolen {
	
	private String code;
	private String naam;
	private String plaats;
	private String maalvaardigheid;
	
	
	
	public Windmolen(String code,String naam, String plaats, String maalvaardigheid) {
		super();
		this.code = code;
		this.naam = naam;
		this.plaats = plaats;
		this.maalvaardigheid = maalvaardigheid;
	}
	
	public Windmolen(){
		
	}


	public String getNaam() {
		return naam;
	}


	public void setNaam(String naam) {
		this.naam = naam;
	}


	public String getPlaats() {
		return plaats;
	}


	public void setPlaats(String plaats) {
		this.plaats = plaats;
	}


	public String getMaalvaardigheid() {
		return maalvaardigheid;
	}


	public void setMaalvaardigheid(String maalvaardigheid) {
		this.maalvaardigheid = maalvaardigheid;
	}





	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	@Override
	public String toString() {
		return "merken [code=" + code + ", naam=" + naam + ", plaats=" + plaats + ", maalvaardigheid=" + maalvaardigheid
				+ "]";
	}



	

}
