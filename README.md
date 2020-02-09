# scala-akka-practice
Scala Practice use [PlayFramework](https://www.playframework.com/)

## References
- [PlayFramework](https://www.playframework.com/documentation/2.8.x/Home)
- [実践Scala入門](https://www.amazon.co.jp/%E5%AE%9F%E8%B7%B5Scala%E5%85%A5%E9%96%80-%E7%80%AC%E8%89%AF-%E5%92%8C%E5%BC%98/dp/4297101416)

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