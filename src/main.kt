import java.lang.Exception

class main {

   fun  main(): Unit {
      var user: UserModel = null!!
      try {
         user = UserModel("daniela", "ne-ti-kazuvam", "daniela@janushevska.com")
         println("The user succesfully initialized")
      }
      catch(ex: Exception) {
         println("User initialization went wrong")
      }
      finally {
         println("Username: ${user?.username}")
         println("Program finished")
      }
   }
}