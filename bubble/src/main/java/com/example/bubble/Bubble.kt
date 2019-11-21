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

@JvmOverloads
fun View.infiniteBounceInAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.BounceIn)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.bounceAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.Bounce)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteBounceAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.Bounce)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.pulseAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.Pulse)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infinitePulseAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.Pulse)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.tadaAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.Tada)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteTadaAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.Tada)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.zoomInAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.ZoomIn)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteZoomInAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.ZoomIn)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.waveAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.Wave)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteWaveAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.Wave)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.standUpAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.StandUp)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteStandUpAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.StandUp)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.rubberbandAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.RubberBand)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteRubberbandAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.RubberBand)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.hingeAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.Hinge)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteHingeAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.Hinge)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.flashAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.Flash)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteFlashAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.Flash)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.shakeAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.Shake)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteShakeAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.Shake)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.wobbleAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.Wobble)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteWobbleAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.Wobble)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.swingAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.Swing)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteSwingAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.Swing)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.rollInAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.RollIn)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteRollInAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.RollIn)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.rollOutAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.RollOut)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteRollOutAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.RollOut)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.landingAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.Landing)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteLandingAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.Landing)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.takingOffAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.TakingOff)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteTakingOffAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.TakingOff)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.dropoutAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.DropOut)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteDropoutOffAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.DropOut)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.bounceInDownAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.BounceInDown)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteBounceInDownAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.BounceInDown)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.bounceInLeftAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.BounceInLeft)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteBounceInLeftAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.BounceInLeft)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.bounceInRightAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.BounceInRight)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteBounceInRightAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.BounceInRight)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.bounceInUpAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.BounceInUp)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteBounceInUpAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.BounceInUp)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

/*Fade Animations*/

@JvmOverloads
fun View.fadeInAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.FadeIn)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteFadeInAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.FadeIn)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.fadeInUpAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.FadeInUp)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteFadeInUpAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.FadeInUp)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.fadeInDownAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.FadeInDown)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteFadeInDownAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.FadeInDown)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.fadeInLeftAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.FadeInLeft)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteFadeInLeftAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.FadeInLeft)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.fadeInRightAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.FadeInRight)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteFadeInRightAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.FadeInRight)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.fadeOutAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.FadeOut)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteFadeOutAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.FadeOut)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.fadeOutDownAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.FadeOutDown)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteFadeOutDownAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.FadeOutDown)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.fadeOutLeftAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.FadeOutLeft)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteFadeOutLeftAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.FadeOutLeft)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.fadeOutRightAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.FadeOutRight)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteFadeOutRightAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.FadeOutRight)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.fadeOutUpAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.FadeOutUp)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteFadeOutUpAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.FadeOutUp)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

/*Flip Animations*/

@JvmOverloads
fun View.flipInXAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.FlipInX)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteFlipInXAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.FlipInX)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.flipInYAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.FlipInY)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteFlipInYAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.FlipInX)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.flipOutXAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.FlipOutX)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteFlipOutXAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.FlipOutX)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.flipOutYAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.FlipOutY)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteFlipOutYAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.FlipOutY)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.rotateInAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.RotateIn)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteRotateInAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.RotateIn)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.rotateInDownLeftAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.RotateInDownLeft)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteRotateInDownLeftAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.RotateInDownLeft)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.rotateInDownRightAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.RotateInDownRight)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteRotateInDownRightAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.RotateInDownRight)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.rotateInUpLeftAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.RotateInUpLeft)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteRotateInUpLeftAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.RotateInUpLeft)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.rotateInUpRightAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.RotateInUpRight)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteRotateInUpRightAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.RotateInUpRight)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.rotateOutAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.RotateOut)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteRotateOutAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.RotateOut)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.rotateOutDownLeftAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.RotateOutDownLeft)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteRotateOutDownLeftAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.RotateOutDownLeft)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.rotateOutDownRightAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.RotateOutDownRight)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteRotateOutDownRightAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.RotateOutDownRight)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.rotateOutUpLeftAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.RotateOutUpLeft)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteRotateOutUpLefttAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.RotateOutUpLeft)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.rotateOutUpRightAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.RotateOutUpRight)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteRotateOutUpRightAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.RotateOutUpRight)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

/*Slide Animations*/

@JvmOverloads
fun View.slideInLeftAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.SlideInLeft)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteSlideInLeftAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.SlideInLeft)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.slideInRightAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.SlideInRight)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteSlideInRightAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.SlideInRight)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.slideInUpAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.SlideInUp)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteSlideInUpAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.SlideInUp)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.slideInDownAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.SlideInDown)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteSlideInDownAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.SlideInDown)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.slideOutLeftAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.SlideOutLeft)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteSlideOutLeftAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.SlideOutLeft)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.slideOutRightAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.SlideOutRight)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteSlideOutRightAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.SlideOutRight)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.slideOutUpAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.SlideOutUp)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteSlideOutUpAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.SlideOutUp)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.slideOutDownAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.SlideOutDown)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteSlideOutDownAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.SlideOutDown)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

/*Zoom Animations*/

@JvmOverloads
fun View.zoomInDownAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.ZoomInDown)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteZoomInDownAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.ZoomInDown)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.zoomInLeftAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.ZoomInLeft)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteZoomInLeftAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.ZoomInLeft)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.zoomInRightAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.ZoomInRight)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteZoomInRightAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.ZoomInRight)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.zoomInUpAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.ZoomInUp)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteZoomInUpAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.ZoomInUp)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.zoomOutAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.ZoomOut)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteZoomOutAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.ZoomOut)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.zoomOutLeftAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.ZoomOutLeft)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteZoomOutLeftAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.ZoomOutLeft)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.zoomOutRightAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.ZoomOutRight)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteZoomOutRightAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.ZoomOutRight)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.zoomOutUpAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.ZoomOutUp)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteZoomOutUpAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.ZoomOutUp)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}

@JvmOverloads
fun View.zoomOutDownAnim(duration: Long = DEFAULT_DURATION, repeat: Int = 0) {
    YoYo.with(Techniques.ZoomOutDown)
        .duration(duration)
        .repeat(repeat)
        .playOn(this)
}

@JvmOverloads
fun View.infiniteZoomOutDownAnim(duration: Long = DEFAULT_DURATION) {
    YoYo.with(Techniques.ZoomOutDown)
        .repeat(BUBBLE_INFINITE)
        .duration(duration)
        .playOn(this)
}