package com.olvind.mui.muiBase.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.muiBase.anon.Root
import com.olvind.mui.muiBase.muiBaseStrings.auto
import com.olvind.mui.muiBase.muiBaseStrings.off
import com.olvind.mui.muiBase.muiBaseStrings.on
import com.olvind.mui.muiBase.sliderValueLabelUnstyledMod.ValueLabelUnstyledProps
import com.olvind.mui.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SliderValueLabelUnstyled {
  
  @JSImport("@mui/base", "SliderValueLabelUnstyled")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends StBuildingComponent[js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def components(value: Root): this.type = set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: Double | js.Array[Double]): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueLabelDisplay(value: on | auto | off): this.type = set("valueLabelDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueVarargs(value: Double*): this.type = set("value", js.Array(value :_*))
  }
  
  implicit def make(companion: SliderValueLabelUnstyled.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ValueLabelUnstyledProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
