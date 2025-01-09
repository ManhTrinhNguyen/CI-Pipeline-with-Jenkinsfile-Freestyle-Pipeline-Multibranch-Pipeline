def gv

pipeline {   
    agent any
    tools {
        maven 'Maven'
    }
    stages {
        stage("build") {
            steps {
                echo 'Building the Application' 
            }
        }

        stage("test"){
            steps {
                echo "Testing the Application"
            }
        }
        stage("deploy"){
            steps {
                echo "Deploying the Application"
            }
        }
} 
