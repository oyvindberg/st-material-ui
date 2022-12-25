package com.olvind.mui.muiJoy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Theme extends StObject {
  
  var ownerState: `0`
  
  var theme: com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme
}
object Theme {
  
  inline def apply(ownerState: `0`, theme: com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme): Theme = {
    val __obj = js.Dynamic.literal(ownerState = ownerState.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Theme] (val x: Self) extends AnyVal {
    
    inline def setOwnerState(value: `0`): Self = StObject.set(x, "ownerState", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
