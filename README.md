# Spring Native
sample spring boot application using spring native

## Building locally

### Jar
to build a jar using normal java run

```shell
./mvnw clean package
```

then to start the app run

```shell
java -jar target/spring-native-example-0.0.1-SNAPSHOT.jar
```

### Native
To build a native executable using graalvm run

```shell
./mvnw -Pnative clean package
```
then to start the app run

```shell
./target/spring-native-example
```

### Docker Image
To build the native image using docker run

```shell
./mvnw clean spring-boot:build-image
```

then to start the app run

```shell
docker-compose up -d
```

## Dependencies

tools needed to build the project.

### Docker

### graalvm
```shell
sdk install java 21.3.1.r17-grl
```

### gcc
```shell
sudo apt-get install gcc
```

### libz-dev

```shell
sudo apt-get install libz-dev
```


