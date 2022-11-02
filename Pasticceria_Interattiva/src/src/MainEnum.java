package src;

public class MainEnum {

	public static void main (String[] args) {
		
	EnumTry topTier = EnumTry.TIER_1;
	System.out.println(topTier);
	System.out.println(topTier.getTier());
	
	EnumTry midTier = EnumTry.TIER_2;
	System.out.println(midTier);
	System.out.println(midTier.getTier());
	
	EnumTry lowTier = EnumTry.TIER_3;
	System.out.println(lowTier);
	System.out.println(lowTier.getTier());
	}
	
}
