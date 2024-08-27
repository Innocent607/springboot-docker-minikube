FROM eclipse-temurin:17

EXPOSE 8080
ENV app_directory /opt/hr-alarm
RUN mkdir -p ${app_directory}
WORKDIR ${app_directory}

COPY target/*.jar ${app_directory}/app.jar

RUN chgrp -R 0 ${app_directory} && \
    chmod -R g=u ${app_directory}

CMD ["java", "-jar", "app.jar"]
