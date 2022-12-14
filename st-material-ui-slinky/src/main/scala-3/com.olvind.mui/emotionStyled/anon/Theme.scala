package com.olvind.mui.emotionStyled.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Theme extends StObject {
  
  var theme: com.olvind.mui.emotionReact.mod.Theme
}
object Theme {
  
  inline def apply(theme: com.olvind.mui.emotionReact.mod.Theme): Theme = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
  
  extension [Self <: Theme](x: Self) {
    
    inline def setTheme(value: com.olvind.mui.emotionReact.mod.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
