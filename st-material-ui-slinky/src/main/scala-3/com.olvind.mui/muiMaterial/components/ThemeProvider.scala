package com.olvind.mui.muiMaterial.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.muiMaterial.stylesThemeProviderMod.ThemeProviderProps
import com.olvind.mui.std.Partial
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThemeProvider {
  
  inline def apply[T](theme: Partial[T] | (js.Function1[T, T])): Builder[T] = {
    val __props = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[ThemeProviderProps[T]]))
  }
  
  @JSImport("@mui/material/styles", "ThemeProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object]
  
  type Props[T] = ThemeProviderProps[T]
  
  def styled[T]: com.olvind.mui.StyledComponent.Builder[ThemeProviderProps[T], Builder[T]] = new com.olvind.mui.StyledComponent.Builder[ThemeProviderProps[T], Builder[T]](this.component, new js.Object, js.Array(), (newComponent: Any) => new Builder[T](js.Array(newComponent, js.Dictionary.empty)))
  
  def withProps[T](p: ThemeProviderProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
