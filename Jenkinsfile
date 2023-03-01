pipeline{
    agent any
    tools{
        maven 'Maven'
    }
    stages{
        stage("Code checkout"){
            steps{
            checkout scm
            }
        }   
        stage("Code build"){
            steps{
            bat "mvn clean"
            }
        }
        stage("Unit test"){
            steps{
            bat "mvn test"
            }
        }
        stage("Sonar Analysis"){
            steps{
            withSonarQubeEnv("Test_SonarQube")
                {
		    bat "echo Sonar Run half"
                        bat "mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.8.0.2131:sonar"        
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
