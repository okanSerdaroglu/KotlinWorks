package classes

class User (id: Int, name: String) {

    private var id : Int = 0
    private var name : String = ""
    private var address : String = ""

    init { // init method uses with primary constructor
        this.id = id
        this.name = name
        println("$id $name")
    }

    constructor(id:Int,name: String,address:String) : this(id,name) {
        this.address = address
    }

}

fun main() {

    val okan:User = User(100,"okan")
    val osman:User = User(55,"osman")
    val adem:User = User(12,"adem","adres")

}