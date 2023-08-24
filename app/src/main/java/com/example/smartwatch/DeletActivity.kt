package com.example.smartwatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.smartwatch.databinding.ActivityDeletBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class DeletActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDeletBinding
    private lateinit var databaseReference: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDeletBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.deleteButton.setOnClickListener {
            val phone = binding.deletePhone.text.toString()
            if (phone.isNotEmpty())
                deleteData(phone)
            else
                Toast.makeText(this, "Please enter the phone number", Toast.LENGTH_SHORT).show()
        }
    }

    private fun deleteData(phone: String) {
        databaseReference = FirebaseDatabase.getInstance().getReference("Phone Directory")
        databaseReference.child(phone).removeValue().addOnSuccessListener {
            binding.deletePhone.text.clear()
            Toast.makeText(this, "Deleted", Toast.LENGTH_SHORT).show()
        }.addOnFailureListener {
            Toast.makeText(this, "Unable to delete", Toast.LENGTH_SHORT).show()
        }
    }
}