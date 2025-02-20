def call(String ProjecName, String ImageTag, String DockerCred){
  withCredentials([usernamePassword(credentialsId: ${DockerCred}, 
                                                 usernameVariable: 'USERNAME', 
                                                 passwordVariable: 'PASSWORD')]){
  sh "docker login -u ${env.USERNAME} -p ${env.PASSWORD}"
  // sh "docker image tag monitoring-app:latest  ${env.USERNAME}/{ProjectName}:{ImageTag}"
  sh "docker push ${env.USERNAME}/${ProjectName}:${ImageTag}"
  }
}
