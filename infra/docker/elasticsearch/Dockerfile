ARG flavor=7.6.1

FROM elasticsearch:$flavor as base

LABEL maintainer="tshinow@gmail.com"

RUN elasticsearch-plugin install analysis-kuromoji
RUN elasticsearch-plugin install analysis-icu