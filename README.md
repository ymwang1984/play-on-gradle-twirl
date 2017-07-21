# Example of Twirl templates

This is a demo of different twirl templates (html, js) used in Play.

## Sbt

Sbt compiles either html or js twirl templates under app/views/.

```
./sbt compile
```

And then check "target/scala-2.11/twirl/main/views/js/generic.template.scala" and you'll find "play.twirl.api.JavaScriptFormat" which is the correct interpretation since the template uses @JavaScript annotation.

## Gradle

Gradle only comprehends html format.

```
gradle wrapper --gradle-version 4.0
./gradlew compilePlayBinaryPlayTwirlTemplates
```

Check "build/src/play/binary/twirlTemplatesScalaSources/views/js/generic.template.scala" and you'll find "play.twirl.api.HtmlFormat" which is the incorrect format because the template specifies @JavaScript annotation. This format difference will cause rending issue in the Play front-ends.