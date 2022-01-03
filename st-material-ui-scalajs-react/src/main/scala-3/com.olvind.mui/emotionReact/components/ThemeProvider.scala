package com.olvind.mui.emotionReact.components

import com.olvind.mui.StBuildingComponent.Default
import com.olvind.mui.emotionReact.emotionReactMod.Theme
import com.olvind.mui.emotionReact.themingMod.ThemeProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThemeProvider {
  
  inline def apply(theme: js.Object | (js.Function1[/* outerTheme */ Theme, Theme])): Default[js.Object] = {
    val __props = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[/* props */ ThemeProviderProps]))
  }
  
  @JSImport("@emotion/react", "ThemeProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: /* props */ ThemeProviderProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
