package blocks

import java.time.YearMonth

fun main(){
//    task30()
//    task31()
//    task32()
//    task34()
//    task56()
}

fun task30(){
    print("Mês: ")
    val month = readln().toInt()
    print("Ano: ")
    val year = readln().toInt()

    fun MesAno(mes : Int, ano : Int) : YearMonth {
        return YearMonth.of(ano, mes)
    }
    val result = MesAno(month, year)

    print("O mês de ${result.month} do ano de ${result.year} tem ${result.lengthOfMonth()} dias")
}

fun task31(){
    fun Formatter(sTime: String) : Int {
        var hour = "${sTime[0]}${sTime[1]}"
        var min = "${sTime[3]}${sTime[4]}"

        return (hour.toInt() * 60) + min.toInt()
    }

    fun DiffTime(begin: String, end : String) : Int{
        val Begin = Formatter(begin)
        val End = Formatter(end)

        val diff = (End - Begin)

        return diff
    }

    var A = "19:30"
    var B = "20:40"
    var vDiff = DiffTime(A,B)

    print("DiffTime ${vDiff/60} hora e ${vDiff%60} min")
}

fun task32(){
    print("n Termo do fibonacci: ")
    val nTermo = readln().toInt()
    var count : Int = 2

    fun Fibo(nA : Int, nB : Int){
        if (count <= nTermo) {
            var newFib = nA + nB // 1
            println(newFib) // 1
            var nA = nB // 1
            var nB = newFib // 1
            count++
            Fibo(nA, nB)
        } else {
            return
        }
    }
    Fibo(0,1)
}

fun task56(){
    var name = "Daniel Barros de Moreira"
    fun String.Abreviar() : String{
        return this.split(" ").filter {
            it.lowercase() !in listOf("dos", "de", "da", "do", "das")
        }.map { it.first() }.joinToString(".")
    }

    print(name.Abreviar())
}

