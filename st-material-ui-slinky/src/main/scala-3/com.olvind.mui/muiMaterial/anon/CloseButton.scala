package com.olvind.mui.muiMaterial.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseButton extends StObject {
  
  var CloseButton: js.UndefOr[ReactElement] = js.undefined
  
  var CloseIcon: js.UndefOr[ReactElement] = js.undefined
}
object CloseButton {
  
  inline def apply(): CloseButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseButton]
  }
  
  extension [Self <: CloseButton](x: Self) {
    
    inline def setCloseButton(value: ReactElement): Self = StObject.set(x, "CloseButton", value.asInstanceOf[js.Any])
    
    inline def setCloseButtonUndefined: Self = StObject.set(x, "CloseButton", js.undefined)
    
    inline def setCloseIcon(value: ReactElement): Self = StObject.set(x, "CloseIcon", value.asInstanceOf[js.Any])
    
    inline def setCloseIconUndefined: Self = StObject.set(x, "CloseIcon", js.undefined)
  }
}
