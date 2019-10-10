import ConfigInstance.config

object Hello {
  lazy val greeting: String = config.getString("greeting.words")
  def main(args: Array[String]): Unit = {
    println(greeting)
  }
}
