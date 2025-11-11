FROM eclipse-temurin:21

ARG GIT_USERNAME
ARG GIT_EMAIL

RUN apt-get update && apt-get install -y \
    maven \
    git \
    curl \
    && apt-get clean && \
    git config --global --add safe.directory /usr/src/app && \
    git config --global user.name "${GIT_USERNAME}" && \
    git config --global user.email "${GIT_EMAIL}"

WORKDIR /usr/src/app

CMD ["tail", "-f", "/dev/null"]
