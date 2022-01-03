package com.olvind.mui.muiMaterial.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Popper extends StObject {
  
  var Arrow: js.UndefOr[ReactElement] = js.undefined
  
  var Popper: js.UndefOr[ReactElement] = js.undefined
  
  var Tooltip: js.UndefOr[ReactElement] = js.undefined
  
  var Transition: js.UndefOr[ReactElement] = js.undefined
}
object Popper {
  
  inline def apply(): Popper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Popper]
  }
  
  extension [Self <: Popper](x: Self) {
    
    inline def setArrow(value: ReactElement): Self = StObject.set(x, "Arrow", value.asInstanceOf[js.Any])
    
    inline def setArrowUndefined: Self = StObject.set(x, "Arrow", js.undefined)
    
    inline def setPopper(value: ReactElement): Self = StObject.set(x, "Popper", value.asInstanceOf[js.Any])
    
    inline def setPopperUndefined: Self = StObject.set(x, "Popper", js.undefined)
    
    inline def setTooltip(value: ReactElement): Self = StObject.set(x, "Tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "Tooltip", js.undefined)
    
    inline def setTransition(value: ReactElement): Self = StObject.set(x, "Transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "Transition", js.undefined)
  }
}
