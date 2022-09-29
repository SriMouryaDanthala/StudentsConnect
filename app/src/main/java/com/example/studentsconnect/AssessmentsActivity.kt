package com.example.studentsconnect

<<<<<<< HEAD
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class AssessmentsActivity : AppCompatActivity() {
    var qNumber:Int=1;

=======
//import androidx.test.espresso.base.Default
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley
import com.google.android.material.floatingactionbutton.FloatingActionButton
import org.json.JSONArray
import org.json.JSONObject

//import sun.security.util.IOUtils
import kotlin.collections.ArrayList


class AssessmentsActivity : AppCompatActivity() {

    lateinit var loadingPB: ProgressBar
    lateinit var customRV:RecyclerView
    lateinit var customAdapter:CustomAdapter
    lateinit var questionList: ArrayList<ScienceQuestionsItem>
    var currentQuestion = 0
    var arraofQuestions = ArrayList<ScienceQuestionsItem>()
//    val nextButton:FloatingActionButton = findViewById(R.id.nextB)
>>>>>>> 2161827 (1st commit)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.setTitle("Assessments")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_assessments)
<<<<<<< HEAD
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
=======

        customRV = findViewById(R.id.questionRV)
        customRV.layoutManager = LinearLayoutManager(this)
        loadingPB = findViewById(R.id.idPBLoading)

        questionList = ArrayList()
//        questionList.add(ScienceQuestionsItem(category="",correctAnswer="",difficulty="",id="",incorrectAnswers=ArrayList<String>(),question="quest",regions=ArrayList<Any>(),tags= ArrayList<String>(),type=""))

        customAdapter = CustomAdapter(questionList)

        customRV.adapter=customAdapter
//    Toast.makeText(this, "open", Toast.LENGTH_SHORT).show()

        getData()


    }

    private fun getData() {
        var url = "https://the-trivia-api.com/api/questions?limit=5"

        // on below line we are creating a
        // variable for our request queue
        val queue = Volley.newRequestQueue(this@AssessmentsActivity)

        // on below line we are creating a request
        // variable for making our json object request.
        val request =
            // as we are getting json object response and we are making a get request.
            JsonArrayRequest(Request.Method.GET, url, null, { response ->
                // this method is called when we get successful response from API.
                loadingPB.visibility = View.GONE
                try {
                    for (i in 0 until response.length()) {

                        // on below line we are extracting
                        // data from each json object
                        val respObj = response.getJSONObject(i)

//                        val lngName = respObj.getString("languageName")
//                        val lngImg = respObj.getString("languageImg")
                        val category: String = respObj.getString("category")
                        val correctAnswer: String = respObj.getString("correctAnswer")
                        val difficulty: String = respObj.getString("difficulty")
                        val id: String = respObj.getString("id")
                        val incorrectAnswers: JSONArray = respObj.get("incorrectAnswers") as JSONArray
                        val question: String = respObj.getString("question")
                        val regions: JSONArray= respObj.get("regions") as JSONArray
                        val tags: JSONArray = respObj.get("tags") as JSONArray
                        val type: String = respObj.getString("type")
                        val i = (0..3).shuffled().first()


                        // on below line we are adding data to our list
                        questionList.add(ScienceQuestionsItem(category, correctAnswer, difficulty, id, incorrectAnswers, question, regions, tags, type))

                        // on below line we are notifying
                        // our adapter that data has updated.
                        customAdapter.notifyDataSetChanged()

                    }

                    // on below line we
                    // are handling exception
                } catch (e: Exception) {
                    e.printStackTrace()
                }

            }, { error ->
                // in this case we are simply displaying a toast message.
                Toast.makeText(this@AssessmentsActivity, "Fail to get response", Toast.LENGTH_SHORT)
                    .show()
            })
        // at last we are adding our
        // request to our queue.
        queue.add(request)
    }
}


>>>>>>> 2161827 (1st commit)
