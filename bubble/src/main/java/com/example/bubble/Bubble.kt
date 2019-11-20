package com.example.bubble

import android.view.View
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo

const val BUBBLE_INFINITE = -1
const val DEFAULT_DURATION: Long = 1000

@JvmOverloads
fun View.bounceInAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.BounceIn)
        .duration(duration)
        .repeat(repeat)
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
    YoYo.with(Techniques.ZoomIn)
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

fun View.rubberbandAnim() {
    YoYo.with(Techniques.RubberBand)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteRubberbandAnim() {
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

fun View.infiniteHingeAnim() {
    YoYo.with(Techniques.Hinge)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.flashAnim() {
    YoYo.with(Techniques.Flash)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteFlashAnim() {
    YoYo.with(Techniques.Flash)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.shakeAnim() {
    YoYo.with(Techniques.Shake)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteShakeAnim() {
    YoYo.with(Techniques.Shake)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.wobbleAnim() {
    YoYo.with(Techniques.Wobble)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteWobbleAnim() {
    YoYo.with(Techniques.Wobble)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.swingAnim() {
    YoYo.with(Techniques.Swing)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteSwingAnim() {
    YoYo.with(Techniques.Swing)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.rollInAnim() {
    YoYo.with(Techniques.RollIn)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteRollInAnim() {
    YoYo.with(Techniques.RollIn)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.rollOutAnim() {
    YoYo.with(Techniques.RollOut)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteRollOutAnim() {
    YoYo.with(Techniques.RollOut)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.landingAnim() {
    YoYo.with(Techniques.Landing)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteLandingAnim() {
    YoYo.with(Techniques.Landing)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.takingOffAnim() {
    YoYo.with(Techniques.TakingOff)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteTakingOffAnim() {
    YoYo.with(Techniques.TakingOff)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.dropoutAnim() {
    YoYo.with(Techniques.DropOut)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteDropoutOffAnim() {
    YoYo.with(Techniques.DropOut)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.bounceInDownAnim() {
    YoYo.with(Techniques.BounceInDown)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteBounceInDownAnim() {
    YoYo.with(Techniques.BounceInDown)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.bounceInLeftAnim() {
    YoYo.with(Techniques.BounceInLeft)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteBounceInLeftAnim() {
    YoYo.with(Techniques.BounceInLeft)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.bounceInRightAnim() {
    YoYo.with(Techniques.BounceInRight)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteBounceInRightAnim() {
    YoYo.with(Techniques.BounceInRight)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.bounceInUpAnim() {
    YoYo.with(Techniques.BounceInUp)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteBounceInUpAnim() {
    YoYo.with(Techniques.BounceInUp)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

/*Fade Animations*/

fun View.fadeInAnim() {
    YoYo.with(Techniques.FadeIn)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteFadeInAnim() {
    YoYo.with(Techniques.FadeIn)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.fadeInUpAnim() {
    YoYo.with(Techniques.FadeInUp)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteFadeInUpAnim() {
    YoYo.with(Techniques.FadeInUp)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.fadeInDownAnim() {
    YoYo.with(Techniques.FadeInDown)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteFadeInDownAnim() {
    YoYo.with(Techniques.FadeInDown)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.fadeInLeftAnim() {
    YoYo.with(Techniques.FadeInLeft)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteFadeInLeftAnim() {
    YoYo.with(Techniques.FadeInLeft)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.fadeInRightAnim() {
    YoYo.with(Techniques.FadeInRight)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteFadeInRightAnim() {
    YoYo.with(Techniques.FadeInRight)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.fadeOutAnim() {
    YoYo.with(Techniques.FadeOut)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteFadeOutAnim() {
    YoYo.with(Techniques.FadeOut)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.fadeOutDownAnim() {
    YoYo.with(Techniques.FadeOutDown)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteFadeOutDownAnim() {
    YoYo.with(Techniques.FadeOutDown)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.fadeOutLeftAnim() {
    YoYo.with(Techniques.FadeOutLeft)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteFadeOutLeftAnim() {
    YoYo.with(Techniques.FadeOutLeft)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.fadeOutRightAnim() {
    YoYo.with(Techniques.FadeOutRight)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteFadeOutRightAnim() {
    YoYo.with(Techniques.FadeOutRight)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.fadeOutUpAnim() {
    YoYo.with(Techniques.FadeOutUp)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteFadeOutUpAnim() {
    YoYo.with(Techniques.FadeOutUp)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

/*Flip Animations*/

fun View.flipInXAnim() {
    YoYo.with(Techniques.FlipInX)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteFlipInXAnim() {
    YoYo.with(Techniques.FlipInX)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.flipInYAnim() {
    YoYo.with(Techniques.FlipInY)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteFlipInYAnim() {
    YoYo.with(Techniques.FlipInX)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.flipOutXAnim() {
    YoYo.with(Techniques.FlipOutX)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteFlipOutXAnim() {
    YoYo.with(Techniques.FlipOutX)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.flipOutYAnim() {
    YoYo.with(Techniques.FlipOutY)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteFlipOutYAnim() {
    YoYo.with(Techniques.FlipOutY)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.rotateInAnim() {
    YoYo.with(Techniques.RotateIn)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteRotateInAnim() {
    YoYo.with(Techniques.RotateIn)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.rotateInDownLeftAnim() {
    YoYo.with(Techniques.RotateInDownLeft)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteRotateInDownLeftAnim() {
    YoYo.with(Techniques.RotateInDownLeft)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.rotateInDownRightAnim() {
    YoYo.with(Techniques.RotateInDownRight)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteRotateInDownRightAnim() {
    YoYo.with(Techniques.RotateInDownRight)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.rotateInUpLeftAnim() {
    YoYo.with(Techniques.RotateInUpLeft)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteRotateInUpLeftAnim() {
    YoYo.with(Techniques.RotateInUpLeft)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.rotateInUpRightAnim() {
    YoYo.with(Techniques.RotateInUpRight)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteRotateInUpRightAnim() {
    YoYo.with(Techniques.RotateInUpRight)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.rotateOutAnim() {
    YoYo.with(Techniques.RotateOut)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteRotateOutAnim() {
    YoYo.with(Techniques.RotateOut)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.rotateOutDownLeftAnim() {
    YoYo.with(Techniques.RotateOutDownLeft)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteRotateOutDownLeftAnim() {
    YoYo.with(Techniques.RotateOutDownLeft)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.rotateOutDownRightAnim() {
    YoYo.with(Techniques.RotateOutDownRight)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteRotateOutDownRightAnim() {
    YoYo.with(Techniques.RotateOutDownRight)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.rotateOutUpLeftAnim() {
    YoYo.with(Techniques.RotateOutUpLeft)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteRotateOutUpLefttAnim() {
    YoYo.with(Techniques.RotateOutUpLeft)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.rotateOutUpRightAnim() {
    YoYo.with(Techniques.RotateOutUpRight)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteRotateOutUpRightAnim() {
    YoYo.with(Techniques.RotateOutUpRight)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

/*Slide Animations*/

fun View.slideInLeftAnim() {
    YoYo.with(Techniques.SlideInLeft)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteSlideInLeftAnim() {
    YoYo.with(Techniques.SlideInLeft)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.slideInRightAnim() {
    YoYo.with(Techniques.SlideInRight)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteSlideInRightAnim() {
    YoYo.with(Techniques.SlideInRight)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.slideInUpAnim() {
    YoYo.with(Techniques.SlideInUp)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteSlideInUpAnim() {
    YoYo.with(Techniques.SlideInUp)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.slideInDownAnim() {
    YoYo.with(Techniques.SlideInDown)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteSlideInDownAnim() {
    YoYo.with(Techniques.SlideInDown)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.slideOutLeftAnim() {
    YoYo.with(Techniques.SlideOutLeft)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteSlideOutLeftAnim() {
    YoYo.with(Techniques.SlideOutLeft)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.slideOutRightAnim() {
    YoYo.with(Techniques.SlideOutRight)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteSlideOutRightAnim() {
    YoYo.with(Techniques.SlideOutRight)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.slideOutUpAnim() {
    YoYo.with(Techniques.SlideOutUp)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteSlideOutUpAnim() {
    YoYo.with(Techniques.SlideOutUp)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.slideOutDownAnim() {
    YoYo.with(Techniques.SlideOutDown)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteSlideOutDownAnim() {
    YoYo.with(Techniques.SlideOutDown)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

/*Zoom Animations*/

fun View.zoomInDownAnim() {
    YoYo.with(Techniques.ZoomInDown)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteZoomInDownAnim() {
    YoYo.with(Techniques.ZoomInDown)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.zoomInLeftAnim() {
    YoYo.with(Techniques.ZoomInLeft)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteZoomInLeftAnim() {
    YoYo.with(Techniques.ZoomInLeft)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.zoomInRightAnim() {
    YoYo.with(Techniques.ZoomInRight)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteZoomInRightAnim() {
    YoYo.with(Techniques.ZoomInRight)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.zoomInUpAnim() {
    YoYo.with(Techniques.ZoomInUp)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteZoomInUpAnim() {
    YoYo.with(Techniques.ZoomInUp)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.zoomOutAnim() {
    YoYo.with(Techniques.ZoomOut)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteZoomOutAnim() {
    YoYo.with(Techniques.ZoomOut)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.zoomOutLeftAnim() {
    YoYo.with(Techniques.ZoomOutLeft)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteZoomOutLeftAnim() {
    YoYo.with(Techniques.ZoomOutLeft)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.zoomOutRightAnim() {
    YoYo.with(Techniques.ZoomOutRight)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteZoomOutRightAnim() {
    YoYo.with(Techniques.ZoomOutRight)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.zoomOutUpAnim() {
    YoYo.with(Techniques.ZoomOutUp)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteZoomOutUpAnim() {
    YoYo.with(Techniques.ZoomOutUp)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}

fun View.zoomOutDownAnim() {
    YoYo.with(Techniques.ZoomOutDown)
        .duration(1000)
        .playOn(this)
}

fun View.infiniteZoomOutDownAnim() {
    YoYo.with(Techniques.ZoomOutDown)
        .repeat(YoYo.INFINITE)
        .duration(1000)
        .playOn(this)
}