package com.olvind.mui.muiBase.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.muiBase.anon.Thumb
import com.olvind.mui.muiBase.anon.Track
import com.olvind.mui.muiBase.switchUnstyledSwitchUnstyledMod.SwitchUnstyledProps
import com.olvind.mui.react.mod.ChangeEvent
import com.olvind.mui.react.mod.RefAttributes
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.html.input.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SwitchUnstyled {
  
  @JSImport("@mui/base", "SwitchUnstyled")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def component(value: ReactElement): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def components(value: Thumb): this.type = set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentsProps(value: Track): this.type = set("componentsProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBlur(value: SyntheticFocusEvent[Element] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(value: ChangeEvent[HTMLInputElement] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocus(value: SyntheticFocusEvent[Element] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocusVisible(value: SyntheticFocusEvent[Element] => Unit): this.type = set("onFocusVisible", js.Any.fromFunction1(value))
    
    @scala.inline
    def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SwitchUnstyled.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SwitchUnstyledProps with RefAttributes[Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
