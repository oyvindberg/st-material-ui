package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.Partial
import com.olvind.mui.muiMaterial.anon.PartialDuration
import com.olvind.mui.muiMaterial.anon.PartialEasing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesCreateTransitionsMod {
  
  @JSImport("@mui/material/styles/createTransitions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(props: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(props.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def create(props: String, options: Partial): String = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(props.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def create(props: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(props.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def create(props: js.Array[String], options: Partial): String = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(props.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@mui/material/styles/createTransitions", "duration")
  @js.native
  val duration: Duration_ = js.native
  
  @JSImport("@mui/material/styles/createTransitions", "easing")
  @js.native
  val easing: Easing_ = js.native
  
  inline def getAutoHeightDuration(height: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutoHeightDuration")(height.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  trait Duration_ extends StObject {
    
    var complex: Double
    
    var enteringScreen: Double
    
    var leavingScreen: Double
    
    var short: Double
    
    var shorter: Double
    
    var shortest: Double
    
    var standard: Double
  }
  object Duration_ {
    
    inline def apply(
      complex: Double,
      enteringScreen: Double,
      leavingScreen: Double,
      short: Double,
      shorter: Double,
      shortest: Double,
      standard: Double
    ): Duration_ = {
      val __obj = js.Dynamic.literal(complex = complex.asInstanceOf[js.Any], enteringScreen = enteringScreen.asInstanceOf[js.Any], leavingScreen = leavingScreen.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any], shorter = shorter.asInstanceOf[js.Any], shortest = shortest.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
      __obj.asInstanceOf[Duration_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Duration_] (val x: Self) extends AnyVal {
      
      inline def setComplex(value: Double): Self = StObject.set(x, "complex", value.asInstanceOf[js.Any])
      
      inline def setEnteringScreen(value: Double): Self = StObject.set(x, "enteringScreen", value.asInstanceOf[js.Any])
      
      inline def setLeavingScreen(value: Double): Self = StObject.set(x, "leavingScreen", value.asInstanceOf[js.Any])
      
      inline def setShort(value: Double): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
      
      inline def setShorter(value: Double): Self = StObject.set(x, "shorter", value.asInstanceOf[js.Any])
      
      inline def setShortest(value: Double): Self = StObject.set(x, "shortest", value.asInstanceOf[js.Any])
      
      inline def setStandard(value: Double): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    }
  }
  
  trait Easing_ extends StObject {
    
    var easeIn: String
    
    var easeInOut: String
    
    var easeOut: String
    
    var sharp: String
  }
  object Easing_ {
    
    inline def apply(easeIn: String, easeInOut: String, easeOut: String, sharp: String): Easing_ = {
      val __obj = js.Dynamic.literal(easeIn = easeIn.asInstanceOf[js.Any], easeInOut = easeInOut.asInstanceOf[js.Any], easeOut = easeOut.asInstanceOf[js.Any], sharp = sharp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Easing_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Easing_] (val x: Self) extends AnyVal {
      
      inline def setEaseIn(value: String): Self = StObject.set(x, "easeIn", value.asInstanceOf[js.Any])
      
      inline def setEaseInOut(value: String): Self = StObject.set(x, "easeInOut", value.asInstanceOf[js.Any])
      
      inline def setEaseOut(value: String): Self = StObject.set(x, "easeOut", value.asInstanceOf[js.Any])
      
      inline def setSharp(value: String): Self = StObject.set(x, "sharp", value.asInstanceOf[js.Any])
    }
  }
  
  trait Transitions extends StObject {
    
    var create: js.Function2[/* props */ String | js.Array[String], /* options */ js.UndefOr[Partial], String]
    
    var duration: Duration_
    
    var easing: Easing_
    
    var getAutoHeightDuration: js.Function1[/* height */ Double, Double]
  }
  object Transitions {
    
    inline def apply(
      create: (/* props */ String | js.Array[String], /* options */ js.UndefOr[Partial]) => String,
      duration: Duration_,
      easing: Easing_,
      getAutoHeightDuration: /* height */ Double => Double
    ): Transitions = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], getAutoHeightDuration = js.Any.fromFunction1(getAutoHeightDuration))
      __obj.asInstanceOf[Transitions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Transitions] (val x: Self) extends AnyVal {
      
      inline def setCreate(value: (/* props */ String | js.Array[String], /* options */ js.UndefOr[Partial]) => String): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
      
      inline def setDuration(value: Duration_): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEasing(value: Easing_): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setGetAutoHeightDuration(value: /* height */ Double => Double): Self = StObject.set(x, "getAutoHeightDuration", js.Any.fromFunction1(value))
    }
  }
  
  trait TransitionsOptions extends StObject {
    
    var create: js.UndefOr[
        js.Function2[/* props */ String | js.Array[String], /* options */ js.UndefOr[Partial], String]
      ] = js.undefined
    
    var duration: js.UndefOr[PartialDuration] = js.undefined
    
    var easing: js.UndefOr[PartialEasing] = js.undefined
    
    var getAutoHeightDuration: js.UndefOr[js.Function1[/* height */ Double, Double]] = js.undefined
  }
  object TransitionsOptions {
    
    inline def apply(): TransitionsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransitionsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransitionsOptions] (val x: Self) extends AnyVal {
      
      inline def setCreate(value: (/* props */ String | js.Array[String], /* options */ js.UndefOr[Partial]) => String): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setDuration(value: PartialDuration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: PartialEasing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setGetAutoHeightDuration(value: /* height */ Double => Double): Self = StObject.set(x, "getAutoHeightDuration", js.Any.fromFunction1(value))
      
      inline def setGetAutoHeightDurationUndefined: Self = StObject.set(x, "getAutoHeightDuration", js.undefined)
    }
  }
}
