# hello-ci

Small Java + Maven project for demonstrating GitHub Actions CI in class.

## What this demo includes

- A minimal Java app in `src/main/java/com/example/App.java`
- A unit test in `src/test/java/com/example/AppTest.java`
- A GitHub Actions workflow in `.github/workflows/java-maven-ci.yml`

## Local run

```bash
mvn clean verify
```

## CI behavior

The workflow runs on:

- Pushes to `main`
- Pull requests targeting `main`
- Manual trigger from the Actions tab (`workflow_dispatch`)

Pipeline steps:

1. Checkout repository
2. Setup JDK 21 with Maven dependency cache
3. Run `mvn -B clean verify`
4. Upload built JAR as an artifact

## Classroom demo idea

1. Push working code and show green CI.
2. Intentionally break `AppTest` and push again.
3. Show failed workflow and logs.
4. Fix test and push to restore green CI.
