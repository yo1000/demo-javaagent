# Demo Javaagent

## How to Build
```bash
./mvnw clean package
```

## How to Use
```bash
java \
-javaagent:/agent/jar/file/path/demo-javaagent-1.0-SNAPSHOT.jar \
-jar /main/jar/file/path/main.jar
```
