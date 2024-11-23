import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

var countId = 1
var DB = mutableMapOf<Int,TaskMold>()

fun main (){
    do {
        println("--- Menu ---")
        println("1 - Create")
        println("2 - Read")
        println("3 - Update")
        println("4 - Delete")
        print("Choose the option: ")
        var choose: Any = readln().toInt()

        when (choose) {
            1 -> create()
            2 -> read()
            3 -> update()
            4 -> delete()
            0 -> break
            else -> continue
        }
    } while (true)
}

data class TaskMold(var title : String, var content: String){
    var status : Boolean = false
    val timeEvent : Any = LocalDateTime.now().format(
        DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")
    )
}

fun create(){
    println("-- Create")
    print("title: ")
    val title = readln()
    print("content: ")
    val content = readln()
    DB[countId++] = TaskMold(title, content)
}

fun read(){
    println("-- Read")
    for((key, value) in DB){
        println(
            "id: $key \n" +
            "title: ${value.title} \n" +
            "content: ${value.content} \n" +
            "status: ${value.status} \n" +
            "dateTime: ${value.timeEvent}"
        )
    }
}

fun update(){
    println("-- Update")
    print("update by task's ID: ")
    var nID = readln().toInt()
    var obj = DB[nID]
    print("new title: ")
    obj?.title = readln()
    print("new content: ")
    obj?.content = readln()
    print("new status: ")
    obj?.status = readln().toBoolean()
}

fun delete(){
    print("remove by task's ID: ")
    var nID = readln().toInt()
    DB.remove(nID)
}