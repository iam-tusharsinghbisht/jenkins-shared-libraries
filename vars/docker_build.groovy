def call(String ProjectName, String ImageTag, String dockerUsername){
  sh "docker build -t ${dockerUsername}/${ProjectName}:${ImageTag} ."
}
