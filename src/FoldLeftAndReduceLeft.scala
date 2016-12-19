/**
  * Created by Angel.Ramos on 19/12/2016.
  *
  * - ReduceLeft: Insert a given binary operator between adjacent elements of a list
  *
  * - FoldLeft: is like reduceLeft but takes an accumulator, z, as an additional parameter,
  *             which is returned when foldLeft is called on an empty list
  *
  * - Differences between FoldLeft and FoldRight:  For operators that are associative and commutative, foldLeft and foldRight are equivalent (even though there may be a diferrence in efficiendy).
  * But sometimes, only one of the two operators is appropriate.
  *
  */
object FoldLeftAndReduceLeft {

  def main(args: Array[String]) {


    def averageWithReduce(list: List[Double]): Double =
      (list reduceLeft (_ + _)) / (list reduceLeft ((x, y) => x + 1))

    def averageWithFold(list: List[Double]): Double =
      (list foldLeft(0.0))(_ + _) / (list foldLeft(0.0))((x, y) => x + 1)



    println("Average with Fold (1,5,6,7): " + averageWithFold(List(1,5,6,7)))
    println("Average with Fold (void list): " + averageWithFold(List()))

    println("Average with Reduce (1,5,6,7): " + averageWithReduce(List(1,5,6,7)))
    println("Average with Reduce (void list) it will capture and Exception" /*+ averageWithReduce(List())*/)



  }

}
