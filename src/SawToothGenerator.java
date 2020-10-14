// task 1

public class SawToothGenerator implements Generator {
	protected int period;
	protected int state;	

	public SawToothGenerator(int period) {
		state = 0;
		this.period = period;
	}

	public double next() {
		state = (state + 1);
		// when state equals period --> return 0
		state = state % period;
		return normalize(state);
	}
	
	public double normalize(int state1)
	{
		// math part
		return (((double) state1/period) * 2.0) - 1.0;
	}
}