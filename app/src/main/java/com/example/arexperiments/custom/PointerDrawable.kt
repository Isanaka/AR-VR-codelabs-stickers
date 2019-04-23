package com.example.arexperiments.custom

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.ColorFilter
import android.graphics.Paint
import android.graphics.drawable.Drawable


class PointerDrawable: Drawable() {
    val paint = Paint()
    var enabled: Boolean = false

    override fun draw(canvas: Canvas) {
        val cx = canvas.width / 2
        val cy = canvas.height / 2
        if (enabled) {
            paint.color = Color.GREEN
            canvas.drawCircle(cx.toFloat(), cy.toFloat(), 10.0f, paint)
        } else {
            paint.color = Color.GRAY
            canvas.drawText("X", cx.toFloat(), cy.toFloat(), paint)
        }
    }

    override fun setAlpha(alpha: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getOpacity(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setColorFilter(colorFilter: ColorFilter?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}