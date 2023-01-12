pipeline {
  agent {
    docker {
      image 'node:lts-alpine'
      args '-p 3000:3000 -p 5000:5000'
    }
  }
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
