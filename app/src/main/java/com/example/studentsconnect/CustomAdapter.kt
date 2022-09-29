package com.example.studentsconnect

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


class CustomAdapter(private val dataSet: ArrayList<ScienceQuestionsItem>) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        lateinit var questionName: TextView
        lateinit var option1:RadioButton
        lateinit var option2:RadioButton
        lateinit var option3:RadioButton
        lateinit var option4:RadioButton

        // lateinit var statusOfUser :TextView

        init {
            // Define click listener for the ViewHolder's View.
            questionName =view.findViewById(R.id.sampleQuestionView)
            option1 = view.findViewById(R.id.option1)
            option2 = view.findViewById(R.id.option2)
            option3 = view.findViewById(R.id.option3)
            option4 = view.findViewById(R.id.option4)


            // statusOfUser = view.findViewById(R.id.statusOfUser)
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.question_layout, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element

        val questionData =  dataSet[position]
        viewHolder.questionName.setText(questionData.question)
        val answersAll =ArrayList<String>()
        for(i in 0..2)
            answersAll.add(questionData.incorrectAnswers[i].toString())
        val i = (0..2).shuffled().first()
        answersAll.add(i,questionData.correctAnswer)

        viewHolder.option1.setText(answersAll[0])
        viewHolder.option2.setText(answersAll[1])
        viewHolder.option3.setText(answersAll[2])
        viewHolder.option4.setText(answersAll[3])
        // viewHolder.statusOfUser.setText(userData.userStatus.toString())

    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size

}