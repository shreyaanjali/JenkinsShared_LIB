def call(String project, String hubUser, String ImageTag){
    sh "
      docker image build -t firstwebappimage:latest /src/Dockerfile
    "
}


/*//docker image tag ${hubUser}/${project}  ${hubUser}/${project}:${ImageTag}
      //docker image tag ${hubUser}/${project}  ${hubUser}/${project}:latest
*/