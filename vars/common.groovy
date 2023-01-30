def compile() {
  if (app_lang == "nodejs") {
    sh 'npm install'
    sh 'env'
  }

  if (app_lang == "maven") {
    sh 'mvn package'
  }

}

def unittests() {

  if (app_lang == "nodejs") {
    // Developer is missing unit test cases in our project, He need to add them as best practice, we are skipping to proceed further
      sh 'npm test'

  }

  if (app_lang == "maven") {
    sh 'mvn test'
  }

  if (app_lang == "python") {
    sh 'python3 -m unittest'
  }

}

def email(email_note) {
  sh 'env'
  mail bcc: '', body: 'Job Failed : ', cc: '', from: 'charanraj469@gmail.com', replyTo: '', subject: 'TEST FROM JENKINS', to: 'charanraj469@gmail.com'
}

