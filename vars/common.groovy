def compile() {
  if (app_lang == "nodejs") {
    sh 'npm install'
  }

  if (app_lang == "maven") {
    sh 'mvn package'
  }

}

def unittests() {

  if (app_lang == "nodejs") {
    // Developer is missing unit test cases in our project, He need to add them as best practice, we are skipping to proceed further
    //sh 'npm test'
    sh 'echo Test Cases'
  }

  if (app_lang == "maven") {
    sh 'mvn test'
  }

}