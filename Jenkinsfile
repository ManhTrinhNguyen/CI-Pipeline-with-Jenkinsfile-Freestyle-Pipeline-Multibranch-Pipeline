
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
                    sh 'docker build -t nguyenmanhtrinh/demo-app:jma-1.2 .'
                    sh 'docker login -u nguyenmanhtrinh -p Manhtrinh511998!'
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

