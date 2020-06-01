package regisalbuquerque.basegeneration.generators;

import moa.streams.ExampleStream;
import moa.streams.FilteredStream;
import moa.streams.filters.AddNoiseFilter;
import moa.streams.generators.STAGGERGenerator;

public class StaggerGeneratorMethod implements StreamGeneratorMethod{


	@Override
	public ExampleStream<?> factory(int num, int noisepercentage) {
		STAGGERGenerator gerador = new STAGGERGenerator();
		gerador.functionOption.setValue(num % 3 + 1);

		double fracao = (double)noisepercentage / 100.00;
		
		AddNoiseFilter noise = new AddNoiseFilter();
		noise.attNoiseFractionOption.setValue(fracao);
		
		FilteredStream filtro = new FilteredStream();
		filtro.streamOption.setCurrentObject(gerador);
		filtro.filtersOption.setCurrentObject(noise);
		
		return filtro;
	}

}


