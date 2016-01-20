import org.apache.spark.sql.{Encoders, SQLContext}
import org.apache.spark.{SparkContext, SparkConf}


object ElucidateDataset extends App {

  val config = new SparkConf()
  config.setMaster("local")
  config.setAppName("DatasetElucidation")

  val sc = new SparkContext(config)

  require(sc.version.replace(".","").toInt >= 160, "Spark version should be 1.6+ or greater")

  val sqlContext = new SQLContext(sc)
  val list = List("A", "Simple", "Spark", "List")

  import sqlContext.implicits._
  val lines =   sqlContext.createDataset(list).as[String]

  lines.foreach(x => println(x))
}
