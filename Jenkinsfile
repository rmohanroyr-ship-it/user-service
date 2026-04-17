pipeline {
    agent any

    stages {

        stage('Build JAR') {
            steps {
                bat 'mvnw.cmd clean package'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t user-service .'
            }
        }

        stage('Stop Old Container') {
            steps {
                bat 'docker stop user-service || exit 0'
                bat 'docker rm user-service || exit 0'
            }
        }

        stage('Run Container') {
            steps {
                bat 'docker run -d -p 8087:8081 --name user-service user-service'
            }
        }
    }
}
