deff call() {
	return sh(script: "git log -n 1 --pretty=format:'%h'", returnStdout: true).trim()
}
