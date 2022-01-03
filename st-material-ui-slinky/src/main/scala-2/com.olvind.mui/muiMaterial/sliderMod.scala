package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendSliderUnstyle
import com.olvind.mui.muiMaterial.sliderSliderMod.SliderClasses_
import com.olvind.mui.muiMaterial.sliderSliderMod.SliderMarkLabelProps
import com.olvind.mui.muiMaterial.sliderSliderMod.SliderMarkProps
import com.olvind.mui.muiMaterial.sliderSliderMod.SliderRailProps
import com.olvind.mui.muiMaterial.sliderSliderMod.SliderRootProps
import com.olvind.mui.muiMaterial.sliderSliderMod.SliderThumbProps
import com.olvind.mui.muiMaterial.sliderSliderMod.SliderTrackProps
import com.olvind.mui.muiMaterial.sliderSliderMod.SliderValueLabelProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Slider](https://mui.com/components/slider/)
    *
    * API:
    *
    * - [Slider API](https://mui.com/api/slider/)
    * - inherits [SliderUnstyled API](https://mui.com/api/slider-unstyled/)
    */
  @JSImport("@mui/material/Slider", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsExtendSliderUnstyle, Element] = js.native
  
  @JSImport("@mui/material/Slider", "SliderMark")
  @js.native
  val SliderMark: ReactComponentClass[SliderMarkProps] = js.native
  
  @JSImport("@mui/material/Slider", "SliderMarkLabel")
  @js.native
  val SliderMarkLabel: ReactComponentClass[SliderMarkLabelProps] = js.native
  
  @JSImport("@mui/material/Slider", "SliderRail")
  @js.native
  val SliderRail: ReactComponentClass[SliderRailProps] = js.native
  
  @JSImport("@mui/material/Slider", "SliderRoot")
  @js.native
  val SliderRoot: ReactComponentClass[SliderRootProps] = js.native
  
  @JSImport("@mui/material/Slider", "SliderThumb")
  @js.native
  val SliderThumb: ReactComponentClass[SliderThumbProps] = js.native
  
  @JSImport("@mui/material/Slider", "SliderTrack")
  @js.native
  val SliderTrack: ReactComponentClass[SliderTrackProps] = js.native
  
  @JSImport("@mui/material/Slider", "SliderValueLabel")
  @js.native
  val SliderValueLabel: ReactComponentClass[SliderValueLabelProps] = js.native
  
  @JSImport("@mui/material/Slider", "sliderClasses")
  @js.native
  val sliderClasses: SliderClasses_ = js.native
  
  type _To = js.Function1[/* props */ DefaultComponentPropsExtendSliderUnstyle, Element]
  
  /* This means you don't have to write `default`, but can instead just say `sliderMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsExtendSliderUnstyle, Element] = default
}
