package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseIcon extends StObject {
  
  var closeButton: js.UndefOr[IconButtonPropsIconButtonTypeMapbuttonde] = js.undefined
  
  var closeIcon: js.UndefOr[SvgIconPropsSvgIconTypeMapsvgdefaultComp] = js.undefined
}
object CloseIcon {
  
  inline def apply(): CloseIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseIcon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloseIcon] (val x: Self) extends AnyVal {
    
    inline def setCloseButton(value: IconButtonPropsIconButtonTypeMapbuttonde): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    
    inline def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
    
    inline def setCloseIcon(value: SvgIconPropsSvgIconTypeMapsvgdefaultComp): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
    
    inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
  }
}
