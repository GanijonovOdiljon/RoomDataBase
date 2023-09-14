package com.example.roomdatabase.util

import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import org.w3c.dom.Text

fun Fragment.snackbar(text: String){
    Snackbar.make(requireView(),text,Snackbar.LENGTH_SHORT).show()
}