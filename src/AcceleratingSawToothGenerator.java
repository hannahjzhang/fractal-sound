// task 2

public class AcceleratingSawToothGenerator extends SawToothGenerator {
	
	private double factor;

	public AcceleratingSawToothGenerator(int period, double factor) {
		super(period);
		this.factor = factor;
	}

	public double next() {
		// allowed because i changed state to be protected
		state = state + 1;
		state = state % period;
		if (state == 0)
		{
			period = (int) (period * factor);
		}
		return normalize(state);
	}
	
}
