ARG flavor=8-jdk-hotspot

FROM adoptopenjdk:$flavor as base

LABEL maintainer="wayfarermusic0130@gmail.com"

#==========================================================================
# Base
#==========================================================================
RUN apt-get update \
    && apt-get install -y \
        curl \
        gnupg \
        scala

#==========================================================================
# Develop
#==========================================================================
FROM base as develop

RUN echo "deb https://dl.bintray.com/sbt/debian /" | tee -a /etc/apt/sources.list.d/sbt.list \
    && curl -sL "https://keyserver.ubuntu.com/pks/lookup?op=get&search=0x2EE0EA64E40A89B84B2DF73499E82A75642AC823" | apt-key add \
    && apt-get update \
    && apt-get install -y \
        sbt \
        vim