package com.olvind.mui.muiJoy.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {} & Omit<PopperUnstyledProps<'div', {}>, 'direction'>, @mui/joy.@mui/joy/Tooltip/TooltipProps.TooltipOwnerState>,   arrow :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Tooltip/TooltipProps.TooltipOwnerState>} ]:? react.react.ElementType<any>} */
trait Arrow extends StObject {
  
  var arrow: js.UndefOr[ElementType] = js.undefined
  
  var root: js.UndefOr[ElementType] = js.undefined
}
object Arrow {
  
  inline def apply(): Arrow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Arrow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Arrow] (val x: Self) extends AnyVal {
    
    inline def setArrow(value: ElementType): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
    
    inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
    
    inline def setRoot(value: ElementType): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
