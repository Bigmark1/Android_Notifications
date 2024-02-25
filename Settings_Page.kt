
// enabling useers to switch to the settings screen. // 
// use onOptionsItemSelected function. 

return when(item.itemId){
  R.id.action_settings -> true
  else -> super.onOptionsItemSelected. //this is a block code in the onOptionsItemSelected function 

}
//using intent to transfer the layouts

return(item.itemId) {
  R.id.action_settings -> {
      val intent = Intent(this, SettingsActivity::class.java) 

      startActivity(intent)
      true
  } 
  else -> super.onOptionsItemSelected(item)
} 
//Persisting data with SharedPreferences. This allows the settings the user sets still established 
// even after quiting the app. 
****************************************************

  // PERSISTING DATA
// Use the SharedPreference class. This calss provides access to data that can be accessed and edited 
  //by all the classes of an app. 

  val prefs = getSharedPreferences (
    "My app", Context.MODE_PRIVATE) 
    ) //This is a shared instance for reading data. 

    //SharedPreferences.Editor instance for writing data. 
    val editor = prefs.edit()

//    prefs object is initialized by using the getSharedPreference function and passing in a String.
// MODE_PRIVATE means any class can access it, but only from within the app. 

// prefs object is used to initialize the editor object by calling the edit function. 
  editor.putString("username", username) 

    //First argument puts is a label that can be used to refer to data later. 
    //2) the second line initiates the save process. 

    editor.putStirng("username", username)
    editor.putInt("age", age)
    editor.putBoolean("newsletter-subscriber", subscribed) 
    //saves the entered items. 
    editor.apply() 

    // Releading sheared data with sharedpreferences. 
    val username = prefs.getStirng("username", "new user") 

    val age = prefs.getInt("age", -1) 

    val subscribed = prefs.getBoolean(
      "newsletter-subscribber", false) 









