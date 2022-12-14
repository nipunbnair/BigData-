import org.apache.spark.sql.SparkSession
import org.apache.spark.ml.feature.{PCA,StandardScaler,VectorAssembler,StringIndexer,VectorIndexer}
import org.apache.spark.ml.linalg.Vectors
import org.apache.spark.mllib.evaluation.MulticlassMetrics
import org.apache.log4j._
import org.apache.spark.ml.classification.{RandomForestClassificationModel, RandomForestClassifier}
import org.apache.spark.ml.classification.LogisticRegression
import org.apache.spark.ml.classification.NaiveBayes
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.spark.ml.classification.DecisionTreeClassificationModel
import org.apache.spark.ml.classification.DecisionTreeClassifier


val spark = SparkSession.builder().appName("Team15").getOrCreate()

val colnames = (Array("gfs_pressure","gfs_humidity","climate_pressure","gfs_precipitable_water"))
// inputiing the whole dataset
val data = spark.read.option("header","true").option("inferSchema","true").format("csv").load("file_data.csv")
data.printSchema()
//selecting only a few columns, feel free to add in more if u wish
val df = (data.select(data("cat_label").as("label"),
        $"gfs_pressure",$"gfs_humidity",$"fact_cwsm",$"gfs_precipitable_water"))

df.printSchema()
df.show()

// converting features to a specific format required by MLLIB documentation
val assembler = new VectorAssembler().setInputCols(colnames).setOutputCol("features")
val output = assembler.transform(df).select($"label",$"features")

output.printSchema()
output.show()

// Standard scaling....standard deviation set to 1 and mean set to 0....to ensure equal contibution of features towards the prediction
val scaler = (new StandardScaler()
  .setInputCol("features")
  .setOutputCol("scaledFeatures")
  .setWithStd(true)
  .setWithMean(false))

val scalerModel = scaler.fit(output)
val scaledData = scalerModel.transform(output).select($"label",$"scaledFeatures")
scaledData.printSchema()
scaledData.show()

// Performing PCA....2 componets selected here
// change setK value for the number of components you want to select
val pca = (new PCA()
  .setInputCol("scaledFeatures")
  .setOutputCol("features")
  .setK(2)
  .fit(scaledData))

val pcaDF = pca.transform(scaledData).select("label","features")
pcaDF.printSchema()
pcaDF.show()

// splitting to train and test data....80% and 20% respectively, seed refers to random shuffling of data to prevent any bias
val Array(training, test) = pcaDF.randomSplit(Array(0.8, 0.2),seed=12345)

val lr = new LogisticRegression()
val rf = new RandomForestClassifier()
val dt = new DecisionTreeClassifier()

// change it to dt.fit or lr.fit or rf.fit
// right now its in logistic regression, run it and capture the results (accuracy, confusion matrix etc)
// change lr to rf and run again, continue similarly for other models
val model = lr.fit(training)
val results = model.transform(test)

// evaluation part
// predictinAndLabels is a rdd which has 2 columns containing the predicted values and actual values respectively
// MultiClassMetrics is a inbuilt class specifically built for evaluation purpose....and the input for this is a rdd
//NOTE: Throughout this project we have used dataframes and only here, we have used rdd
val predictionAndLabels = results.select($"prediction",$"label").as[(Double, Double)].rdd
val metrics = new MulticlassMetrics(predictionAndLabels)
println("Confusion matrix:" + metrics.confusionMatrix)
println(" ")
print("Accuracy: " + metrics.accuracy)

println(" ")
print("Precision: " + metrics.weightedPrecision)

println(" ")
print("Recall: " + metrics.weightedRecall)
