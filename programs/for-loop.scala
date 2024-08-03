object ForLoopExample {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 5) {
      println(s"Iteration $i")
    }
  }
}