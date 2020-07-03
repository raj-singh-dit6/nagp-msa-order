FROM alpine
RUN apk update
RUN apk upgrade
RUN apk add openjdk8
ADD target/user-0.0.1-SNAPSHOT.jar /
# 405 is uid of guest user in alpine
USER 405
ENV PORT=8060
EXPOSE 8060
ENTRYPOINT ["java","-jar","order-0.0.1-SNAPSHOT.jar"]