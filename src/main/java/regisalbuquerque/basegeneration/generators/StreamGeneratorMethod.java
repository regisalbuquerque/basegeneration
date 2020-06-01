package regisalbuquerque.basegeneration.generators;

import moa.streams.ExampleStream;

public interface StreamGeneratorMethod {
	
	ExampleStream factory(int num, int noisepercentage);
	
}
