package mobilePhoneApp

import java.util.*

private val scan = Scanner(System.`in`)
private val mobilePhone: MobilePhone = MobilePhone("555-55-5-55")

fun main() {

    startMobilePhone()
    showMenu()

    val exit = false
    while (!exit) {

        println("SELECTION : (press 6 for menu)")
        when (scan.nextInt()) {
            0 -> {
                println("Closing ...")
            }

            1 -> {
                mobilePhone.listAllPeople()
            }

            2 -> {
                addNewPersonFunction()
            }

            3 -> {
                searchPersonMethod()
            }

            4 -> {
                deletePersonMethod()
            }

            5 -> {
                updatePersonMethod()
            }

            6 -> {
                showMenu()
            }

            else -> println("wrong choose")

        }

    }

}

fun updatePersonMethod() {

    println("Enter person name")
    val name = scan.next()

    val person = mobilePhone.findPersonAndReturn(name)

    if (person == null){
        println("no person found")
        return
    }

    println("Enter new person name")
    val newName = scan.next()

    println("Enter new number")
    val newPhoneNumber = scan.next()

    mobilePhone.updatePerson(person, Person.createPerson(newName,newPhoneNumber))




}

fun addNewPersonFunction() {
    println("Enter new person")
    val name = scan.next()

    println("Enter new person phone number")
    val phoneNumber = scan.next()

    mobilePhone.addPersonInGuide(Person.createPerson(name, phoneNumber))

}

fun showMenu() {

    println("************ Menu **************")
    println(
        "0 -- Exit \n" + "1 -- List all people \n"
                + "2 -- Ad new person \n"
                + "3 -- Search person\n"
                + "4 -- Remove Person\n"
                + "5 -- Update Person\n"
                + "6 -- Show Menu\n"
    )

}

fun searchPersonMethod () {

    println("enter name for search")
    val name = scan.next()
    val person = mobilePhone.searchPerson(name)

    if (person == null){
        println("no person found in guide")
        return
    } else {
        println("Found person ${person.name} ---- ${person.phone}")
    }

}

fun deletePersonMethod() {
    println("Enter person name for delete")
    val name = scan.next()
    val person = mobilePhone.findPerson(name)

    if (mobilePhone.deletePerson(person)){
        println("person deleted")
    } else {
        println("can not delete")
    }

}

fun startMobilePhone() {

    println("Mobile phone is opening...")
}
