name := "for-comprehensions"
scalaVersion := "2.12.0"

excludeFilter in unmanagedSources := "forecast.scala"

initialCommands in console :=
  "println(\":sh cat forecast.scala\")\n" +
  "println(\"res1.lines.foreach(println(_))\")\n" +
  ""
