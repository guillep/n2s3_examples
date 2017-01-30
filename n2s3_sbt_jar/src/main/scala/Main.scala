import fr.univ_lille.cristal.emeraude.n2s3.core.models.properties.MembraneThresholdPotential
import fr.univ_lille.cristal.emeraude.n2s3.features.builder.N2S3
import fr.univ_lille.cristal.emeraude.n2s3.models.qbg.QBGNeuron
import squants.electro.ElectricPotentialConversions.ElectricPotentialConversions

/**
  * Created by Guille Polito on 30/01/17.
  * Example class using N2S3.
  *
  * This class shows that imports worked right.
  */
object Main extends App {

  var n2s3 = new N2S3
  val unsupervisedLayer = n2s3.createNeuronGroup("example", 20)
    .setNeuronModel(QBGNeuron, Seq(
      (MembraneThresholdPotential, 6 millivolts)
    ))

  //Then continue with the rest of the experiment setup.
}
