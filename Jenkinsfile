pipeline{
    agent any
    tools{
        maven 'Maven'
    }
    stages{
        stage("code checkout"){
            steps{
            checkout scm
            }
        }   
        stage("code build"){
            steps{
            bat "mvn clean"
            }
        }
        stage("unit test"){
            steps{
            bat "mvn test"
            }
        }
          stage("Sonar Analysis"){
            steps{
            withSonarQubeEnv("Test_SonarQube")
                {
		   
                        bat "mvn sonar:sonar"        
                }
            }
        }
 
    }
 
    post{
        success{
            bat "echo success"
            }
        }
}
