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
                    usernamePassword(credentialsId: 'docker-hub-repo', usernameVariable: 'USER', passwordVariable: 'PWD')
                        ]){
                            sh 'docker build -t nguyenmanhtrinh/demo-app:jma-1.2 .'
                            sh 'docker login -u $USER -p $PWD'
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
