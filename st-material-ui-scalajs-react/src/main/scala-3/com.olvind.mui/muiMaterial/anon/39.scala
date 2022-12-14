package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `39` extends StObject {
  
  var closeButton: js.UndefOr[IconButtonPropsdefaultComponent] = js.undefined
  
  var closeIcon: js.UndefOr[SvgIconPropssvg] = js.undefined
}
object `39` {
  
  inline def apply(): `39` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`39`]
  }
  
  extension [Self <: `39`](x: Self) {
    
    inline def setCloseButton(value: IconButtonPropsdefaultComponent): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    
    inline def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
    
    inline def setCloseIcon(value: SvgIconPropssvg): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
    
    inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
  }
}
