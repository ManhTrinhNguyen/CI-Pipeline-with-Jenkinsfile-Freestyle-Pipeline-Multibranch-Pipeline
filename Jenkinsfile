@Library('jenkins-shared-library')
def gv
pipeline {   
    agent any
    tools {
        
    }
    stages {
        stage("init") {
            steps {
                script {
                    gv = load "script.groovy"
                }
            }
        }

        stage("test") {
            steps {
               script {
                  echo "Testing Applications"
               }
            }
        }
    
        stage("build jar") {
            steps {
                script {
                    sh 'mvn package'
                }
            }
        }

        stage("Build Image") {
            steps {
                script {
                    buildImage()
                }
            }
        }

       
        stage("deploy"){
            steps {
               echo "Deploying Application"
            }
        }
    } 
}
