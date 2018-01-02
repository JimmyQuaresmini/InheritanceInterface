package abstractPkg;

public class Knife extends Weapon{
	
	public Knife() {
		super.createWeapon();
	}

	@Override
	public void attack() {		
		System.out.println("The knife slashes and stabs!");		
	}

}
