package com.olvind.mui.muiMaterial.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseButtonCloseIcon extends StObject {
  
  var closeButton: js.UndefOr[ElementType] = js.undefined
  
  var closeIcon: js.UndefOr[ElementType] = js.undefined
}
object CloseButtonCloseIcon {
  
  inline def apply(): CloseButtonCloseIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseButtonCloseIcon]
  }
  
  extension [Self <: CloseButtonCloseIcon](x: Self) {
    
    inline def setCloseButton(value: ElementType): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    
    inline def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
    
    inline def setCloseIcon(value: ElementType): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
    
    inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
  }
}
