/**
  * Created by Angel.Ramos on 08/02/2017.
  *
  * - Map: works by applying a function to each element in the list.
  * - FlatMap: works applying a function that returns a sequence for each element in the list, and flattening the results into the original list
  *
  */
object MapAndFlatMap extends App{

  //map use
   val l = List("This is a list", "with",  "3 elements")

   println("===> Map a list: " )
   val sMap = l.map( x=> x.split("\\s+"))
   sMap.foreach {x=>x.foreach(print)
                 println}

   println()

  //flatmap use: split lines into word
   println("===> FlatMap a list: ")
   val sFlatMap =  l.flatMap(x => x.split("\\s+") )
   sFlatMap.foreach(println)


}
