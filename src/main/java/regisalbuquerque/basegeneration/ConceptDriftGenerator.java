package regisalbuquerque.basegeneration;

import moa.streams.ConceptDriftStream;
import moa.streams.ExampleStream;
import moa.tasks.WriteStreamToARFFFile;
import regisalbuquerque.basegeneration.generators.StreamGeneratorMethod;

public class ConceptDriftGenerator {
	
	public static void generate_base(String path, String arffile, StreamGeneratorMethod gerador, int concepts, int maxinstances, int driftdistance, int noisepercentage)
	{
		int position =  maxinstances / concepts;
		
		
		WriteStreamToARFFFile writeStreamToARFFFile = new WriteStreamToARFFFile();
		writeStreamToARFFFile.streamOption.setCurrentObject(concept_drift(gerador, concepts, position, driftdistance, noisepercentage));
		writeStreamToARFFFile.arffFileOption.setValue(path + arffile);
		writeStreamToARFFFile.maxInstancesOption.setValue(maxinstances);
		writeStreamToARFFFile.prepareForUse();
		writeStreamToARFFFile.doTask();
		
	}
	
	private static ExampleStream<?> concept_drift(StreamGeneratorMethod gerador, int num, int position, int driftdistance, int noisepercentage)
	{
		if (num == 1)
		{
			ExampleStream<?> stream = gerador.factory(num, noisepercentage);
			
			return stream;
		}
		else
		{
			ExampleStream<?> stream_aux = gerador.factory(num, noisepercentage);
			
			ConceptDriftStream conceptDriftStream = new ConceptDriftStream();
			conceptDriftStream.streamOption.setCurrentObject(stream_aux);
			conceptDriftStream.driftstreamOption.setCurrentObject(concept_drift(gerador, --num, position, driftdistance, noisepercentage));
			conceptDriftStream.positionOption.setValue(position);
			conceptDriftStream.widthOption.setValue(driftdistance);
			
			return conceptDriftStream;
		}
	}

}
