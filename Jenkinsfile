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

        stage("build jar") {
            steps {
                script {
                    gv.buildJar()
                }
                
            }
        }

        stage("build docker image") {
            steps {
                script {
                    gv.buildDocker()
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

