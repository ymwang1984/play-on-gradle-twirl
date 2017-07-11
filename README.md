# Example of Twirl templates

This is a demo of different twirl templates (html, js) used in Play.

## Sbt

Sbt compiles either html or js twirl templates under app/views/.

```
./sbt run
```

And then go to http://localhost:9000 to see the running web application.

## Gradle

Gradle only comprehends html templates. If the controller refers to js template, the compilation fails.

```
gradle runPlayBinary
```

And then go to http://localhost:9000 to see the running web application.

Check app/controllers/Application.scala for more info.