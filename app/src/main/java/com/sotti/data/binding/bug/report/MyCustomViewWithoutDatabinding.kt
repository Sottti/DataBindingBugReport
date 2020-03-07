package com.sotti.data.binding.bug.report

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MyCustomViewWithoutDatabinding @JvmOverloads constructor(
	context: Context,
	attrs: AttributeSet? = null,
	defStyleAttr: Int = 0,
	defStyleRes: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr, defStyleRes) {

	init {
		LayoutInflater.from(context).inflate(R.layout.my_layout, this)
		clipChildren = false
		findViewById<TextView>(R.id.text).text = "This preview works"
	}

}