data class Philosofer(   val id: Int, val left:Fork, val right: Fork): Runnable {
    override fun run(){
        while(true){
            if (left.take(id) && right.take(id)){
                println("Философ $id кушает ")
                left.put(id)
                right.put(id)
                break
            }
            else{
                left.put(id)
                right.put(id)
                println("Философ $id раздумывает")
            }
        }
    }

}