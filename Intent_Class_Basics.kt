//Inttent class 
//***** Demonstrates the intent of an Activity instance from  your app ******* 
//**** Intent classes allow for switching between data and layouts. *****
//*** Switching between MainActivity and a SecondaryActivity: ***********

  * We start by declaring a new Intent object, then initializing it. 

  val myIntent = Intent(this, SettingsActivity::class.java) // delcaring and initializing. 

startActivity(myIntent) // this call switches activities. 

// ********* Setting activity in this example is our secondary activity. *******

************************************************************************************

 //*******PASSING DATA BETWEEN ACTIVITIES.******************

  * Adding data to an Intent instance 

    Val username ="mark"  // create a string. 

    val myIntent = Intent(this, SettingsActivity::class.java)  // creating the intent. 

    val myIntent = Intent() // declare an intent in the secondary activity. 

  val username = intent.extras.getString("USER_NAME") // Initializing the intent and passing through the new string. 














