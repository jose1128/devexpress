pipeline {
    agent any
    stages{
        stage("build"){
            steps{
                sh "chmod +x ./gradlew"
                sh "./gradlew clean build -x test"
            }
        }

        stage("QA"){
            steps{
                sh "echo hola QA mundo 2"
            }
        }   
    }
}