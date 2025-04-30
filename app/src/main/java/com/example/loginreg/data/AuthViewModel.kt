package com.example.loginreg.data

import android.content.Context
import android.widget.Toast
import androidx.navigation.NavHostController
import com.example.loginreg.model.User
import com.example.loginreg.navigation.ROUTE_HOME
import com.example.loginreg.navigation.ROUTE_LOGIN
import com.example.loginreg.navigation.ROUTE_REGISTER
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class AuthViewModel (
    var navController: NavHostController,
    var context: Context) {
    var mAuth: FirebaseAuth = FirebaseAuth.getInstance()
    fun signup(
        fname: String, lname: String,
        email: String, pass: String
    ) {
        if (fname.isEmpty() && lname.isEmpty()
            && email.isEmpty() && pass.isEmpty()
        ) {
            Toast.makeText(
                context, "please fill in all details",
                Toast.LENGTH_LONG
            ).show()

        } else {
            mAuth.createUserWithEmailAndPassword(email, pass)
                .addOnCompleteListener {
                    if (it.isSuccessful) {
                        val userdata = User(fname, lname, email, pass, mAuth.currentUser!!.uid)
                        val regRef = FirebaseDatabase.getInstance().getReference()
                            .child("Users/" + mAuth.currentUser)
                        regRef.setValue(userdata)
                            .addOnCompleteListener {
                                if (it.isSuccessful) {
                                    Toast.makeText(
                                        context, "successfuly" + "created an account",
                                        Toast.LENGTH_LONG
                                    ).show()

                                } else {
                                    Toast.makeText(
                                        context, "failed to create an account",
                                        Toast.LENGTH_LONG
                                    ).show()
                                }

                            }
                    } else {
                        navController.navigate(ROUTE_REGISTER)


                    }
                }


        }

    }


fun login(email: String,pass: String){


    mAuth.signInWithEmailAndPassword(email,pass).addOnCompleteListener {

        if (it.isSuccessful){
            Toast.makeText(context,"Succeffully Logged in",Toast.LENGTH_LONG).show()
            navController.navigate(ROUTE_HOME)
//                navController.navigate(ROUTE_REGISTER)TO TAKE YOU TO A DIIFFERNT PAGE
        }else{
            Toast.makeText(context,"${it.exception!!.message}",Toast.LENGTH_LONG).show()
            navController.navigate(ROUTE_LOGIN)
        }
    }

}
    fun logout() {
     mAuth.signOut()
     navController.navigate(ROUTE_LOGIN)
    }
    fun isloggedin(): Boolean{
        return mAuth.currentUser !=null
    }
}