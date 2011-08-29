To use this project, you need to make a clone and run in two different shell windows, run one command in each:

mvn -Dselenium.version=2.6.0 jetty:run

mvn -Dselenium.version=2.6.0 test

This project deliberately fails if you do not specify the version to test, and it automaticall