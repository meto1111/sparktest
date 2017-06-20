package testspark.service;

public class BerekenKrachtImp implements CalcService {

	static final BerekenKrachtImp INSTANCE = new BerekenKrachtImp();
	
	private BerekenKrachtImp(){
		
	}
	
	@Override
	public double berekenKracht(int windsnelheid, int vermogen){
		return (int) (windsnelheid * vermogen /0.7);
	}
	
	
	
}
