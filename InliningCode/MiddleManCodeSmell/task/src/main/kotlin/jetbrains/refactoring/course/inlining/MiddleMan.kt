package jetbrains.refactoring.course.inlining

// Middle Man class


// DataProvider class
class DataProvider {
    fun fetchData(): String {
        // Some complex logic to fetch data from a remote server
        return "Data from the server"
    }
}

// Client class using MiddleMan
class Client {
    fun processData(): String {

        val dataProvider = DataProvider()
        return dataProvider.fetchData()        // Some complex logic to fetch data from a remote server
    }
}

fun main() {
    val client = Client()
    println(client.processData()) // Output: Data from the server
}
