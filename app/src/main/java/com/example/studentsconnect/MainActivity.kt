package com.example.studentsconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
<<<<<<< HEAD
=======

>>>>>>> 2161827 (1st commit)
    }
    fun openStudyMaterial(v: View){
        val i: Intent = Intent(this,StudyMaterialActivity::class.java)
        this.startActivity(i)
    }
    fun openAssessments(v: View){
        val i: Intent = Intent(this,AssessmentsActivity::class.java)
        this.startActivity(i)
    }

    fun openChatRoom(v: View){
        val i: Intent = Intent(this,ChatRoomActivity::class.java)
        this.startActivity(i)
    }

<<<<<<< HEAD
    fun openPaths(v: View){
        val i: Intent = Intent(this,PathsActivity::class.java)
        this.startActivity(i)
    }
=======
//    fun openPaths(v: View){
//        val i: Intent = Intent(this,PathsActivity::class.java)
//        this.startActivity(i)
//    }
>>>>>>> 2161827 (1st commit)
}