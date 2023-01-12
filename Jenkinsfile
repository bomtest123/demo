pipeline {
  agent any
  environment {
    CI = 'true'
  }
  stages {
    stage('Build') {
      steps {
        sh './mvnw clean install -DskipTests'
      }
    }
    stage('Test') {
      steps {
        sh './mvnw test -Punit'
      }
    }
    stage('Deploy') {
      steps {
        sh 'nohup ./mvnw spring-boot:run -Dserver.port=8081 &'
      }
    }
  }
}
