package com.olvind.mui.muiMaterial.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.muiBase.anon.ButtonUnstyledOwnPropsOmitanykeyofButton
import com.olvind.mui.muiBase.anon.Root
import com.olvind.mui.muiBase.anon.`1`
import com.olvind.mui.muiBase.buttonUnstyledPropsMod.ButtonUnstyledActions
import com.olvind.mui.muiBase.muiBaseStrings.button
import com.olvind.mui.muiBase.muiBaseStrings.reset
import com.olvind.mui.muiBase.muiBaseStrings.submit
import com.olvind.mui.react.mod.Ref
import com.olvind.mui.react.mod.RefAttributes
import com.olvind.mui.std.NonNullable
import com.olvind.mui.std.Pick
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.ElementType
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ButtonUnstyled {
  
  @JSImport("@mui/material", "ButtonUnstyled")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def action(value: Ref[ButtonUnstyledActions]): this.type = set("action", value.asInstanceOf[js.Any])
    
    inline def actionFunction1(value: ButtonUnstyledActions | Null => Callback): this.type = set("action", js.Any.fromFunction1((t0: ButtonUnstyledActions | Null) => value(t0).runNow()))
    
    inline def actionNull: this.type = set("action", null)
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def component(value: ElementType): this.type = set("component", value.asInstanceOf[js.Any])
    
    inline def components(value: Root): this.type = set("components", value.asInstanceOf[js.Any])
    
    inline def componentsProps(value: `1`): this.type = set("componentsProps", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
    
    inline def onClick(value: ReactMouseEventFrom[Element & Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def onFocusVisible(value: ReactFocusEventFrom[Element & Element] => Callback): this.type = set("onFocusVisible", js.Any.fromFunction1((t0: ReactFocusEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def tabIndex(value: NonNullable[js.UndefOr[Double]]): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def to(value: String): this.type = set("to", value.asInstanceOf[js.Any])
    
    inline def `type`(value: submit | reset | button): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ButtonUnstyled.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: (Pick[ButtonUnstyledOwnPropsOmitanykeyofButton, String | Double | js.Symbol]) & RefAttributes[Any]
  ): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
