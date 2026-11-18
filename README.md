# Task Matcher

Spring Boot API for the task-matching interview. It serves one endpoint and has one JUnit test.

## Requirements

- Java 17
- No separate Maven install. This repo includes the Maven wrapper (`./mvnw`).

## Run

From this folder:

```bash
./mvnw spring-boot:run
```

Leave that terminal open. The app listens on port **8081** (`src/main/resources/application.properties`). Port 8080 is avoided because it is often already in use.

When the log says `Started TaskMatcherApplication`, check the endpoint from another terminal:

```bash
curl http://localhost:8081/hello_world
```

Expected response:

```
HTTP 200
{"hello": "world"}
```

Stop the server with `Ctrl+C`.

If startup fails with `Port 8081 was already in use`, a previous copy is still running. Stop it, then start again:

```bash
lsof -nP -iTCP:8081 -sTCP:LISTEN
kill <pid>
./mvnw spring-boot:run
```

## Test

```bash
./mvnw test
```

`SanityTest` asserts that `1 == 1`.

## Layout

```
src/main/java/com/taskmatcher/TaskMatcherApplication.java   starts the app
src/main/java/com/taskmatcher/HelloController.java          HTTP endpoints
src/main/resources/application.properties                   port and app name
src/test/java/com/taskmatcher/SanityTest.java               unit test
```

Add new endpoints in `HelloController`.
