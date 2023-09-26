package com.anna.houserentapp.data

import android.app.ProgressDialog
import android.content.Context
import android.provider.ContactsContract
import android.widget.Toast
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.navigation.NavHostController
import com.anna.houserentapp.models.Profile
import com.anna.houserentapp.navigation.ROUTE_LOGIN
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class profileviewmodel(var navController: NavHostController,var context:Context) {
   var authRepository: AuthViewModel
   var progress: ProgressDialog


   init {
      authRepository = AuthViewModel(navController, context)
      if (!authRepository.isloggedin()) {
         navController.navigate(ROUTE_LOGIN)
      }
      progress = ProgressDialog(context)
      progress.setTitle("Loading")
      progress.setMessage("Please wait...")
   }


   fun saveProfile(profileName: String, profilehousenumber: String, profilecontact: String) {
      var id = System.currentTimeMillis().toString()
      var profileData = Profile(profileName, profilehousenumber, profilecontact, id)
      var profileRef = FirebaseDatabase.getInstance().getReference()
         .child("Profile/$id")
      progress.show()
      profileRef.setValue(profileData).addOnCompleteListener {
         progress.dismiss()
         if (it.isSuccessful) {
            Toast.makeText(context, "Saving successful", Toast.LENGTH_SHORT).show()
         } else {
            Toast.makeText(context, "ERROR: ${it.exception!!.message}", Toast.LENGTH_SHORT)
               .show()
         }
      }
   }

   fun viewProfiles(
      profile: MutableState<Profile>,
      profiles: SnapshotStateList<Profile>
   ): SnapshotStateList<Profile> {
      var ref = FirebaseDatabase.getInstance().getReference().child("Profile")

      progress.show()
      ref.addValueEventListener(object : ValueEventListener {
         override fun onDataChange(snapshot: DataSnapshot) {
            progress.dismiss()
            profiles.clear()
            for (snap in snapshot.children) {
               val value = snap.getValue(Profile::class.java)
               profile.value = value!!
               profiles.add(value)
            }
         }

         override fun onCancelled(error: DatabaseError) {
            Toast.makeText(context, error.message, Toast.LENGTH_SHORT).show()
         }
      })
      return profiles
   }

   fun deleteProfile(id: String) {
      var delRef = FirebaseDatabase.getInstance().getReference()
         .child("Profiles/$id")
      progress.show()
      delRef.removeValue().addOnCompleteListener {
         progress.dismiss()
         if (it.isSuccessful) {
            Toast.makeText(context, "Profile deleted", Toast.LENGTH_SHORT).show()
         } else {
            Toast.makeText(context, it.exception!!.message, Toast.LENGTH_SHORT).show()
         }
      }
   }

   fun updateProfile(name: String, housenumber: String, contact: String, id: String) {
      var updateRef = FirebaseDatabase.getInstance().getReference()
         .child("Profiles/$id")
      progress.show()
      var updateData = Profile(name, housenumber, contact, id)
      updateRef.setValue(updateData).addOnCompleteListener {
         progress.dismiss()
         if (it.isSuccessful) {
            Toast.makeText(context, "Update successful", Toast.LENGTH_SHORT).show()
         } else {
            Toast.makeText(context, it.exception!!.message, Toast.LENGTH_SHORT).show()
         }
      }
   }
}