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
    sh 'npm test'
  }

  if (app_lang == "maven") {
    sh 'mvn package'
  }

}