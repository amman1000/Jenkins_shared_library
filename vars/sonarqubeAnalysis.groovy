def call() {
    withSonarQubeEnv('sonar-server') {
        sh ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=netflix -Dsonar.projectKey=netflix '''
    }
}
