def call(){
    sh 'docker stop netflix'
    sh 'docker rm netflix'
}
