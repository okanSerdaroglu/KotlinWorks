package mobilePhoneApp


class MobilePhone(val myPhoneNumber: String) {

    private val guide: ArrayList<Person> = ArrayList()

    fun addPersonInGuide(newPerson: Person): Boolean {

        if (findPerson(newPerson.name) >= 0) {
            println("${newPerson.name} is in guide")
            return false
        }
        this.guide.add(newPerson)
        println("new person added")
        return true

    }

    fun findPerson(searchingPerson: Person): Int { /* returns index of person */

        return this.guide.indexOf(searchingPerson)  /* index of returns -1 if does not contains person */

    }

    fun findPerson(name: String): Int {

        for (i in 0 until guide.size) {
            val person = guide[i]
            if (person.name == name) {
                return i
            }
        }

        return -1

    }

    fun findPersonAndReturn(name:String):Person? { /* this method can return null */

        for (i in 0 until guide.size) {
            val person = guide [i]
            if (person.name == name){
                return guide[i]
            }
        }
        return null
    }

    fun listAllPeople() {

        println("***** Guide *****")

        if (guide.size == 0) {
            println("there is no person in guide")
            return
        }

        for (person in guide) {
            println("${person.name} ---- ${person.phone}")
        }
    }

    fun searchPerson(name: String): Person? { /* person can be null so we used ? operator */

        val position = findPerson(name)

        return if (position >= 0) {
            guide[position]
        } else {
            null
        }

    }

    fun deletePerson(index:Int):Boolean{


        return if (index < 0) {
            println("no person found")
            false
        } else {
            guide.removeAt(index)
            true
        }

    }

    fun updatePerson (oldPerson: Person,newPerson: Person):Boolean {

        val position = findPerson(oldPerson)
        if (position < 0){
            println("no person found")
            return false
        }

        guide[position] = newPerson
        println("old person ${oldPerson.name} updated with ${newPerson.name}")
        return true

    }

}