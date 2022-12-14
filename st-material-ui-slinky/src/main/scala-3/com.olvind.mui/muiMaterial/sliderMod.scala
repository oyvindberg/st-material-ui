package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsSliderTypeMapspan
import com.olvind.mui.muiMaterial.sliderSliderClassesMod.SliderClasses
import com.olvind.mui.muiMaterial.sliderSliderMod.SliderMarkLabelProps
import com.olvind.mui.muiMaterial.sliderSliderMod.SliderMarkProps
import com.olvind.mui.muiMaterial.sliderSliderMod.SliderRailProps
import com.olvind.mui.muiMaterial.sliderSliderMod.SliderRootProps
import com.olvind.mui.muiMaterial.sliderSliderMod.SliderThumbProps
import com.olvind.mui.muiMaterial.sliderSliderMod.SliderTrackProps
import com.olvind.mui.muiMaterial.sliderSliderMod.SliderValueLabelProps
import com.olvind.mui.react.mod.global.JSX.Element
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderMod {
  
  @JSImport("@mui/material/Slider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Slider](https://mui.com/material-ui/react-slider/)
    *
    * API:
    *
    * - [Slider API](https://mui.com/material-ui/api/slider/)
    */
  @JSImport("@mui/material/Slider", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsSliderTypeMapspan, Element] = js.native
  
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
  
  inline def getSliderUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSliderUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/Slider", "sliderClasses")
  @js.native
  val sliderClasses: SliderClasses = js.native
}
