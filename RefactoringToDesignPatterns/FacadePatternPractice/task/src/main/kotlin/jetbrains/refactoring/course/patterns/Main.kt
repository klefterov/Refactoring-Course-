package jetbrains.refactoring.course.patterns

fun main(args: Array<String>) {
    val originalVideoName = args[0]
    val processedVideoName = args[1]

    val videoConversionFacade = VideoConversionFacade()
    videoConversionFacade.convertVideo(originalVideoName, processedVideoName)
}
