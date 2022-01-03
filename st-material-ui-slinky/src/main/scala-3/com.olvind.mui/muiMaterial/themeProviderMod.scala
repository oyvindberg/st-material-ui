package com.olvind.mui.muiMaterial

import com.olvind.mui.std.Partial
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeProviderMod {
  
  @JSImport("@mui/material/styles/ThemeProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](props: ThemeProviderProps[T]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  trait ThemeProviderProps[Theme] extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.undefined
    
    var theme: Partial[Theme] | (js.Function1[/* outerTheme */ Theme, Theme])
  }
  object ThemeProviderProps {
    
    inline def apply[Theme](theme: Partial[Theme] | (js.Function1[/* outerTheme */ Theme, Theme])): ThemeProviderProps[Theme] = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeProviderProps[Theme]]
    }
    
    extension [Self <: ThemeProviderProps[?], Theme](x: Self & ThemeProviderProps[Theme]) {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setTheme(value: Partial[Theme] | (js.Function1[/* outerTheme */ Theme, Theme])): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeFunction1(value: /* outerTheme */ Theme => Theme): Self = StObject.set(x, "theme", js.Any.fromFunction1(value))
    }
  }
}
