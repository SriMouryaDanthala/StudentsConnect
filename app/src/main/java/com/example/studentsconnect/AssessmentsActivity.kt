package com.example.studentsconnect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class AssessmentsActivity : AppCompatActivity() {
    var qNumber:Int=1;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.setTitle("Assessments")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_assessments)
        var x: TextView = findViewById(R.id.questionView)
        x.setText("Question $qNumber")
    }
    fun changeQuestion(v: View){
        var v: TextView = findViewById(R.id.questionView)
        if(qNumber<10){
            qNumber++;
            v.setText("Question $qNumber");
        }
        else{
            qNumber=1;
            v.setText("Question $qNumber")
        }
    }
}