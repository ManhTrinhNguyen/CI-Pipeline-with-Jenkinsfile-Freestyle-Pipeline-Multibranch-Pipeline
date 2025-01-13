
pipeline {   

    agent any
    tools {
        maven 'maven-3.9'
    }
    stages {

        stage("build jar") {
            steps {
                script {
                    sh 'mvn package'
                }
                
            }
        }

        stage("build docker image") {
            steps {
                script {
                    echo 'Building docker image'
                    withCredentials([usernamePassword(credentialsId: 'docker-credentials', usernameVariable: 'USER', passwordVariable: 'PWD')]){
                        sh 'docker build -t nguyenmanhtrinh/demo-app:jma-1.3 .'
                        sh "echo ${PWD} | docker login -u ${USER} --password-stdin"
                        sh 'docker push nguyenmanhtrinh/demo-app:jma-1.3'
                    }
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

