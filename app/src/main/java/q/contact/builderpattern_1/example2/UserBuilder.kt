package q.contact.builderpattern_1.example2

class UserBuilder(user_name:String) {
     var user_name : String = user_name // mandatory

    //optional info
     var user_email : String = ""
     var user_phone : String = ""
     var user_address : String = ""

    fun setEmail(email : String) :UserBuilder {
        this.user_email = email
        return this
    }

    fun setPhone(phone : String) :UserBuilder{
        this.user_phone = phone
        return this
    }

    fun setAddress(address : String) : UserBuilder{
        this.user_address = address
        return this
    }

    fun create() : UserInfo {
        return UserInfo(this)
    }
}