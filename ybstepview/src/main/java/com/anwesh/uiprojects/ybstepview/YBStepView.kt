package com.anwesh.uiprojects.ybstepview

/**
 * Created by anweshmishra on 20/11/18.
 */

import android.app.Activity
import android.view.View
import android.view.MotionEvent
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Color
import android.graphics.RectF
import android.graphics.Path
import android.content.Context

val nodes : Int = 5
val lines : Int = 4
val STROKE_FACTOR : Int = 60
val color : Int = Color.parseColor("#616161")
val BACK_COLOR : Int = Color.parseColor("#BDBDBD")
val SIZE_FACTOR : Int = 3
val scDiv : Double = 0.51
val scGap : Float = 0.05f
