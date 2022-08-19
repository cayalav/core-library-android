pipeline {    
    agent { label 'linux' };

    environment{
        ENV_HELLO="Hello World!" 
    }

    stages{
        stage('hello-world'){
            steps{
                script {
		            echo "${ENV_HELLO}"
                }
            }
        }
    }
}
