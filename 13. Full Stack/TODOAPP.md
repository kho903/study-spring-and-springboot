# Todo Management React App - First Steps
- 1. Counter example - What did we learn?
	- Basics of Components
		- View (JSX)
		- Styling (CSS)
		- State
		- Props
- 2. Todo Management App - What will we learn?
	- Routing
	- Forms
	- Validation
	- REST API calls
	- Authentication
	- & a lot more...

# Getting Started with Todo App - Components
- 1. LoginComponent
	- Make LoginComponent Controlled
		- Link form fields with state
	- Implement Hard-coded Authentication
	- Implement Conditional Rendering
- 2. WelcomeComponent
	- Implement Routing
- 3. ErrorComponent
- 4. ListTodosComponent
- 5. Add Bootstrap & style our pages
- 6. HeaderComponent
- 7. FooterComponent
- 8. LogoutComponent

# Full Stack - TODO REST API - Resources and Methods
- Hello World REST API
	- Hello World
		- @GetMapping(path = "/hello-world")
	- Hello World Bean
		- @GetMapping(path = "/hello-world-bean")
	- Hello World Path Variable
		- @GetMapping(path = "/hello-world/path-variable/{name}"
- Todo REST API
	- Retrieve Todos
		- @GetMapping("/users/{username}/todos")
	- Retrieve Todo
		- @GetMapping("/users/{username}/todos/{id}")
	- Delete Todo
		- @DeleteMapping("/users/{username}/todos/{id}")
	- Update Todo
		- @PutMapping("/users/{username}/todos/{id}")
	- Create Todo
		- @PostMapping("/users/{username}/todos")

# Getting Started with JWT
- Basic Authentication
	- No Expiration Time
	- No User Details
	- Easily Decoded
- How about a custom token system?
	- Custom Structure
	- Possible Security Flow
	- Service Provider & Service Consumer should understand
- JWT (Json Web Token)
	- Open, industry standard for representing claims securely between two parties
	- Can Contain User Details and Authorizations

# What does a JWT contain?
- Header
	- Type : JWT
	- Hashing Algorithm : HS512
- Payload
	- Standard Attributes
		- iss : The issuer
		- sub : The subject
		- aud : The audience
		- exp : When does token expire?
		- iat : When was token issued?
	- Custom Attributes
		- youratt1 : Your custom attribute 1
- Signature
	- Includes a Secret

# JWT Flow
```JSON
Request
{
	"username" : "user",
	"password" : "1234"
}

Response
{
	"token" : "TOKEN_VALUE"
}
```
- Use token in authorization header for future API calls
	- Authorization : "Bearer TOKEN_VALUE"

# Getting Started with JPA and Hibernate
- Build a Simple JPA App using Modern Spring Boot Approach
- Get Hands-on with JPA, Hibernate and Spring Boot
	- World before JPA-JDBC, Spring JDBC
	- Why JPA? Why Hibernate? (JPA vs Hibernate)
	- Why Spring Boot and Spring Boot Data JPA?
	- JPA Terminology : Entity and Mapping

# Spring Boot Auto Configuration Magic
- We added Data JPA and H2 dependencies
	- Spring Boot Auto Configuration does some magic:
		- Initialize JPA and Spring Data JPA frameworks
		- Launch an in memory database (H2)
		- Setup connection from App to in-memory database
		- Launch a few scripts at startup (example: data.sql, schema.sql)
- Remember - H2 is in memory database
	- Does NOT persist data
	- Great for learning
	- BUT NOT so great for production

# Hibernate vs JPA
- JPA defines the specification. It is an API.
	- How do you define entities?
	- How do you map attributes?
	- Who manages the entities?
- Hibernate is one of the popular implementations of JPA
- Using Hibernate directly would result in a lock in to Hibernate
	- There are other JPA implementations (Toplink, for example)


