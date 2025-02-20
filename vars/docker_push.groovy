def call(String ProjecName, String ImageTag, String DockerCred){
  withCredentials([usernamePassword(credentialsId: DockerCred, 
                                                 usernameVariable: 'USERNAME', 
                                                 passwordVariable: 'PASSWORD')]){
    // Securely log in to Docker
    sh 'echo $PASSWORD | docker login -u $USERNAME --password-stdin'
  }
    // Push the Docker image
  sh "echo "Pusing Docker Image"
  sh "docker push $USERNAME/${ProjectName}:${ImageTag}"
}
