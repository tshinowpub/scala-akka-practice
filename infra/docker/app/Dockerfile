ARG flavor=8-jdk-hotspot

FROM adoptopenjdk:$flavor as base

LABEL maintainer="tshinow@gmail.com"

ARG scala=2.13.1
ARG sbt=1.3.6

ENV CURRENT_DIR /var/www/scala
ENV SCALA_VERSION $scala
ENV SBT_VERSION $sbt

WORKDIR $CURRENT_DIR

#==========================================================================
# Base
#==========================================================================
RUN apt-get update \
    && apt-get install -y \
        curl \
        gnupg \
        unzip \
        wget \
        zip \
    && mkdir -p ${CURRENT_DIR} \
    && curl -s "https://get.sdkman.io" | bash \
    && /bin/bash -c "source ${HOME}/.sdkman/bin/sdkman-init.sh && sdk install scala ${SCALA_VERSION}"

#==========================================================================
# Develop
#==========================================================================
FROM base as develop

RUN /bin/bash -c "source ${HOME}/.sdkman/bin/sdkman-init.sh && sdk install sbt ${SBT_VERSION}"

EXPOSE 9000