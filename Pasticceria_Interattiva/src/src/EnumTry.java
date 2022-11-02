package src;

public enum EnumTry {

	TIER_1(6), TIER_2(4), TIER_3(2);
	
	private final int tier;
	
	private EnumTry(int tier) {
		
		this.tier = tier;
	}
	
	public int getTier() {
		
		return tier;
	}
}
