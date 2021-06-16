
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/simonKimathi/smileIdentity.git'
                sh './mvnrw clean compile'
            }
        }
    }
}
