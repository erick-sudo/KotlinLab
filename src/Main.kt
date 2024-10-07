fun main() {
    try {
        val processBuilder = ProcessBuilder()

//        processBuilder.command("vlc")

//        val process = processBuilder.start()
//
//        val output = process.inputStream.bufferedReader().use { it.readText() }
//
//        println("Output:\n$output")
//
//        val exitCode = process.waitFor()
//        println("Exited with code: $exitCode")

        processBuilder.environment().forEach { (k, v) -> println("$k: $v") }
    } catch (e: Exception) {
        println(e.message)
    }
}