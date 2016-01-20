import org.apache.spark.sql.SQLContext
import org.apache.spark.{SparkContext, SparkConf}

/**
 * Created by HCL on 1/14/2016.
 */
object DataFrameManipulator extends App {

  val conf = new SparkConf()
  conf.setMaster("local")
  conf.setAppName("DF")

  val sc = new SparkContext(conf)

  val sqlContext = new SQLContext(sc)
}
