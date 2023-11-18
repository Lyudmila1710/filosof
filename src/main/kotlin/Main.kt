import java.util.*

fun main() {
    print ("Введите количество философов: ")
   var count= readln().toInt()
    while (count <= 0 ){
        println("Неправильный ввод")
        count= readln().toInt()
    }
    val forks =List(count){
        Fork()
    }
    val philosofer = List(count){ id ->
        val left = forks[id]
        val right = forks[(id+1)%count]
        Philosofer(id,left,right)
    }
    philosofer.shuffled().forEach(){
        philosofer ->Thread(philosofer).start()
    }
}