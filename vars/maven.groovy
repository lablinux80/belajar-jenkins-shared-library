def call(list commands) {
	for (command in commands)
	sh("./mvnw ${command}")
}