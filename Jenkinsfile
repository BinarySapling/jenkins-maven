pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                checkout scm

                dir('maven/studentapp') {
                    bat '''
                    docker run --rm ^
                      -v "%CD%:/workspace" ^
                      -w /workspace ^
                      maven:3.9.9-eclipse-temurin-17 ^
                      mvn clean test
                    '''
                }
            }
        }
    }
}