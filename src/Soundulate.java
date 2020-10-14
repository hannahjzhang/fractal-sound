import java.util.ArrayList;

public class Soundulate {

	public static void main(String[] args) {
		
		int time = 100000;
		
//		// test cases
//		// saw tooth
//		Generator generator = new SawToothGenerator(512);
//	    GeneratorAudioVisualizer gav = new GeneratorAudioVisualizer(generator);
//	    gav.drawAndPlay(4096, time);
//	    
//	    // accelerating saw tooth
//		Generator generator2 = new AcceleratingSawToothGenerator(200, 1.1);
//	    GeneratorAudioVisualizer gav2 = new GeneratorAudioVisualizer(generator2);
//	    gav2.drawAndPlay(4096, time);
//		
//	    // fractal sound
//		Generator generator3 = new StrangeBitwiseGenerator(1024);
//	    GeneratorAudioVisualizer gav3 = new GeneratorAudioVisualizer(generator3);
//	    gav3.drawAndPlay(128000, time * 10);
	    
	    Generator g1 = new SineWaveGenerator(200);
	    Generator g2 = new StrangeBitwiseGenerator(201);
	    Generator g3 = new AcceleratingSawToothGenerator(202, 1.1);

	    ArrayList<Generator> generators = new ArrayList<Generator>();
	    generators.add(g1);
	    generators.add(g2);
	    generators.add(g3);
	    MultiGenerator mg = new MultiGenerator(generators);

	    GeneratorAudioVisualizer gav = new GeneratorAudioVisualizer(mg);
	    gav.drawAndPlay(500000, 1000000);
	    
	}
}  