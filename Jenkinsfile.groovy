pipeline {    
    agent { label 'BuildServer' };
    environment{
        ENV_HELLO="Hello World!" 
    }

    stages{
        stage('hello-world'){
            steps{
                echo "Hello World!"
                //script {
		        //    echo "Hello World!!"
                //    echo "${ENV_HELLO}"
                //}
            }
        }
    }
}
