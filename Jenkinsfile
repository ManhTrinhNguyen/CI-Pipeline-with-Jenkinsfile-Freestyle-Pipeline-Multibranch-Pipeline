library identifier: 'jenkins-shared-library@main', retriever: modernSCM(
    [$class: 'GitSCMSource',
    remote: 'https://github.com/ManhTrinhNguyen/Jenkin-Shared-Library.git',
    credentialsId: 'github-credentials'])

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

        stage("Build and Push Image") {
            steps {
                script {
                    buildImage 'nguyenmanhtrinh/demo-app:jma-4.1'
                    dockerLogin()
                    pushImage 'nguyenmanhtrinh/demo-app:jma-4.1'
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
