package abstractPkg;

public class Gun extends Weapon{
	
	public Gun() {
		super.createWeapon();
	}

	@Override
	public void attack() {
		System.out.println("The gun fires, watch out!");		
	}	

}
