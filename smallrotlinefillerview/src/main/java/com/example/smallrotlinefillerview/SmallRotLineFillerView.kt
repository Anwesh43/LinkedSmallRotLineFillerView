package com.example.smallrotlinefillerview

import android.view.View
import android.view.MotionEvent
import android.app.Activity
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF

val colors : Array<Int> = arrayOf(
    "#F44336",
    "#2196F3",
    "#009688",
    "#3F51B5",
    "#795548"
).map {
    Color.parseColor(it)
}.toTypedArray()
val parts : Int = 3
val lines : Int = 4
val scGap : Float = 0.02f / parts
val strokeFactor : Float = 90f
val sizeFactor : Float = 3.9f
val delay : Long = 20
val backColor : Int = Color.parseColor("#BDBDBD")
