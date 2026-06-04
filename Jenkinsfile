pipeline {
    agent {
        docker {
            image 'maven:3.9.9-eclipse-temurin-17'
            args '-w /workspace'
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
            script {
                if (fileExists('maven/studentapp/target/surefire-reports')) {
                    junit 'maven/studentapp/target/surefire-reports/*.xml'
                }
            }
        }
    }
}