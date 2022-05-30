pipeline {
    agent any
    stages{
        stage("build"){
            steps{
                sh "pwd"
                sh "ls"
                sh "./gradlew clean build"
            }
        }

        stage("QA"){
            steps{
                sh "echo hola QA mundo 2"
            }
        }   
    }
}