package com.olvind.mui.muiMaterial.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tooltip extends StObject {
  
  var Arrow: js.UndefOr[ElementType] = js.undefined
  
  var Popper: js.UndefOr[ElementType] = js.undefined
  
  var Tooltip: js.UndefOr[ElementType] = js.undefined
  
  var Transition: js.UndefOr[ElementType] = js.undefined
}
object Tooltip {
  
  inline def apply(): Tooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tooltip]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tooltip] (val x: Self) extends AnyVal {
    
    inline def setArrow(value: ElementType): Self = StObject.set(x, "Arrow", value.asInstanceOf[js.Any])
    
    inline def setArrowUndefined: Self = StObject.set(x, "Arrow", js.undefined)
    
    inline def setPopper(value: ElementType): Self = StObject.set(x, "Popper", value.asInstanceOf[js.Any])
    
    inline def setPopperUndefined: Self = StObject.set(x, "Popper", js.undefined)
    
    inline def setTooltip(value: ElementType): Self = StObject.set(x, "Tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "Tooltip", js.undefined)
    
    inline def setTransition(value: ElementType): Self = StObject.set(x, "Transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "Transition", js.undefined)
  }
}
