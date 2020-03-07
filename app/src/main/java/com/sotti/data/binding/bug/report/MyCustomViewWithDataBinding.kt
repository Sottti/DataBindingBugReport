package com.sotti.data.binding.bug.report

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.sotti.data.binding.bug.report.databinding.MyDataBindingLayoutBinding

class MyCustomViewWithDataBinding @JvmOverloads constructor(
	context: Context,
	attrs: AttributeSet? = null,
	defStyleAttr: Int = 0,
	defStyleRes: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr, defStyleRes) {

	/*The preview on this class (the new righ panel) doesn't show anything*/
	private val viewBinding = MyDataBindingLayoutBinding
		.inflate(LayoutInflater.from(context), this, true)

	init {
		clipChildren = false
		viewBinding.model = MyText("This preview doesn't work")
	}

}