FROM  openjdk:17-jdk-slim

COPY ./src/HelloWorld.java  ./classes/HelloWorld.java

RUN javac ./classes/HelloWorld.java

CMD ["java","-cp","./classes", "HelloWorld"]