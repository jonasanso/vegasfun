vegasfun
===================

Simple example of running Vegas viz https://github.com/vegas-viz/Vegas

Sadly the code in master is not released to maven, so before running you have to clone it and run 
```shell script
$ git clone git@github.com:vegas-viz/Vegas.git vegas
vegas$ sbt publishLocal
```

Besides, the docs in Vegas does not clearly indicate that you need to add the javaFXModules to your library dependencies
check the contents in build.sbt file

Finally, make sure you are running jdk11 or above and run 
```shell script
vegasfun$ java -version
openjdk version "11.0.2" 2019-01-15
OpenJDK Runtime Environment 18.9 (build 11.0.2+9)
OpenJDK 64-Bit Server VM 18.9 (build 11.0.2+9, mixed mode)
vegasfun$ sbt run
```






