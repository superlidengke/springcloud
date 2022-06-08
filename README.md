# springcloud

## Version
- Gradle  7.4.2
- JDK openjdk 16
- Spring Boot 2.6.3
- Windows 10

## Start Application
`.\gradlew bootRun`
Check message: http://localhost:8080/

## Restart
Rebuild the project

## Run unit test
`.\gradlew test`

## Graphql
http://localhost:8080/graphiql
```
query{
    book {
        id,
        name,
        author {
            id
        }
    }
}
```