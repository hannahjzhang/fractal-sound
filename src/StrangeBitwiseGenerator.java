// task 1

public class StrangeBitwiseGenerator implements Generator {
	protected int period;
	protected int state;	

	public StrangeBitwiseGenerator(int period) {
		state = 0;
		this.period = period;
	}

	public double next() {
		state = (state + 1);
//		state = state % period;
		
		int weirdState = state & (state >>> 3) % period;
		// weirdState = state & (state >> 7) % period;
		weirdState = state & (state >> 3) & (state >> 8) % period;
		
		// when state equals period --> return 0
		return normalize(weirdState);
	}
	
	public double normalize(int state1)
	{
		// math part (fits in the range of -1 to 1)
		return (((double) state1/period) * 2.0) - 1.0;
	}
}