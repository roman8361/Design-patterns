package path03.lesson03.builder.moto;

/**
 * MotoBuilder.
 *
 * @author Ilya_Sukhachev
 */
public class MotoBuilder {

    public Moto build(String modelName) {
        return new Moto(MotoWiki.getCapacityByName(modelName),
                MotoWiki.getPowerByName(modelName),
                MotoWiki.getSpeedByName(modelName),
                modelName
        );
    }
}
