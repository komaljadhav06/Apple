pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Install Dependencies') {
            steps {
                sh '''
                python3 -m venv .venv
                source .venv/bin/activate
                pip install -r requirements.txt
                '''
            }
        }
        stage('Run Tests') {
            steps {
                sh '''
                source .venv/bin/activate
                pytest
                '''
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying the application...'
                // Add deployment commands here
            }
        }
    }
}
 
pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Install Dependencies') {
            steps {
                sh '''
                python3 -m venv .venv
                source .venv/bin/activate
                pip install -r requirements.txt
                '''
            }
        }
        stage('Run Tests') {
            steps {
                sh '''
                source .venv/bin/activate
                pytest
                '''
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying the application...'
                // Add deployment commands here
            }
        }
    }
}
 
