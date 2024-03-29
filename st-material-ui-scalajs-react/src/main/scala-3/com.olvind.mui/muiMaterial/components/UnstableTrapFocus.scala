package com.olvind.mui.muiMaterial.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.muiBase.focusTrapFocusTrapDottypesMod.FocusTrapProps
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UnstableTrapFocus {
  
  inline def apply(open: Boolean): Builder = {
    val __props = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FocusTrapProps]))
  }
  
  @JSImport("@mui/material/Unstable_TrapFocus", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def disableAutoFocus(value: Boolean): this.type = set("disableAutoFocus", value.asInstanceOf[js.Any])
    
    inline def disableEnforceFocus(value: Boolean): this.type = set("disableEnforceFocus", value.asInstanceOf[js.Any])
    
    inline def disableRestoreFocus(value: Boolean): this.type = set("disableRestoreFocus", value.asInstanceOf[js.Any])
    
    inline def getTabbable(value: /* root */ HTMLElement => js.Array[String]): this.type = set("getTabbable", js.Any.fromFunction1(value))
    
    inline def isEnabled(value: CallbackTo[Boolean]): this.type = set("isEnabled", value.toJsFn)
  }
  
  type Props = FocusTrapProps
  
  def styled: com.olvind.mui.StyledComponent.Builder[FocusTrapProps, Builder] = new com.olvind.mui.StyledComponent.Builder[FocusTrapProps, Builder](this.component, new js.Object, js.Array(), (newComponent: Any) => new Builder(js.Array(newComponent, js.Dictionary.empty)))
  
  def withProps(p: FocusTrapProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
