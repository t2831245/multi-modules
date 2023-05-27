# 使用 AdoptOpenJDK 17 作为基础镜像
FROM adoptopenjdk:17-jdk-hotspot

# 设置工作目录
WORKDIR /app

# 将打包好的 JAR 文件复制到容器中
COPY target/core-service-1.0.0.jar /app/app.jar

# 暴露应用程序的端口（根据需要进行更改）
EXPOSE 8080

# 启动应用程序
CMD ["java", "-jar", "/app/app.jar"]