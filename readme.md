Go to graalvm path like:
``` 
cd /Library/Java/JavaVirtualMachines/graalvm-ce-17/Contents/Home
```
There is a command can install "gu", and use this command to install native image:
```
./gu install native-image or gu install native-image
```

Build code
```
mvn clean package -Pnative
```

The command above actually runs these commands
```
mvn spring-boot:process-aot
mvn spring-boot:process-test-aot
mvn spring-boot:build-image
mvn spring-boot:build-image
```

Usually execute command in ide
```
mvn -DskipTests spring-boot:run
```

Build to native-image, this command should be used in target service,
such as cd core-service
```
mvn -Pnative -DskipTests native:compile
```
This command can generate target-service.


