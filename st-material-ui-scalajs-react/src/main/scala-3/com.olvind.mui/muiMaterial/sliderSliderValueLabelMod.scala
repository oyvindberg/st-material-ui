package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.sliderSliderValueLabelDottypesMod.SliderValueLabelProps
import com.olvind.mui.propTypes.mod.ReactElementLike
import com.olvind.mui.propTypes.mod.ReactNodeLike
import com.olvind.mui.propTypes.mod.Requireable
import com.olvind.mui.propTypes.mod.Validator
import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderSliderValueLabelMod {
  
  object default {
    
    /**
      * @ignore - internal component.
      */
    inline def apply(props: SliderValueLabelProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    
    @JSImport("@mui/material/Slider/SliderValueLabel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("@mui/material/Slider/SliderValueLabel", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@mui/material/Slider/SliderValueLabel", "default.propTypes.children")
      @js.native
      def children: Validator[ReactElementLike] = js.native
      inline def children_=(x: Validator[ReactElementLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@mui/material/Slider/SliderValueLabel", "default.propTypes.className")
      @js.native
      def className: Requireable[String] = js.native
      inline def className_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("@mui/material/Slider/SliderValueLabel", "default.propTypes.value")
      @js.native
      def value: Requireable[ReactNodeLike] = js.native
      inline def value_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
    }
  }
}
