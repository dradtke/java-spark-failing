import org.apache.spark.sql.SparkSession;

public class Main {
	public static void main(String[] args) {
		SparkSession spark = SparkSession.builder()
			.master("local")
			.getOrCreate();

		spark.sql("SELECT * FROM nonexistent_table");
	}
}
