pipeline {
    agent {
        kubernetes {
            label 'slave'
        }
    }

    environment {
        ZONE='asia-southeast1'
        PROJECT_ID='curious-athlete-401708'
    }

    stages {
        stage("git checkout") {
            steps {
                script {
                    git(
                        url: 'https://github.com/gzroy/javatest,git',
                        credentialsId: 'git-token',
                        branch: 'main'
                    )
                }
            }
        }
    }

    stage("Build application docker image") {
        
    }
}