import java.util.*
import domain.*

/*Realizado com base em outro programa na linguagem irmã*/

fun main() {

    val sc = Scanner(System.`in`)
    val fila = Fila()

    do{
        mostraMenu()

        var opcao = sc.nextInt()

        when(opcao){
            1 -> {
                println("Digite um número:")
                var numero = sc.nextDouble()
                fila.add(numero)
            }
            2 -> {
                println(fila.toString())
            }
            3 -> {
                fila.remove()
            }
            4 -> {
                println("Obrigado por sua interação comigo, até logo e abraços!\n")
                break
            }
            else -> {
                println("Opção inválida")
            }
        }
    } while (true)
}

fun mostraMenu(){
    println("Bem-vindo(a) ao nosso programa de fila (estrutura FIFO)!\n")
    println("De tal modo, escolha uma opção.\n")
    println("   1 - Inserir elemento    \n")
    println("   2 - Mostrar fila        \n")
    println("   3 - Remover elemento    \n")
    println("   4 - Encerrar programa   \n")
}