package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.stylesExtendThemeMod.CssVarsThemeOptions
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.PropsWithChildren<{  theme :@mui/joy.@mui/joy/styles/extendTheme.CssVarsThemeOptions | undefined}> */
trait PropsWithChildren extends StObject {
  
  var children: js.UndefOr[ReactElement] = js.undefined
  
  var theme: js.UndefOr[CssVarsThemeOptions] = js.undefined
}
object PropsWithChildren {
  
  inline def apply(): PropsWithChildren = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropsWithChildren]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropsWithChildren] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setTheme(value: CssVarsThemeOptions): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
