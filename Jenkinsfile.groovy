pipeline {    
    agent { label 'BuildServer' };

    environment{
        ENV_HELLO="Hello World!" 
    }

    stages{
        stage('hello-world'){
            steps{
                script {
		            echo "${ENV_HELLO}"
                    gradle --version
                }
            }
        }
    }
}
