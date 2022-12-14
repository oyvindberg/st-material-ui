package com.olvind.mui.muiMaterial.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseButtonCloseIcon extends StObject {
  
  var closeButton: js.UndefOr[ReactElement] = js.undefined
  
  var closeIcon: js.UndefOr[ReactElement] = js.undefined
}
object CloseButtonCloseIcon {
  
  inline def apply(): CloseButtonCloseIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseButtonCloseIcon]
  }
  
  extension [Self <: CloseButtonCloseIcon](x: Self) {
    
    inline def setCloseButton(value: ReactElement): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    
    inline def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
    
    inline def setCloseIcon(value: ReactElement): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
    
    inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
  }
}
