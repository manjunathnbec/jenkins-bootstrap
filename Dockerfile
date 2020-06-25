FROM jenkins/jenkins:2.204.1

COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN /usr/local/bin/install-plugins.sh <  /usr/share/jenkins/ref/plugins.txt

COPY init-trigger-job.xml /usr/share/jenkins/ref/jobs/init-trigger/config.xml

ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false

