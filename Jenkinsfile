pipeline {
    agent any

    stages {
        
        stage('Compile') {
            steps {
                // Run Maven on a Unix agent.
                sh "./mvnw -Dmaven.test.failure.ignore=true clean compile"
            }
        }
        stage('Build') {
            steps {
                // Run Maven on a Unix agent.
                sh "./mvnw -Dmaven.test.failure.ignore=true package"
            }
              post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}