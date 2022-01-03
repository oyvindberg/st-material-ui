package com.olvind.mui.muiBase.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.muiBase.noSsrNoSsrMod.NoSsrProps
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NoSsr {
  
  @JSImport("@mui/base", "NoSsr")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends StBuildingComponent[js.Object] {
    
    @scala.inline
    def defer(value: Boolean): this.type = set("defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fallback(value: VdomNode): this.type = set("fallback", value.rawNode.asInstanceOf[js.Any])
    
    @scala.inline
    def fallbackNull: this.type = set("fallback", null)
    
    @scala.inline
    def fallbackVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("fallback", js.Array(value :_*))
    
    @scala.inline
    def fallbackVdomElement(value: VdomElement): this.type = set("fallback", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: NoSsr.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NoSsrProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
