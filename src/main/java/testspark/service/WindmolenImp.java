package testspark.service;

import java.util.ArrayList;
import java.util.List;

public class WindmolenImp {
	

	private List<Windmolen>mijnMolens = new ArrayList<Windmolen>();
	
	
	/*public WindmolenImp(ArrayList<Windmolen> mijnMolens) {
		
		this.mijnMolens = mijnMolens;
	}*/
	
	public WindmolenImp(){
		
		mijnMolens.add(new Windmolen("1","Albertdina","Noord-Sleen","maalvaardig"));
		mijnMolens.add(new Windmolen("2","De Arend","Coevorden","maalvaardig"));
		mijnMolens.add(new Windmolen("3","De Bente","Dalen","maalvaardig"));
		mijnMolens.add(new Windmolen("4","De Berk","Barger-Compascuum","draaivaardig"));
	}

	/*public void addMolens(Windmolen w){
		
		
	}*/

	public List<Windmolen> getMijnMolens() {
		return mijnMolens;
	}
	
	public Windmolen getWindmolenByCode(String code){
		
		Windmolen result = null;
		
		for(Windmolen w : mijnMolens){
			if(w.getCode().equals(code)){
				result = w;
				break;
			}
		}
		
		return result;	
	}
	
	public static void Main(String[]args){
		WindmolenImp imp = new WindmolenImp();
		System.out.println(imp.getWindmolenByCode("1"));
	}
	
	
}
