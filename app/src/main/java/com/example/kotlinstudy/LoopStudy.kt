package com.example.kotlinstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class LoopStudy : AppCompatActivity() {

    var namesList:ArrayList<String> = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        namesList.add("Name 1")
        namesList.add("Name 2")
        namesList.add("Name 3")
        namesList.add("Name 4")
        namesList.add("Name 5")
        namesList.add("Name 6")
        namesList.add("Name 7")


        Log.d("Name current iteration","All names list using in");
        for(name in namesList){
            Log.d("Name current iteration",name);
        }

        Log.d("Name current iteration","using 0 to listsize");
        for(i in 0..namesList.size-1){
            Log.d("Name current iteration",namesList.get(i))
        }

        Log.d("Name current iteration","forward step 2");
        for(i in 0..namesList.size-1 step 2){
            Log.d("Name current iteration",namesList.get(i))
        }

        Log.d("Name current iteration","backward step 2");
        for(i in namesList.size-1 downTo 0 step 2){
            Log.d("Name current iteration",namesList.get(i))
        }



    }
}
