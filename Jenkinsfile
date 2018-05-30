pipeline {
    agent any

    environment {
        NameSpace='haaohao'
        WebServer='172.31.12.139'
        port='9999'
    }

    stages {
        stage('sonar') {
            steps {
                sh './gradlew sonarqube'
            }
        }
        stage('test') {

            steps {
                sh './gradlew test'
            }
        }
        stage('package') {
            steps {
                sh './gradlew build'
            }
        }
        stage('Deploy') {
            steps {
                withCredentials([sshUserPrivateKey(credentialsId: "training_pem", keyFileVariable: 'keyfile')]) {
                    sh './deploy.sh'
                }
            }
        }
    }
}