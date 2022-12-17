package com.olvind.mui.react.components

import com.olvind.mui.StBuildingComponent.Default
import com.olvind.mui.react.anon.Children
import com.olvind.mui.StyledComponent.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Fragment {
  
  @JSImport("react", "Fragment")
  @js.native
  val component: js.Object = js.native
  
  type Props = Children
  
  implicit def make(companion: Fragment.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def styled: Builder[Children, Default[js.Object]] = new Builder[Children, Default[js.Object]](this.component, new js.Object, js.Array(), (newComponent: Any) => new Default[js.Object](js.Array(newComponent, js.Dictionary.empty)))
  
  def withProps(p: Children): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
