# 使用 GraalVM CE 22.3.1 作為基礎映像
FROM ghcr.io/graalvm/graalvm-ce:22.3.1

# 設定環境變數
ENV JAVA_HOME /opt/graalvm-ce-22.3.1
ENV PATH $JAVA_HOME/bin:$PATH

# 複製應用程式的 JAR 檔案到容器內
COPY target/your-application.jar /app/your-application.jar

# 切換到應用程式的工作目錄
WORKDIR /app

# 安裝 Native Image 工具
RUN gu install native-image

# 在容器內編譯生成 Native Image
RUN native-image --no-server --static -jar your-application.jar

# 設定容器啟動命令
CMD ["./core-service"]

# 開放應用程式的端口
EXPOSE 8080