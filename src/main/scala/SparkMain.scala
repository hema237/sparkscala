import org.apache.spark.{SparkContext, SparkConf}

/**
 * Created by HCL on 1/12/2016.
 */
object SparkMain extends App {

  val config = new SparkConf
  config.setMaster("local")
  config.setAppName("SparkMain")
  val sc = new SparkContext(config)

  sc.textFile("D:\\ac\\data\\sample.csv").foreach(x => println(x))

  println("Hello Spark")
}
