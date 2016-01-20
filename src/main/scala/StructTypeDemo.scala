import org.apache.spark.sql.SQLContext
import org.apache.spark.sql.types.DataTypes
import org.apache.spark.{SparkContext, SparkConf}

object StructTypeDemo extends App {

  val conf = new SparkConf()
  conf.setMaster("local")
  conf.setAppName("DF")

  val sc = new SparkContext(conf)

  val sqlContext = new SQLContext(sc)

  //val st = DataTypes.createStructType(List(Data))
  val er = new EventReplay


}
