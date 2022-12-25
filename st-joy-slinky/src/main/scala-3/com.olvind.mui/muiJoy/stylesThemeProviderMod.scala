package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.PropsWithChildren
import com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesThemeProviderMod {
  
  @JSImport("@mui/joy/styles/ThemeProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: PropsWithChildren): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useTheme(): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[Theme]
}
