pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                checkout scm

                dir('maven/studentapp') {
                    bat 'mvn test'
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