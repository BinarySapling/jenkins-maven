pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                checkout scm
                dir('maven\\studentapp') {
                    bat 'mvn clean test'
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