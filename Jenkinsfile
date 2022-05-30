pipeline {
    agent any
    tools {
        gradle "gradle"
    }
    stages{
        stage("build"){
            steps{
                sh 'gradle --version'
            }
        }

        stage("QA"){
            steps{
                sh "echo hola QA mundo 2"
            }
        }   
    }
}