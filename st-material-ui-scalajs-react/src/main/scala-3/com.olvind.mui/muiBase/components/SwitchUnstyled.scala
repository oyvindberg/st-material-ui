package com.olvind.mui.muiBase.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.muiBase.anon.Thumb
import com.olvind.mui.muiBase.anon.Track
import com.olvind.mui.muiBase.switchUnstyledSwitchUnstyledMod.SwitchUnstyledProps
import com.olvind.mui.react.mod.RefAttributes
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.facade.React.ElementType
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SwitchUnstyled {
  
  @JSImport("@mui/base", "SwitchUnstyled")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def component(value: ElementType): this.type = set("component", value.asInstanceOf[js.Any])
    
    inline def components(value: Thumb): this.type = set("components", value.asInstanceOf[js.Any])
    
    inline def componentsProps(value: Track): this.type = set("componentsProps", value.asInstanceOf[js.Any])
    
    inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: ReactFocusEventFrom[Element & Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def onChange(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onFocus(value: ReactFocusEventFrom[Element & Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def onFocusVisible(value: ReactFocusEventFrom[Element & Element] => Callback): this.type = set("onFocusVisible", js.Any.fromFunction1((t0: ReactFocusEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SwitchUnstyled.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SwitchUnstyledProps & RefAttributes[Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
