def buildJar (){
    echo "Building Jar ....."
    sh "mvn package"
}

def buildDocker() {
    echo 'Building docker image'
    withCredentials([usernamePassword(credentialsId: 'docker-credentials', usernameVariable: 'USER', passwordVariable: 'PWD')]){
        sh 'docker build -t nguyenmanhtrinh/demo-app:jma-1.5 .'
        sh "echo ${PWD} | docker login -u ${USER} --password-stdin"
        sh 'docker push nguyenmanhtrinh/demo-app:jma-1.5'
    }
}
return this 
