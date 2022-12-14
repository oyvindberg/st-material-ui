package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsSliderTypeMapspan
import com.olvind.mui.muiJoy.sliderSliderClassesMod.SliderClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderMod {
  
  @JSImport("@mui/joy/Slider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Slider](https://mui.com/joy-ui/react-slider/)
    *
    * API:
    *
    * - [Slider API](https://mui.com/joy-ui/api/slider/)
    */
  @JSImport("@mui/joy/Slider", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsSliderTypeMapspan, Element | Null] = js.native
  
  inline def getSliderUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSliderUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/joy/Slider", "sliderClasses")
  @js.native
  val sliderClasses: SliderClasses = js.native
}
