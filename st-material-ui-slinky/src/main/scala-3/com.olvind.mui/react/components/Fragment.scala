package com.olvind.mui.react.components

import com.olvind.mui.StBuildingComponent.Default
import com.olvind.mui.react.anon.Children
import com.olvind.mui.StyledComponent.Builder
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Fragment {
  
  @JSImport("react", "Fragment")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Fragment.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def styled: Builder[Children, Default[tag.type, js.Object]] = new Builder[Children, Default[tag.type, js.Object]](this.component, new js.Object, js.Array(), (newComponent: Any) => new Default[tag.type, js.Object](js.Array(newComponent, js.Dictionary.empty)))
  
  def withProps(p: Children): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
