package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OwnerState[T /* <: com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme */] extends StObject {
  
  var ownerState: ColorString
  
  var theme: T
}
object OwnerState {
  
  inline def apply[T /* <: com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme */](ownerState: ColorString, theme: T): OwnerState[T] = {
    val __obj = js.Dynamic.literal(ownerState = ownerState.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnerState[T]]
  }
  
  extension [Self <: OwnerState[?], T /* <: com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme */](x: Self & OwnerState[T]) {
    
    inline def setOwnerState(value: ColorString): Self = StObject.set(x, "ownerState", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: T): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
