node{


  stage('SCM Checkout1'){
      git branch: 'main', credentialsId: 'git_hub_cred_01', url: 'https://github.com/sajeethpasha/dkr.git'
   }

    stage('Mvn Package2'){
    bat 'mvn install'
   }

     stage('Build Docker Image'){
     bat 'docker build -f Dockerfile -t sajeethpasha/dkr .'
   }

   stage('Push Docker Image'){
      bat "docker login -u sajeethpasha -p Docker@760"
     bat 'docker push sajeethpasha/dkr'
   }

}