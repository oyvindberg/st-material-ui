package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearIndicator extends StObject {
  
  var clearIndicator: js.UndefOr[PartialIconButtonPropsIconButtonTypeMapb] = js.undefined
  
  var paper: js.UndefOr[PaperPropsPaperTypeMapdivdefaultComponen] = js.undefined
  
  var popper: js.UndefOr[PartialPopperProps] = js.undefined
  
  var popupIndicator: js.UndefOr[PartialIconButtonPropsIconButtonTypeMapb] = js.undefined
}
object ClearIndicator {
  
  inline def apply(): ClearIndicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearIndicator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClearIndicator] (val x: Self) extends AnyVal {
    
    inline def setClearIndicator(value: PartialIconButtonPropsIconButtonTypeMapb): Self = StObject.set(x, "clearIndicator", value.asInstanceOf[js.Any])
    
    inline def setClearIndicatorUndefined: Self = StObject.set(x, "clearIndicator", js.undefined)
    
    inline def setPaper(value: PaperPropsPaperTypeMapdivdefaultComponen): Self = StObject.set(x, "paper", value.asInstanceOf[js.Any])
    
    inline def setPaperUndefined: Self = StObject.set(x, "paper", js.undefined)
    
    inline def setPopper(value: PartialPopperProps): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
    
    inline def setPopperUndefined: Self = StObject.set(x, "popper", js.undefined)
    
    inline def setPopupIndicator(value: PartialIconButtonPropsIconButtonTypeMapb): Self = StObject.set(x, "popupIndicator", value.asInstanceOf[js.Any])
    
    inline def setPopupIndicatorUndefined: Self = StObject.set(x, "popupIndicator", js.undefined)
  }
}
