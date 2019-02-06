# gradle-kotlin-dependency-resolution

## Its not working with Kotlin sources

```sh
./gradlew test
```

```
> Task :testProject:test FAILED

MyTest > testSomething() FAILED
    java.lang.NoClassDefFoundError at MyTest.kt:8
        Caused by: java.lang.ClassNotFoundException at MyTest.kt:8

1 test completed, 1 failed

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':testProject:test'.
> There were failing tests. See the report at: file:///home/mn/code/gradle-kotlin-dependency-resolution/testProject/build/reports/tests/test/index.html

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.

* Get more help at https://help.gradle.org

Deprecated Gradle features were used in this build, making it incompatible with Gradle 6.0.
Use '--warning-mode all' to show the individual deprecation warnings.
See https://docs.gradle.org/5.1.1/userguide/command_line_interface.html#sec:command_line_warnings

BUILD FAILED in 2s
11 actionable tasks: 11 executed
```

## Its working with Java sources

```sh
git checkout java-works
./gradlew test
```

```
BUILD SUCCESSFUL in 1s
4 actionable tasks: 4 executed
```
