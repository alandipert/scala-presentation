object Summer {

  def calcSum(n:Seq[Int]) = n.reduceLeft(_+_)

  def convertInput(a:String) = a.split(",").map(_.toInt)

  def main(args:Array[String]) {
    if(args.length > 0) {
      println(calcSum(convertInput(args.first)))
    } else {
      println("Please provide a list of integers in the format 1,2,3")
    }
  }
}
