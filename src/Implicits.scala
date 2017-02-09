/**
  * Created by Angel.Ramos on 20/12/2016.
  *
  * - Implicit parameter: are method parameters which do not have to be explicitly passed to the method when it is called,
  *                       the Scala compiler will look for the missing parameter in the current scope.
  *
  */


object Implicits extends App{


    implicit val tax = 1.21


  //When addTax is call only pass two parameter the other is implicit
  //and search their declaration, in this case is tax.
  addTax("shoes", 45.0)



  def addTax(des: String, pr: Double)(implicit tax : Double)
  {

     val totalpr = pr * tax

     println(des + " total prices " + totalpr )



  }


}

