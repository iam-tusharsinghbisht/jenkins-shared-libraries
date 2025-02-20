def call(String ProjecName, String ImageTag, String DockerCred){
  withCredentials([usernamePassword(credentialsId: DockerCred, 
                                                 usernameVariable: 'USERNAME', 
                                                 passwordVariable: 'PASSWORD')]){
    // Securely log in to Docker
    sh 'echo $PASSWORD | docker login -u $USERNAME --password-stdin'
    
    // Tag the Docker image
    // sh "docker image tag monitoring-app:latest  ${env.USERNAME}/{ProjectName}:{ImageTag}"
    
    // Push the Docker image
    sh "docker push ${env.USERNAME}/${ProjectName}:${ImageTag}"
  }
}
