package com.example.smartwatch

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button



class SettingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_setting, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val uploadButton = view.findViewById<Button>(R.id.mainUpload)
        uploadButton.setOnClickListener {
            val intent = Intent(activity, UploadActivity::class.java)
            startActivity(intent)



        }
        val updateButton = view.findViewById<Button>(R.id.mainUpdate)
        updateButton.setOnClickListener {
            val intent = Intent(activity, UpdateActivity::class.java)
            startActivity(intent)
        }
        val deletButton = view.findViewById<Button>(R.id.mainDelete)
        deletButton.setOnClickListener{
            val  intent = Intent(activity, DeletActivity::class.java)
            startActivity(intent)
        }
        val desplayButton = view.findViewById<Button>(R.id.mainDesplay)
        desplayButton.setOnClickListener{
            val  intent = Intent(activity, DesplayActivity::class.java)
            startActivity(intent)
        }
    }
}



