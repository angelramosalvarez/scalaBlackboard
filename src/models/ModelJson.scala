package models

import spray.json._

case class ModelJson(name: String, description: String)

object ModelJsonProtocol extends DefaultJsonProtocol {
  implicit object ModelJsonFormat extends JsonFormat[ModelJson] {
      def write(obj: ModelJson): JsValue =
        JsObject(
            "name" -> JsString(obj.name),
            "description" -> JsString(obj.description)
        )

      def read(json: JsValue): ModelJson = json match {
        case JsObject(fields) if fields.isDefinedAt("name") & fields.isDefinedAt("description") =>
            ModelJson(
                  fields("name").convertTo[String],
                  fields("description").convertTo[String]
                )
        case _ => deserializationError("Not a Model Object")
      }
  }

}
