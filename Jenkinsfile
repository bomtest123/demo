pipeline {
  agent any
  environment {
    CI = 'true'
  }
  stages {
    
    stage {
      agent {
        docker { image 'node:16.13.1-alpine' }
      } 
      steps {
        sh 'node --version'
      }
    }
            
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
