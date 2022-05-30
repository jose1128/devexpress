pipeline {
    agent any
    stages{
        stage("build"){
            steps{
                node {
                    withGradle {
                        sh './gradlew build'
                    }
                }
            }
        }

        stage("QA"){
            steps{
                sh "echo hola QA mundo 2"
            }
        }   
    }
}