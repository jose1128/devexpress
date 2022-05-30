pipeline {
    agent any
    tools {
        gradle "gradle"
    }
    stages{
        stage("build"){
            steps{
                sh 'gradle clean build -x test'
            }
        }

        stage("QA"){
            steps{
                sh "echo hola QA mundo 2"
            }
        }   
    }
}