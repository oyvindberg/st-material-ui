package com.olvind.mui.muiBase.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.muiBase.unstableTrapFocusUnstableTrapFocusMod.TrapFocusProps
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UnstableTrapFocus {
  
  @scala.inline
  def apply(open: Boolean): Builder = {
    val __props = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TrapFocusProps]))
  }
  
  @JSImport("@mui/base", "UnstableTrapFocus")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends StBuildingComponent[js.Object] {
    
    @scala.inline
    def disableAutoFocus(value: Boolean): this.type = set("disableAutoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableEnforceFocus(value: Boolean): this.type = set("disableEnforceFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableRestoreFocus(value: Boolean): this.type = set("disableRestoreFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getTabbable(value: /* root */ HTMLElement => js.Array[String]): this.type = set("getTabbable", js.Any.fromFunction1(value))
    
    @scala.inline
    def isEnabled(value: CallbackTo[Boolean]): this.type = set("isEnabled", value.toJsFn)
  }
  
  def withProps(p: TrapFocusProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
