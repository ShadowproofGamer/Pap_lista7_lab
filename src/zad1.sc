import scala.annotation.tailrec

def approximatePI(precision:Double):Double = {
  @tailrec
  def approximatePI_rec(prec:Double, res:Double, prev:Double):Double = {
    res match
      case _ if res==0.0 => {
        println("case 1")
        approximatePI_rec(prec, math.sqrt(0.5), 0.0)
      }
      case _ if math.abs((2/res)-(2/prev))<prec => {
        println("case2")
        res
      }
      case _ => {
        println("case3")
        approximatePI_rec(prec, math.sqrt(0.5+0.5*prev)*res, res)
      }
  }
  2/approximatePI_rec(precision, 0.0, 0.0)
}

approximatePI(0.01)