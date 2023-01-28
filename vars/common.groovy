def compile() {
  if (app.lang == "nodejs") {
    sh 'npm install'
  }

}