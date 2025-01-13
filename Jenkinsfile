def gv

pipeline {   

    agent any
    tools {
        maven 'maven-3.9'
    }
    stages {

        stage("build jar") {
            steps {
                sh 'mvn package'
            }
        }

        stage("build docker image") {
            steps {
                echo 'Building docker image'

                withCredentials([
                    usernamePassword(credentialsId: 'dockerhub-credentials', usernameVariable: 'USER', passwordVariable: 'PWD')
                        ]){
                            sh 'docker build -t nguyenmanhtrinh/demo-app:jma-1.2 .'
                            sh 'echo $PWD | docker login -u $USER --password-stdin'
                            sh 'docker push nguyenmanhtrinh/demo-app:jma-1.2'
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
