package adapterPattern;

public class ModernTVAdapter implements ITv {
	
	private OldTvAdapatee oldTvAdaptee;
	
	
	public ModernTVAdapter(OldTvAdapatee oldTvAdaptee) {
		super();
		this.oldTvAdaptee = oldTvAdaptee;
	}

	@Override
	public void switchOn() {
		oldTvAdaptee.TurnToRight();
	}

	@Override
	public void switchOff() {
		oldTvAdaptee.TurnToLeft();
	}

}
