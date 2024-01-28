def call() {
    sh 'trivy image sevenajay/netflix > trivyimage.txt'
}
