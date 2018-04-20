import models.ModelJson
import spray.json._
import models.ModelJsonProtocol._


object ParseAndConvertJson extends App {

    // MODEL TO JSON
    val modelObject = ModelJson("nombre del model", "descripción del modelo")
    val modelJson = modelObject.toJson.toString
    println("---> MODEL TO JSON: "  + modelJson)



    //JSON TO MODEL again
    val modelObject2 = modelJson.parseJson.convertTo[ModelJson]
    println("---> JSON TO MODEL: " + modelObject2.toString)

}
