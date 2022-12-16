package com.olvind.mui.emotionReact.components

import com.olvind.mui.StBuildingComponent.Default
import com.olvind.mui.emotionReact.mod.Theme
import com.olvind.mui.emotionReact.typesThemingMod.ThemeProviderProps
import com.olvind.mui.StyledComponent.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThemeProvider {
  
  inline def apply(theme: js.Object | (js.Function1[/* outerTheme */ Theme, Theme])): Default[js.Object] = {
    val __props = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[/* props */ ThemeProviderProps]))
  }
  
  @JSImport("@emotion/react/types/theming", "ThemeProvider")
  @js.native
  val component: js.Object = js.native
  
  def styled: Builder[/* props */ ThemeProviderProps, Default[js.Object]] = new Builder[/* props */ ThemeProviderProps, Default[js.Object]](this.component, new js.Object, js.Array(), (newComponent: Any) => new Default[js.Object](js.Array(newComponent, js.Dictionary.empty)))
  
  def withProps(p: /* props */ ThemeProviderProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
