package com.olvind.mui.muiBase.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.muiBase.sliderUnstyledSliderValueLabelUnstyledMod.SliderValueLabelUnstyledProps
import com.olvind.mui.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SliderValueLabelUnstyled {
  
  inline def apply(open: Boolean, value: Double): Builder = {
    val __props = js.Dynamic.literal(open = open.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SliderValueLabelUnstyledProps]))
  }
  
  @JSImport("@mui/base", "SliderValueLabelUnstyled")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def valueLabelDisplay(value: "on" | "auto" | "off"): this.type = set("valueLabelDisplay", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SliderValueLabelUnstyledProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
