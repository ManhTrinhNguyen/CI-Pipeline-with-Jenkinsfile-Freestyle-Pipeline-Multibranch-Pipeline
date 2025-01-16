@Library('jenkins-shared-library')
def gv
pipeline {   
    agent any
    tools {
        maven 'maven-3.9'
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
                    buildJar()
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
