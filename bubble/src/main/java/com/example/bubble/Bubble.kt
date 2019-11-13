package com.example.bubble

import android.view.View
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo


fun View.bounceInAnim() {
    YoYo.with(Techniques.BounceIn)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteBounceInAnim() {
    YoYo.with(Techniques.BounceIn)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.bounceAnim() {
    YoYo.with(Techniques.Bounce)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteBounceAnim() {
    YoYo.with(Techniques.Bounce)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}


fun View.pulseAnim() {
    YoYo.with(Techniques.Pulse)
        .duration(1000)
        .playOn(this)
}

fun View.infinitePulseAnim() {
    YoYo.with(Techniques.Pulse)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.tadaAnim() {
    YoYo.with(Techniques.Tada)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteTadaAnim() {
    YoYo.with(Techniques.Tada)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.zoomInAnim() {
    YoYo.with(Techniques.ZoomIn)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteZoomInAnim() {
    YoYo.with(Techniques.Tada)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.waveAnim() {
    YoYo.with(Techniques.Wave)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteWaveAnim() {
    YoYo.with(Techniques.Wave)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.standUpAnim() {
    YoYo.with(Techniques.StandUp)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteStandUpAnim() {
    YoYo.with(Techniques.StandUp)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.rubberBandAnim() {
    YoYo.with(Techniques.RubberBand)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteRubberBandAnim() {
    YoYo.with(Techniques.RubberBand)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.hingeAnim() {
    YoYo.with(Techniques.Hinge)
        .duration(1000)
        .playOn(this)
}

fun View.hingeAm() {
    YoYo.with(Techniques.Hinge)
        .duration(1000)
        .playOn(this)
}


fun View.infiniteHingeAnim() {
    YoYo.with(Techniques.Hinge)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}