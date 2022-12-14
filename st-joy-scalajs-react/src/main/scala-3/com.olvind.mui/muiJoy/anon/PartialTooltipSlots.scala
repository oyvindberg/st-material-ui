package com.olvind.mui.muiJoy.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/joy.@mui/joy/Tooltip/TooltipProps.TooltipSlots> */
trait PartialTooltipSlots extends StObject {
  
  var arrow: js.UndefOr[ElementType] = js.undefined
  
  var root: js.UndefOr[ElementType] = js.undefined
}
object PartialTooltipSlots {
  
  inline def apply(): PartialTooltipSlots = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTooltipSlots]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialTooltipSlots] (val x: Self) extends AnyVal {
    
    inline def setArrow(value: ElementType): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
    
    inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
    
    inline def setRoot(value: ElementType): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
