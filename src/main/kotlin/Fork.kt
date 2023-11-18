class Fork {var status = Forks.free
    var taken: Int? = null
    @Synchronized
    fun take(id: Int): Boolean{
        if (status ==Forks.free){
            status= Forks.taken
            taken= id
            return true
        }
        return false
    }
    @Synchronized
    fun put(id:Int){
        if(status == Forks.taken && taken ==  id){
            status = Forks.free
            taken=null
        }
    }
}