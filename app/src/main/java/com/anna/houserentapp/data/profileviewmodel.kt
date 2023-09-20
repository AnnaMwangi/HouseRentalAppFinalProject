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

class profileviewmodel(var navController: NavHostController, var context: Context) {
   }
