package com.olvind.mui.muiMaterial.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arrow extends StObject {
  
  var arrow: js.UndefOr[ReactElement] = js.undefined
  
  var popper: js.UndefOr[ReactElement] = js.undefined
  
  var tooltip: js.UndefOr[ReactElement] = js.undefined
  
  var transition: js.UndefOr[ReactElement] = js.undefined
}
object Arrow {
  
  inline def apply(): Arrow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Arrow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Arrow] (val x: Self) extends AnyVal {
    
    inline def setArrow(value: ReactElement): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
    
    inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
    
    inline def setPopper(value: ReactElement): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
    
    inline def setPopperUndefined: Self = StObject.set(x, "popper", js.undefined)
    
    inline def setTooltip(value: ReactElement): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setTransition(value: ReactElement): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}
