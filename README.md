### Annotations

**`@RestController`**

- **Definition:** Used as a combination of the `@Controller` and `@ResponseBody` annotations.
- **Purpose/Function:** It marks a class as a RESTful service. Objects returned from a method annotated with this annotation are automatically converted to formats like JSON or XML and written to the body of the HTTP response.

**`@RequestMapping`**

- **Definition:** Used to map incoming HTTP requests (URL paths, HTTP methods, etc.) to specific controller methods or classes.
- **Purpose/Function:** It associates a method or class with a specific URL pattern. More specific versions like `@GetMapping` and `@PostMapping` are also available and commonly used in RESTful services.

### Terms

**Spring Initializr**

- **Definition:** A web-based tool available at `start.spring.io` that is used to quickly create new Spring Boot projects.
- **Purpose/Function:** By selecting the basic features of your project (Maven/Gradle, Java version, packaging type) and initial dependencies, it creates a ready-to-use project skeleton and allows you to download it as a ZIP file.

**Spring Boot Starter Projects**

- **Definition:** Pre-packaged sets of dependencies that serve a specific purpose (e.g., web, JPA, security).
- **Purpose/Function:** They collect all related libraries (for example, the `spring-boot-starter-web` dependency includes Spring MVC and Tomcat) under a single dependency, which reduces the complexity of the `pom.xml` file and accelerates the development process.

**Spring Boot Auto Configuration**

- **Definition:** Spring Boot's ability to automatically configure a project based on its dependencies.
- **Purpose/Function:** It eliminates the manual configuration workload that developers would otherwise have to handle. For example, when a `spring-boot-starter-web` dependency is added, a `DispatcherServlet` and a web server (like Tomcat) are automatically configured.

**Spring Boot DevTools**

- **Definition:** A set of tools designed to increase productivity in the development environment.
- **Purpose/Function:** It provides automatic application restart after code changes, offers live-reload functionality in the browser, and optimizes caching settings for development.

**Logging**

- **Definition:** The process of recording events, errors, or status information of an application at runtime to a file or console.
- **Purpose/Function:** It is crucial for monitoring how an application behaves, debugging errors, and identifying performance issues. Spring Boot supports powerful logging tools like `SLF4J` and `Logback` by default.

**Different Configuration for Different Environments**

- **Definition:** The practice of an application using different settings (database information, API keys, etc.) in different environments (development, test, production).
- **Purpose/Function:** It is typically managed using `application-{profile}.properties` or `application-{profile}.yml` files. The active profile is determined by the `spring.profiles.active` property, which ensures that the correct configuration for each environment is loaded automatically.

**Monitoring (Spring Boot Actuator)**

- **Definition:** A module used to monitor and manage a running Spring Boot application.
- **Purpose/Function:** It provides ready-to-use endpoints that expose the application's status (health, metrics, configuration) in production.
    - **Example Endpoints:** `beans`, `health`, `metrics`, `mappings`.

**Rest API**

- **Definition:** An architectural style that uses HTTP methods (GET, POST, PUT, DELETE) to develop web services that represent the state of resources (Representational State Transfer).
- **Purpose/Function:** It is used to provide lightweight, stateless, and scalable communication in client-server architectures.

**Controller**

- **Definition:** A class that contains methods to handle incoming HTTP requests and the business logic.
- **Purpose/Function:** It is responsible for processing the request, calling the `Service` layer when necessary, and returning an appropriate response (JSON data, an HTML page, etc.).

**Service**

- **Definition:** A class that contains business logic and communicates with the `Repository` layer for lower-level operations like database access.
- **Purpose/Function:** It separates the application's business rules and complex algorithms from the `Controller` and `Repository` layers, making the code cleaner, more modular, and more testable.

**Embedded Server**

- **Definition:** A server that is packaged as part of the application itself and can be run directly, unlike traditional application servers.
- **Purpose/Function:** It eliminates the need for an external server to run the application, which significantly simplifies the development, testing, and deployment processes.

**`.jar` (Java Archive)**

- **Definition:** A standard Java packaging format that combines Java classes, metadata, and resources into a single file.
- **Purpose/Function:** Spring Boot applications are typically packaged as executable `.jar` files. These files can be run directly with the `java -jar` command and contain all dependencies, including the embedded server.

**`.war` (Web Application Archive)**

- **Definition:** An archive format used to package web applications (as opposed to `.jar` files).
- **Purpose/Function:** It is designed to be deployed to a traditional Java EE server (like Tomcat, WebLogic). Spring Boot can also create a `.war` package, but the `.jar` format with the embedded server is more commonly preferred.
