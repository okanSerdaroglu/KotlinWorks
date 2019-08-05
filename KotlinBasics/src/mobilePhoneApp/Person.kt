package mobilePhoneApp

class Person(var name: String, var phone: String) {

    companion object{ /* static */
        fun createPerson(name:String,phone:String): Person {

            return Person(name, phone)

        }

    }

}