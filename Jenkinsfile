pipeline {
    agent {
        docker {
            image 'maven:3.9.9-eclipse-temurin-17'
        }
    }

    stages {
        stage('Test') {
            steps {
                checkout scm
                dir('maven/studentapp') {
                    sh 'mvn clean test'
                }
            }
        }
    }

    post {
        always {
            junit 'maven/studentapp/target/surefire-reports/*.xml'
        }
    }
}