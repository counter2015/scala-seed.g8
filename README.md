# Scala seed g8 template

A [Giter8][g8] template for scala project!

## Quick Start
```
sbt new counter2015/scala-seed.g8
```

## Introduction
This is a common template for scala project
It includes following default library dependency 
- [logback](http://logback.qos.ch/), scala-logging: log
- [scalaTest](http://www.scalatest.org/): test
- [typesafe config](https://github.com/lightbend/config): config

The scala tools and version are:
- Scala 2.13.2
- sbt 1.3.10
- [sbt-assembly](https://github.com/sbt/sbt-assembly) 0.14.10
- g8 0.12.0

## Template structure
The project generate by g8 template will have the same structure of `src/main/g8`
Following file path in table is relative to `src/main/g8`

|File path| explain|
|:--:|:--:|
|project/build.properties| set sbt version |
|project/Dependencies| project depend library |
|project/plugins.sbt| sbt plugins |
|build.sbt| the sbt build file|
|src| this directory will copy to your project|

Other interesting template :

https://github.com/foundweekends/giter8/wiki/giter8-templates



License
----------------
Written in 2019 by counter2015 <voidcounter@gmail.com>

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See [cc zero 1.0](http://creativecommons.org/publicdomain/zero/1.0/).

[g8]: http://www.foundweekends.org/giter8/
