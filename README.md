# druid-emitter-extn-sample
Sample code for writing custom druid emitter

This repository contains sample code for writing a Druid extension which shows how to write
a custom druid emitter for sending druid metrics to system of your choice.

General Documentation for writing Druid Extensions is available at -- http://druid.io/docs/latest/Modules.html

Basically, your project should contain an implementation of "io.druid.initialization.DruidModule" which is
specified in "META-INF/services/io.druid.initialization.DruidModule"

Here is the most basic project layout for druid extension.

```
$ tree
.
|-- pom.xml
|-- README.md
`-- src
    `-- main
        |-- java
        |   `-- io
        |       `-- druid
        |           `-- sample
        |               `-- emitter
        |                   |-- SampleEmitterConfig.java
        |                   |-- SampleEmitterModule.java
        |                   `-- SampleLoggingEmitter.java
        `-- resources
            `-- META-INF
                `-- services
                    `-- io.druid.initialization.DruidModule
```
