pipeline {
    agent any

    environment {
        DOCKER_COMPOSE_FILE = 'docker-compose.yml'
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/mathumathi0989/bddDocker.git', branch: 'main'
            }
        }
        stage('Setup Docker') {
            steps {
                script {
                    // Start Selenium Grid using Docker Compose
                    sh 'docker-compose up -d'
                }
            }
        }
        stage('Run Tests') {
            steps {
                // Run Maven tests
                sh 'mvn clean test -DsuiteXmlFile=testng.xml'
            }
            post {
                always {
                    // Archive TestNG results
                    archiveArtifacts 'target/surefire-reports/*.xml'
                    // Publish TestNG results
                    publishTestNGResults testResultsPattern: 'target/surefire-reports/testng-results.xml'
                }
            }
        }
        stage('Teardown Docker') {
            steps {
                script {
                    // Stop and remove Docker containers
                    sh 'docker-compose down'
                }
            }
        }
    }

    post {
        always {
            // Clean up Docker resources
            sh 'docker system prune -f'
        }
    }
}
