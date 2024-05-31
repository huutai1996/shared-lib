def call(string repoUrl, String branch) {
    def workingDir = "${env.WORKSPACE}"
    sh "git clone ${repoUrl} ${workingDir}"
    sh "git checkout ${branch}"
    return workingDir
}