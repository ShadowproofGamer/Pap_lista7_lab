import scala.annotation.tailrec

def approximatePI(precision:Double):Double = {
  //println("pre rec")
  //@tailrec
  def approximatePI_rec(prec:Double, res:Double, prev:Double):Double = {
    println("pre case")
    println(prec)
    println(res)
    println(prev)
    if res==0 then approximatePI_rec(prec, math.sqrt(0.5), 0.0)
    else if math.abs((2/res)-(2/prev))<prec then res
    else approximatePI_rec(prec, math.sqrt(0.5+0.5*prev)*res, math.sqrt(0.5+0.5*prev))
  }
  approximatePI_rec(precision, 0.0, 0.0)
}

approximatePI(0.01)