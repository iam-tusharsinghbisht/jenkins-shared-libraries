def call(String ProjectName, String ImageTag, String USERNAME){
  sh "docker build -t ${USERNAME}/${ProjectName}:${ImageTag} ."
}
