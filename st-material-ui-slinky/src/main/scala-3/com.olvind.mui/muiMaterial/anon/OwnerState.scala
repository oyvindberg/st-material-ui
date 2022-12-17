package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OwnerState[T /* <: Theme */] extends StObject {
  
  var ownerState: ColorString
  
  var theme: T
}
object OwnerState {
  
  inline def apply[T /* <: Theme */](ownerState: ColorString, theme: T): OwnerState[T] = {
    val __obj = js.Dynamic.literal(ownerState = ownerState.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnerState[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OwnerState[?], T /* <: Theme */] (val x: Self & OwnerState[T]) extends AnyVal {
    
    inline def setOwnerState(value: ColorString): Self = StObject.set(x, "ownerState", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: T): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
