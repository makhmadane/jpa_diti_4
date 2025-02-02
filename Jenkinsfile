pipeline {
    agent any
    
    tools{
        jdk 'java17'
        maven 'maven3'
    }
    stages {
        
    
        stage('compile') {
            steps {
                sh "mvn compile"
            }
        }
        stage('test') {
            steps {
                 sh "mvn test"
            }
        }
         stage('package') {
            steps {
                 sh "mvn package"
            }
        }
    }
}
