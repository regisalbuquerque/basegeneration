package regisalbuquerque.basegeneration.generators;

import moa.streams.InstanceStream;
import moa.streams.generators.AgrawalGenerator;

public class AgrawalGeneratorMethod implements StreamGeneratorMethod{

	@Override
	public InstanceStream factory(int num, int noisepercentage) {
		AgrawalGenerator gerador = new AgrawalGenerator();
		gerador.functionOption.setValue(num % 10 + 1);
		System.out.println("NUM = " + num + " MOD = " + (num%10 + 1));
		double fracao = (double)noisepercentage / 100.00;
		gerador.peturbFractionOption.setValue(fracao);
		return gerador;
	}

}


