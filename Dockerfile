FROM java:8-jdk-alpine
LABEL maintainer="NarendraKumarKolli knarendra585@gmail.com"
LABEL version=1.0
EXPOSE 9696
WORKDIR /opt
RUN apt-get install git && \
    wget http://www-eu.apache.org/dist/maven/maven-3/3.3.9/binaries/apache-maven-3.3.9-bin.tar.gz && \
    tar -xvzf apache-maven-3.3.9-bin.tar.gz && \
    mv apache-maven-3.3.9 maven

ENV REPOSITORY="https://github.com/narendrajava1/demodocker.git"
ENV M2_HOME=/opt/maven
ENV PATH=${M2_HOME}/bin:${PATH}

RUN git clone ${REPOSITORY}
WORKDIR /opt/demodocker

RUN chmod +x mvnw

CMD ["./mvnw","spring-boot:run"]