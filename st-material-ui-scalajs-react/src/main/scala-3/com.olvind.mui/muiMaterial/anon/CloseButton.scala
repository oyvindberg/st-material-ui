package com.olvind.mui.muiMaterial.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseButton extends StObject {
  
  var CloseButton: js.UndefOr[ElementType] = js.undefined
  
  var CloseIcon: js.UndefOr[ElementType] = js.undefined
}
object CloseButton {
  
  inline def apply(): CloseButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseButton]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloseButton] (val x: Self) extends AnyVal {
    
    inline def setCloseButton(value: ElementType): Self = StObject.set(x, "CloseButton", value.asInstanceOf[js.Any])
    
    inline def setCloseButtonUndefined: Self = StObject.set(x, "CloseButton", js.undefined)
    
    inline def setCloseIcon(value: ElementType): Self = StObject.set(x, "CloseIcon", value.asInstanceOf[js.Any])
    
    inline def setCloseIconUndefined: Self = StObject.set(x, "CloseIcon", js.undefined)
  }
}
