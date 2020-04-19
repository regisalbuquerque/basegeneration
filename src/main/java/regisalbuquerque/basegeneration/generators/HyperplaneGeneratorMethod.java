package regisalbuquerque.basegeneration.generators;

import moa.streams.InstanceStream;
import moa.streams.generators.HyperplaneGenerator;

public class HyperplaneGeneratorMethod implements StreamGeneratorMethod{

	@Override
	public InstanceStream factory(int num, int noisepercentage) {
		HyperplaneGenerator gerador = new HyperplaneGenerator();
		gerador.instanceRandomSeedOption.setValue(num % 10 + 1);
		System.out.println("NUM = " + num + " MOD = " + (num%10 + 1));
		gerador.noisePercentageOption.setValue(noisepercentage);
		return gerador;
	}

}
