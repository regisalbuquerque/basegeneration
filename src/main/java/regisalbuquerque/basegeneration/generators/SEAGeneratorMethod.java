package regisalbuquerque.basegeneration.generators;

import moa.streams.InstanceStream;
import moa.streams.generators.SEAGenerator;

public class SEAGeneratorMethod implements StreamGeneratorMethod {

	@Override
	public InstanceStream factory(int num, int noisepercentage) {
		SEAGenerator gerador = new SEAGenerator();
		gerador.functionOption.setValue(num % 4 + 1);
		System.out.println("NUM = " + num + " MOD = " + (num%4 + 1));
		gerador.noisePercentageOption.setValue(noisepercentage);
		return gerador;
	}

}

