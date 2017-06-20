package testspark.service;

public class Main {

	public static void main(String[]args){
		WindmolenImp imp = new WindmolenImp();
		System.out.println(imp.getWindmolenByCode("2"));
	}
}
