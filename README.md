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
gradle wrapper --gradle-version 4.0
./gradlew runPlayBinary
```

Check app/controllers/Application.scala for more info.

The compilation error is:

```
> Task :compilePlayBinaryScala
Pruning sources from previous analysis, due to incompatible CompileSetup.
/Users/ymwang/Downloads/play-on-gradle-twirl/app/controllers/Application.scala:15: object generic is not a member of package views.js
    Ok(views.js.generic.render("foo.js", "payload"))
                ^
one error found


FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':compilePlayBinaryScala'.
> Compilation failed
```
