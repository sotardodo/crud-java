pipeline {
    agent any

    tools {
        maven 'Maven 3.8.5'   
        jdk 'JDK 11'          
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/sotardodo/crud-java.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}

