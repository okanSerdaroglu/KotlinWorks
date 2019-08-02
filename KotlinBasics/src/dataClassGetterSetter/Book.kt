package dataClassGetterSetter

class Book(private var id: Int, var name: String?) {


    fun getId(): Int {
        return id
    }

    fun setId(id: Int) {
        if (id < 0) {
            this.id = 1
        } else {
            this.id = id
        }
    }

}

class BookKotlin(id: Int, var name: String, color: Color) {

    var color : Color = Color.BLUE
    init {
        this.color = color
    }
    var id: Int = id
        set(value) {
            field = if (value < 0) {
                1
            } else {
                value
            }
        }


}

