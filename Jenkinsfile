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
                       bat "mvn org.sonarsource.scanner.maven:sonar-maven-plugin:4.0.0.4121:sonar" 
                }
            }
        }
	    stage("Publish to Artifactory"){
            steps{
                rtMavenDeployer(
                    id: 'deployer',
                    serverId: '3154027@artifactory',
                    releaseRepo: 'sonal.nagp.2022',
                    snapshotRepo: 'sonal.nagp.2022'
                )
                rtMavenRun(
                    pom: 'pom.xml',
                    goals: 'clean install',
                    deployerId: 'deployer'
                    )
                rtPublishBuildInfo(
                    serverId:'3154027@artifactory',
                )
            }        
        }
 
    }
 
    post{
        success{
            bat "echo success"
            }
        }
}
