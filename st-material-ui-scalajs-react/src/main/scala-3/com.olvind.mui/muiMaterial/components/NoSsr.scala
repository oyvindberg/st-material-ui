package com.olvind.mui.muiMaterial.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.muiBase.noSsrNoSsrMod.NoSsrProps
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NoSsr {
  
  @JSImport("@mui/material", "NoSsr")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def defer(value: Boolean): this.type = set("defer", value.asInstanceOf[js.Any])
    
    inline def fallback(value: VdomNode): this.type = set("fallback", value.rawNode.asInstanceOf[js.Any])
    
    inline def fallbackNull: this.type = set("fallback", null)
    
    inline def fallbackVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("fallback", js.Array(value*))
    
    inline def fallbackVdomElement(value: VdomElement): this.type = set("fallback", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: NoSsr.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NoSsrProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
