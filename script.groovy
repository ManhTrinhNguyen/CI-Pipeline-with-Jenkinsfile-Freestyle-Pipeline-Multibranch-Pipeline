def buildJar (){
    echo "Building Jar ....."
    sh "mvn package"
}

def buildDocker() {
    echo 'Building docker image'
    withCredentials([usernamePassword(credentialsId: 'dockerhub-credentials', usernameVariable: 'USER', passwordVariable: 'PWD')]){
        sh 'docker build -t nguyenmanhtrinh/demo-app:jma-1.2 .'
        sh 'echo $PWD | docker login -u $USER --password-stdin'
        sh 'docker push nguyenmanhtrinh/demo-app:jma-1.2'
    }
}
return this 
