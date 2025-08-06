# Use OpenJDK base image
FROM openjdk:17

# Set working directory
WORKDIR /usr/app

# Copy jar file into container
COPY target/starter-project-0.0.1-SNAPSHOT.jar /usr/app

# Expose port
EXPOSE 9091

# Start the application
ENTRYPOINT ["java", "-jar", "starter-project-0.0.1-SNAPSHOT.jar"]
