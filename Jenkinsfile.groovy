pipeline {    
    agent { label 'linux' };
    options {
        buildDiscarder logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '5', dayToKeepStr '', numToKeepStr: '5')
        disableConcurrentBuilds()
    }
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
