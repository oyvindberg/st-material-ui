package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Theme extends StObject {
  
  var theme: com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme
}
object Theme {
  
  inline def apply(theme: com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme): Theme = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Theme] (val x: Self) extends AnyVal {
    
    inline def setTheme(value: com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
