package com.olvind.mui.muiSystem.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.muiSystem.themeProviderThemeProviderMod.ThemeProviderProps
import com.olvind.mui.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThemeProvider {
  
  @scala.inline
  def apply[T](theme: Partial[T] | (js.Function1[T, T])): Builder[T] = {
    val __props = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[ThemeProviderProps[T]]))
  }
  
  @JSImport("@mui/system", "ThemeProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[T] (val args: js.Array[Any])
    extends StBuildingComponent[js.Object]
  
  def withProps[T](p: ThemeProviderProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
