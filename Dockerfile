FROM openjdk:17
EXPOSE 8080
ADD target/images_pc4_adaptatives.jar images_pc4_adaptatives.jar
ENTRYPOINT ["java","-jar","/images_pc4_adaptatives.jar"]