package inheritancePkg;

public class American extends British {
	
	public American() {		
		// super();
		System.out.println("American class constructor");
	}
	
	@Override
	public void speak() {
		System.out.println("I'm American and live in an apartment");
	}
	
	@Override
	public void enjoy() {
		System.out.println("Go on vacation");
	}

}
