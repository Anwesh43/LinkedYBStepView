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

fun Int.getInverse() : Float = 1f / this

fun Float.divideScale(i : Int, n : Int) : Float = Math.min(n.getInverse(), Math.max(0f, this - i * n.getInverse())) * n

fun Float.getScaleFactor() : Float = Math.floor(this / scDiv).toFloat()

fun Float.mirrorValue(a : Int, b : Int) : Float = (1 - getScaleFactor()) * a.getInverse() + getScaleFactor() * b.getInverse()

fun Float.updateScale(dir : Float, a : Int, b : Int) : Float = scGap * dir * mirrorValue(a, b)

class YBStepView(ctx : Context) : View(ctx) {

    private val paint : Paint = Paint(Paint.ANTI_ALIAS_FLAG)

    override fun onDraw(canvas : Canvas) {

    }

    override fun onTouchEvent(event : MotionEvent) : Boolean {
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {

            }
        }
        return true
    }
}