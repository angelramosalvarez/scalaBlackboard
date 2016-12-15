/**
  * Created by Angel.Ramos on 14/12/2016.
  *
  *  -Call-by-name: has the advantage that a function argument is not evaluated
  *                if the parameter is unused in the evaluation of the body.
  *  -Call-by-value: has the advantage that it evaluates every function argument only once.
  *
 */
object ByValueByName  {

  def main(args: Array[String]) {

    def callByValue_onTime(time: Long, evaluateParamOnce: Int) {
      while(time != time) println("Time is evaluated once")
      println("Time is evaluated once and evaluateParamOnce too")
    }

    def callByName_onRealtime(time: => Long, noEvaluateParam: => Int) {
      while(time != time) println("Time is re-evaluated in each use and noEvaluateParam never")
    }

    callByValue_onTime(System.nanoTime(), 7+3)
    callByName_onRealtime(System.nanoTime(), 7+3)
  }
}
