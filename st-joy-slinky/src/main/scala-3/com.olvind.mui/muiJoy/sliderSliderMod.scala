package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsSliderTypeMapspan
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderSliderMod extends Shortcut {
  
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
  @JSImport("@mui/joy/Slider/Slider", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsSliderTypeMapspan, Element | Null] = js.native
  
  type _To = js.Function1[/* props */ DefaultComponentPropsSliderTypeMapspan, Element | Null]
  
  /* This means you don't have to write `default`, but can instead just say `sliderSliderMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsSliderTypeMapspan, Element | Null] = default
}
