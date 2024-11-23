package blocks

// Meta: Fazer os exercícios de lógica e estudar os fundamentos do Kotlin
fun main(){
//    task01()
//    task02()
//    task03()
//    task04()
//    task05()
//    task06()
//    task07()
//    task08()
//    task09()
//    task10()
}

fun task01(){
    // Fazer um programa para receber um número inteiro de segundos do usuário e
    // imprimir a quantidade correspondente em horas, minutos e segundos.

    print("Digite o valor em segundos: ")
    val input : Int  = readln().toInt()
    println(" Horas [${input/3600}] \n" +
            " Minutos [${input/60}] \n" +
            " Segundos [${input}]"
    )
}

fun task02(){
    var sum: Int = 0
    for(i in 1 .. 3){
        print("Digite a $i° nota: ")
        sum += readln().toInt()
    }
    print("Media [${sum.toFloat()/3}]")
}

fun task03(){
    print("Digite um número: ")
    val numb = readln().toInt()
    print("o número $numb é [${if (numb%2 == 0) "Par" else "Impar"}]")
}

fun task04(){
    var box = arrayListOf<Int>()
    for (i in 0 until 3){
        print("Digite o [${i+1}°] lado: ")
        box.add(readln().toInt())
    }
    print("O trinagulo é ")
    if (box[0] == box[1] && box[0] == box[2] && box[1] == box[2]){
        print("Equilátero")
    } else if (box[0] != box[1] && box[0] != box[2] && box[1] != box[2]){
        print("Escaleno")
    } else {
        print("Isóceles")
    }
    print("\n $box")
}

fun task05(){
    var max : Float = 0f; var min : Float = 99f; var media : Float = 0f

    for (i in 0 until 3){
        print("Valor: ")
        var num = readln().toFloat()

        if (num > max){
            max = num
        }
        if (num < min){
            min = num
        }
        media += num
    }
    print("Max[$max] Min[$min] Media[${media/3}]")
}

fun task06(){
    print("Digite o 1° valor: ")
    val numA = readln().toFloat()
    print("Digite o 2° valor: ")
    val numB = readln().toFloat()

    print("Digite o operador aritimético (+, -, *, /): ")
    val choose = readLine()
    val result = when (choose){
        "+" -> numA + numB
        "-" -> numA - numB
        "*" -> numA * numB
        "/" -> numA / numB
        else -> null
    }

    print("O valor aritimético é $result")
}

fun task07(){
    for (i in 1000..9999){
        var num : String = i.toString()
        var A = (num[0].toString() + num[1].toString()).toInt()
        var B = (num[2].toString() + num[3].toString()).toInt()
        var sumAB = (A+B)
        if (sumAB*sumAB == num.toInt()){
            println(num)
        }
    }
}

fun task08(){
    println("Fibonnaci 1° -- 100°")
    var bag = arrayListOf<Float>(0f,1f)
    for(i in 1 until 100){
        bag.add(bag[i - 1] + bag[i])
    }
    println(bag)
}

fun task09(){
    for (num in 1..100){
        var count = 0
        for (div in 1 until num) {
            if(num%div == 0) {
                count += div
            }
        }
        if (num == count){
            println("$num é um número perfeito")
        }
    }
}

fun task10(){
    print("Digite o número: ")
    val num : Int = readln().toInt()
    var count = 0

    for (i in 1..num) if (num%i == 0) count++
    if (count == 2) println("$num é primo") else print("$num não é primo")
}