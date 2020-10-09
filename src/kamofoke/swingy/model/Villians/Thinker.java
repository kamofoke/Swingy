package kamofoke.swingy.model.Villians;

import kamofoke.swingy.model.Weapons.Artifacts;

public class Thinker  extends Villian {

	public Thinker(int level, int attack, int defense, int hitpoints, int experience, Artifacts artifact){
		super(level, attack, defense, hitpoints, experience, artifact);
		int typeID = 2;
		super.setTypeID(typeID);
	}
}
