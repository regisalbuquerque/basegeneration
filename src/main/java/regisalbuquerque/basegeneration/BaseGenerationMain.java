package regisalbuquerque.basegeneration;

import regisalbuquerque.basegeneration.generators.AgrawalGeneratorMethod;
import regisalbuquerque.basegeneration.generators.HyperplaneGeneratorMethod;
import regisalbuquerque.basegeneration.generators.LEDGeneratorMethod;
import regisalbuquerque.basegeneration.generators.SEAGeneratorMethod;
import regisalbuquerque.basegeneration.generators.StaggerGeneratorMethod;

public class BaseGenerationMain {

	public static void main(String[] args) {
		
		int concepts = 10;
		int maxinstances = 10000;
		int noisepercentage_10 = 10;
		int without_noise = 0;
		int driftdistance_ABRUPTO = 1;
		int driftdistance_GRADUAL = 400;

		String path = "C:/Users/Regis/Documents/drive/mestrado/datasets_gerados/";
		
		AgrawalGeneratorMethod agrawalMethod = new AgrawalGeneratorMethod();
		ConceptDriftGenerator.generate_base(path, "agrawal_abrupt.arff", agrawalMethod, concepts, maxinstances, driftdistance_ABRUPTO, without_noise);
		ConceptDriftGenerator.generate_base(path, "agrawal_abrupt_noise.arff", agrawalMethod, concepts, maxinstances, driftdistance_ABRUPTO, noisepercentage_10);
		ConceptDriftGenerator.generate_base(path, "agrawal_gradual.arff", agrawalMethod, concepts, maxinstances, driftdistance_GRADUAL, without_noise);
		ConceptDriftGenerator.generate_base(path, "agrawal_gradual_noise.arff", agrawalMethod, concepts, maxinstances, driftdistance_GRADUAL, noisepercentage_10);
		
		SEAGeneratorMethod seaMethod = new SEAGeneratorMethod();
		ConceptDriftGenerator.generate_base(path, "sea_abrupt.arff", seaMethod, concepts, maxinstances, driftdistance_ABRUPTO, without_noise);
		ConceptDriftGenerator.generate_base(path, "sea_abrupt_noise.arff", seaMethod, concepts, maxinstances, driftdistance_ABRUPTO, noisepercentage_10);
		ConceptDriftGenerator.generate_base(path, "sea_gradual.arff", seaMethod, concepts, maxinstances, driftdistance_GRADUAL, without_noise);
		ConceptDriftGenerator.generate_base(path, "sea_gradual_noise.arff", seaMethod, concepts, maxinstances, driftdistance_GRADUAL, noisepercentage_10);
		
		StaggerGeneratorMethod sttagerMethod = new StaggerGeneratorMethod();
		ConceptDriftGenerator.generate_base(path, "stagger_abrupt.arff", sttagerMethod, concepts, maxinstances, driftdistance_ABRUPTO, without_noise);
		ConceptDriftGenerator.generate_base(path, "stagger_abrupt_noise.arff", sttagerMethod, concepts, maxinstances, driftdistance_ABRUPTO, noisepercentage_10);
		ConceptDriftGenerator.generate_base(path, "stagger_gradual.arff", sttagerMethod, concepts, maxinstances, driftdistance_GRADUAL, without_noise);
		ConceptDriftGenerator.generate_base(path, "stagger_gradual_noise.arff", sttagerMethod, concepts, maxinstances, driftdistance_GRADUAL, noisepercentage_10);
		
		LEDGeneratorMethod LEDMethod = new LEDGeneratorMethod();
		ConceptDriftGenerator.generate_base(path, "led_abrupt.arff", LEDMethod, concepts, maxinstances, driftdistance_ABRUPTO, without_noise);
		
		HyperplaneGeneratorMethod hyperMethod = new HyperplaneGeneratorMethod();
		ConceptDriftGenerator.generate_base(path, "hyper_gradual.arff", hyperMethod, concepts, maxinstances, driftdistance_GRADUAL, without_noise);
	}

}
