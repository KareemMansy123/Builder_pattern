package q.contact.builderpattern_1.example2

class UserInfo(builder : UserBuilder) {
     var user_name : String = builder.user_name
    private var user_email : String = builder.user_name
    private var user_phone : String = builder.user_name
    private var user_address : String = builder.user_name
}