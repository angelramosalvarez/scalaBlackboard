import scala.util.{Failure, Success, Try}

/**
  * Created by Angel.Ramos on 22/03/2018.
  *
  *  Grouping a complex structure list
  */

object ComplexStructures_Grouping extends App{

  case class CFeature(typ: String,  subtyp: String, color: String)
  case class BFeature(typ: String,  subtyp: String, color: String)
  case class C(CName: String, Cfeatures:List[CFeature])
  case class B(BName: String, Bfeatures:List[BFeature])
  case class A(bs:List[B],cs: List[C])

  val structure: A = A(
                     List(
                     B("nameB1", List(BFeature("type1", "subtypeA", "sepia"))),
                     B("nameB2", List(BFeature("type2", "subtypeA", "red"))),
                     B("nameB3", List(BFeature("type1", "subtypeA", "yellow"))),
                     B("nameB4", List(BFeature("type2", "subtypeB", "blue"))),
                     B("nameB5", List(BFeature("type1", "subtypeA", "white"))),
                     B("nameB6", List(BFeature("type2", "subtypeB", "gray"))),
                     B("nameB7", List(BFeature("type1", "subtypeA", "black"))),
                     B("nameB8", List(BFeature("type2", "subtypeB", "green")))),
                     List(
                     C("nameC1", List(CFeature("type1", "subtypeA", "violet"))),
                     C("nameC2", List(CFeature("type2", "subtypeB", "purple"))),
                     C("nameC3", List(CFeature("type1", "subtypeA", "orange"))),
                     C("nameC4", List(CFeature("type2", "subtypeB", "brown"))),
                     C("nameC5", List(CFeature("type1", "subtypeA", "pink"))),
                     C("nameC6", List(CFeature("type2", "subtypeB", "gold"))),
                     C("nameC7", List(CFeature("type1", "subtypeA", "silver"))),
                     C("nameC8", List(CFeature("type2", "subtypeB", "teal"))))
                  )

    /**
      Get all B class and group by types and subtypes
    */

      //Grouping class features by type and subtype
      // return a Map with (Tuple2(typ, subtype), List(featureList))
      val featuresGroup = structure.bs.flatMap{case b:B=>b.Bfeatures}.groupBy{case fb: BFeature => (fb.typ, fb.subtyp)}

       //by each Map entry apply doSometing function and return a list
      val colorList:List[String] = featuresGroup.map{
              case(key, value)=>
                      doSomething(key._1, key._2, value).toString()
      }.toList

     colorList.foreach(println)


    def doSomething(typ: String, subType: String, bfList: List[BFeature]): String ={

          //var colors = bfList.foreach{case f: BFeature=>f.color}
          var colors:String = ""
          for (feature <- bfList) colors+=feature.color + " "
          typ + ":" + ":" + subType + ":Colors:" + colors

    }

}