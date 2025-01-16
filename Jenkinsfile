@Library('jenkins-shared-library')
def gv
pipeline {   
    agent any

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
                  echo "Executing pipline for Branch ${BRANCH_NAME}"
               }
            }
        }
    
        stage("build jar") {
            // when {
            //     expression {
            //         BRANCH_NAME == "main"
            //     }
            // }
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
            // when {
            //     expression {
            //         BRANCH_NAME == "main"
            //     }
            // }
            steps {
               echo "Deploying Application"
            }
        }
    } 
}
