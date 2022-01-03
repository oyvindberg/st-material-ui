package com.olvind.mui.muiBase.components

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
import org.scalajs.dom.Element
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ButtonUnstyled {
  
  @JSImport("@mui/base", "ButtonUnstyled")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def action(value: Ref[ButtonUnstyledActions]): this.type = set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def actionFunction1(value: /* instance */ ButtonUnstyledActions | Null => Unit): this.type = set("action", js.Any.fromFunction1(value))
    
    @scala.inline
    def actionNull: this.type = set("action", null)
    
    @scala.inline
    def actionReactRef(value: ReactRef[ButtonUnstyledActions]): this.type = set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def component(value: ReactElement): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def components(value: Root): this.type = set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentsProps(value: `1`): this.type = set("componentsProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: SyntheticMouseEvent[Element] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocusVisible(value: SyntheticFocusEvent[Element] => Unit): this.type = set("onFocusVisible", js.Any.fromFunction1(value))
    
    @scala.inline
    def tabIndex(value: NonNullable[js.UndefOr[Double]]): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def to(value: String): this.type = set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: submit | reset | button): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ButtonUnstyled.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: (Pick[ButtonUnstyledOwnPropsOmitanykeyofButton, String | Double | js.Symbol]) with RefAttributes[Any]
  ): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
