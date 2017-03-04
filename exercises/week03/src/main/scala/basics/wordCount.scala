     

def wordCounter(lines: Array[String]): Map[String,Int] = {

  	var endMap = Map[String,Int]()

  	for (line <- lines){
  		val words = line.split(" ")
  		val groupedLine = words.groupBy(word => word).mapValues(_.size)
  		// for ((k, v) <- groupedLine){
  		// 	endMap += k -> v
  		// }
  		endMap = (endMap /: groupedLine) {case (map, (k,v)) =>
  			map + (k-> (v+map.getOrElse(k,0)))}
  		//println ("interim value: "+endMap)
  	}
  	
  	endMap
 }
  		

println(wordCounter(Array("this that and that that this and that that that", "fuck off and all")))
println (wordCounter(Array("tangled lilt canoe banana", "banana", "tangle lilt canoe")))
println (wordCounter(Array("jim james james jim and bob", "jim jim sleep sleep sheep", "bob and jim sleep")))
println (wordCounter(Array("334 is a magic Magic number", "334 is not a great omen")))


