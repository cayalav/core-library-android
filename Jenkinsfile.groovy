@Library('bpd-pipeline-library')_
import org.bpd.AndroidHelper
def androidUtils = new AndroidHelper(this)
//def ARTIFACTS_BUILD = " assembleDev"
ARTIFACT_URL_LISTS  = []
ARTIFACT_TO_APPCENTER_LIST  = []

pipeline {
    
    agent { label 'BuildServer' };
    
    environment{
        ENV_HELLO="Hello World!" 
    }

    stages{
        stage('hello-world'){
            steps{
              script {
		  echo "Hello World!!"
                  echo "${ENV_HELLO}"
              }
			
            }
        }
    }
}
