Intellij Diet Plugin
====================

This plugin adds support for [Diet templates](http://vibed.org/templates/diet), you should have the [intellij-dlanguage](https://github.com/intellij-dlanguage/intellij-dlanguage/) plugin installed as a prerequisite.

### What are Diet templates?

Diet templates are HTML templates which are statically compiled down to native D code. Dynamic pages thus have almost no runtime overhead and are often even faster than static pages on disk, because they are just written directly from RAM to the HTTP connection.

The syntax equals that of [Pug](https://pugjs.org/) templates with the exception of some of the advanced syntax features. The main difference is that you write D expressions and statements instead of JavaScript. 

A Diet template could like like:

```diet
doctype html
html
    head
        title D statement test
    body
        - import std.algorithm : min;
        p Four items ahead:
        - foreach( i; 0 .. 4 )
            - auto num = i+1;
            p Item
                b= num
        p Prints 8:
        p= min(10, 2*6, 8)
```
### Supported versions of IntelliJ

| Plugin Version | IntelliJ Versions |
| :--- | :--- |
| v1 (not yet released) | 2017.1.* - 2017.2 |

### Building and running the code

The project uses Gradle with the [gradle-intellij-plugin](https://github.com/JetBrains/gradle-intellij-plugin). Simply use the Gradle wrapper in the root of the project to build the plugin using the following:

```bash
./gradlew :runIde
```

You can also use the plugin to boot up a stand alone instance of IntelliJ with the plugin installed using:

```bash
./gradlew runIde
```
