# Migration Spring Boot Service

This Spring Boot 3.5 application serves as the starting point for progressively migrating legacy COBOL/CICS logic to modern Java services.

## Structure

```
java-migration
├── pom.xml                    # Maven build descriptor
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com/demo/migration
│   │   │       ├── MigrationApplication.java      # Bootstraps Spring Boot
│   │   │       └── controller
│   │   │           └── HealthController.java      # Simple /health endpoint
│   │   └── resources
│   │       └── application.properties             # Externalised config
│   └── test
│       └── java
│           └── com/demo/migration
│               └── MigrationApplicationTests.java # Context-load test
└── README.md
```

## Running locally

```bash
# From repository root
./mvnw spring-boot:run -pl java-migration -am
```

Navigate to <http://localhost:8080/health> to verify the service responds `OK`.

## Next steps

1. Design REST endpoints that mirror key COBOL transactions.
2. Introduce service & repository layers following Spring best-practices.
3. Connect to a relational database (e.g., PostgreSQL, Db2) for persisted data.
4. Implement integration tests and CI/CD pipeline.
