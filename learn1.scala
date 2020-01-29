20 > 21
val arr = Array('C', 'D', 'E')
println(arr { 2 })
val players: Array[String] = new Array[String](4)
players(0) = "Skype"
players(1) = "Facebook"
players(2) = "Google"
players(3) = "Amazon"
players.foreach(println)
val anyTypeArray: Array[Any] = new Array[Any](3)
anyTypeArray(0) = "Amazon"
anyTypeArray(1) = false
anyTypeArray(2) = 34
anyTypeArray.foreach(println)
val listPlayers =
  List("Transistor", "Amplifier", "Capacitor", "Conductors", "Insulators")
listPlayers.foreach(println)
// Prepending into File using cons(::)
val newList = "Microsoft" :: listPlayers
println(
  "\n---------------------------Prepending New Element at the beginning of list -----------------------------------\n"
)
newList.foreach(println)
// Nil is Empty List
println(newList.contains("Microsoft"))
// Nil Will always be includes at last when creating new List
val jobs = "Extract" :: "Transform" :: "Load" :: Nil
println(jobs)
// Length Of List
println(jobs.length)
// Concatenating Two List
val jobsAndPlayers = jobs:::newList
println(jobsAndPlayers)
