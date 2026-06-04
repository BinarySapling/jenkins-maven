pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                checkout scm
                dir('maven/studentapp') {
                    script {
                        docker.image('maven:3.9.9-eclipse-temurin-17').inside {
                            sh 'mvn clean test'
                        }
                    }
                }
            }
        }
    }
}