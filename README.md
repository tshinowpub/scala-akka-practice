# scala-akka-practice
Scala Practice use [PlayFramework](https://www.playframework.com/)

## Run Application

Start Docker container.
```
$ docker-compose up -d
```

Into Docker application container.
```
$ docker exec -it scala-akka-practice-app bash
```

Into sbt.
```
$ sbt
```

compile in sbt.
```
$ compile
```

Run Application　in [Development mode](https://www.playframework.com/documentation/2.8.0/PlayConsole#Development-mode
).

```
$ run
```

Run Application　in [Development mode](https://www.playframework.com/documentation/2.8.0/PlayConsole#Development-mode
) outside sbt.
```
$ sbt run
```