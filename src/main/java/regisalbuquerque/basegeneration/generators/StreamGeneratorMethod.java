package regisalbuquerque.basegeneration.generators;

import moa.streams.InstanceStream;

public interface StreamGeneratorMethod {
	
	InstanceStream factory(int num, int noisepercentage);
	
}
