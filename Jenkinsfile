pipeline {
  agent {label 'windows'}
  options {
    buildDiscarder(logRotator(numToKeepStr: '6'))
  }
  stages {
    stage('Build') {
      steps {
        sh './gradlew clean check --no-daemon'
      }
    }
  }
  post {
    always {
        junit(
          allowEmptyResults: true,
          testResults: '**/build/test-results/test/*.xml'
        )
    }
  }
}