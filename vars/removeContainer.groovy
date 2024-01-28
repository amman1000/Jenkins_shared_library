def call(){
    sh 'docker stop netflex'
    sh 'docker rm netflex'
}
