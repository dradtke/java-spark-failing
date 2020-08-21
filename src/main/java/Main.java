import org.apache.spark.sql.SparkSession;

public class Main {
	public static void main(String[] args) {
		try (SparkSession spark = SparkSession.builder().master("local").getOrCreate()) {
			System.out.println("Got a Spark session");
		}
	}
}
