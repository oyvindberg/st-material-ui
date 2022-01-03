package com.olvind.mui.react.components

import com.olvind.mui.StBuildingComponent.Default
import com.olvind.mui.react.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StrictMode {
  
  @JSImport("react", "StrictMode")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: StrictMode.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Children): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
