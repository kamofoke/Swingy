package kamofoke.swingy.model.Villians;

import kamofoke.swingy.model.Weapons.Artifacts;

public class Zoom  extends Villian {

	public Zoom(int level, int attack, int defense, int hitpoints, int experience, Artifacts artifact){
		super(level, attack, defense, hitpoints, experience, artifact);
		int typeID = 1;
		super.setTypeID(typeID);
	}
}
