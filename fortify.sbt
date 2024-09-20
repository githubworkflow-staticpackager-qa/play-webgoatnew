// enable the plugin
addCompilerPlugin(
  "com.lightbend" %% "scala-fortify" % "1.1.3"
    cross CrossVersion.patch)

// configure the plugin
scalacOptions ++= Seq(
  "-P:fortify:scaversion=24.2",
  "-P:fortify:build=play-webgoat"
)
