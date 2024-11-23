package blocks

import kotlin.math.pow

fun main() {
//    task11()
//    task17()
//    task18()
//    task20()
//    task23()
//    task25()
//    task26()
//    task27()
//    task28()
//    task29()
}

fun task11(){
    print("Digite: ")
    var numb = readln().toInt()
    var bag = arrayListOf<Int>()
    var n = 2
    while (numb != 1){
        if (numb%n == 0) {
            bag.add(n)
            numb /= n
            println(numb)
        } else {
            n++
        }
    }
    println(bag)
}

fun task17(){
    var sum = 0
    var count = 0
    while (true){
        print("Digite: ")
        var num : Int = readln().toInt()
        if (num < 0){
            break
        }
        sum += num
        count += 1
    }
    println("Result : ${sum/count}")

}

fun task18(){
    print("Horas: ")
    var nHoras = readln().toInt()
    print("Valor por Hora: ")
    var nValorHora = readln().toInt()

    var result : Float

    if (nHoras >= 40 && nHoras < 60){
        result = nHoras * (nValorHora * 1.5f)
    } else if (nHoras >= 60) {
        result = nHoras * (nValorHora *2f)
    } else {
        result = (nHoras * nValorHora).toFloat()
    }
    println("Resultado é $result")
}

fun task20(){
    print("Digite n/Horas: ")
    var nHoras = readln().toInt()
    print("Digite Valor por Hora: ")
    var nValor = readln().toInt()

    var total : Float
    if (40 <= nHoras && nHoras < 60) {
        total = nValor * (nHoras * (1 + 0.5f))
    } else if ( 60 <= nHoras){
        total = nValor * (nHoras * 2f)
    } else {
        total = (nValor * nHoras).toFloat()
    }

    println("salário final $total")
}

fun task23(){
    print("número de lados: ")
    var nLado = readln().toInt()
    print("valor do tamanho: ")
    var vTamanho = readln().toInt()
    var total = 0f

    when (nLado) {
        3 -> total = ((vTamanho*vTamanho) * (1.73/4)).toFloat()
        4 -> total = (vTamanho*vTamanho).toFloat()
        6 -> total = (6*(vTamanho*vTamanho) * (1.73/4)).toFloat()
    }
    println("${total}")
}

fun task25(){
    // Escrever um programa para ler um número inteiro do usuário e exibir o maior
    // número primo que seja menor do que o número digitado.
    print("Digite o número: ")
    var target : Int = readln().toInt()
    var max = 0
    for (num in 1..target){
        var count = 0

        // verificar se é primo (tem que ter apenas dois divisores)
        for (n in 1..num) if (num%n == 0) count++

        if (count == 2 && num > max) {
            max = num
        }
    }
    print("Sendo [$target] o número digitado, o maior número primo menor que ele é [$max]")
}

fun task26(){
    // Fazer um programa para exibir os n primeiros múltiplos simultâneos de dois
    // números dados.

    print("numA: ")
    var numA = readln().toInt()
    print("numB: ")
    var numB = readln().toInt()

    print("multiplicar quantas vezes? ")
    var nMult = readln().toInt()
    println("\n [$numA] | [$numB] Originais ")
    for (i in 1..nMult) println("${numA * i} | ${numB * i}")
}

fun task27(){
    fun RAIZQUADRADA(num: Double) : Float {
        println(Math.sqrt(num))
        return 1f
    }
    RAIZQUADRADA(9.0)
}

fun task28(){
    println("Reverse NUMBER")
    print("Digite o número: ")
    var num = readln()
    var numRev : String = ""
    for (i in num.reversed()){
        numRev += i.toString()
    }
    println("[$numRev]")
}

fun task29(){
    fun Power(base : Double, expoente: Double) : Double {
        return base.pow(expoente)
    }
    print(Power(16.0,1/2.0)) // raiz quadrada
}