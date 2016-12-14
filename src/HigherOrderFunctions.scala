package org.scalaBlackboard.HigherOrderFunctions

/**
  * Created by Angel.Ramos on 14/12/2016.
  *
  *  Functions that take other functions as parameters or that return functions as results.
  *
  *     calculateTax and calculateDiscount functions is passed to the moneyTransfer function
  *
  */
class TaxesAndDiscounts() {

  def calculateTax(money: Double): Double = money * 0.2 //High Order Function 1
  def calculateDiscount(money: Double): Double = money * 0.1 //High Order Function 2

}

object HOFTest extends App {

  def moneyTransfer(money: Double, tax: Double => Double): Double ={
    money + tax(money)
  }

  val taxesAndDiscounts = new TaxesAndDiscounts

  val money = 10000
  println("1) apply 2% Tax : " + moneyTransfer(money, taxesAndDiscounts.calculateTax))
  println("2) apply 1% Discount: " + moneyTransfer(money, taxesAndDiscounts.calculateDiscount))

}





