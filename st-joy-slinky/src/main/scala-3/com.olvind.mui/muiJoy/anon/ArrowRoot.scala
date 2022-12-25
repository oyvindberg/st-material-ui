package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.tooltipTooltipPropsMod.TooltipOwnerState
import com.olvind.mui.muiJoy.utilsTypesMod.SlotCommonProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {} & Omit<PopperUnstyledProps<'div', {}>, 'direction'>, @mui/joy.@mui/joy/Tooltip/TooltipProps.TooltipOwnerState>,   arrow :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Tooltip/TooltipProps.TooltipOwnerState>} ]:? {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {} & Omit<PopperUnstyledProps<'div', {}>, 'direction'>, @mui/joy.@mui/joy/Tooltip/TooltipProps.TooltipOwnerState>,   arrow :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Tooltip/TooltipProps.TooltipOwnerState>}[P]} */
trait ArrowRoot extends StObject {
  
  var arrow: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, TooltipOwnerState]
  ] = js.undefined
  
  var root: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", OmitPopperUnstyledPropsdivdirection, TooltipOwnerState]
  ] = js.undefined
}
object ArrowRoot {
  
  inline def apply(): ArrowRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrowRoot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrowRoot] (val x: Self) extends AnyVal {
    
    inline def setArrow(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, TooltipOwnerState]): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
    
    inline def setArrowFunction1(
      value: TooltipOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "arrow", js.Any.fromFunction1(value))
    
    inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
    
    inline def setRoot(
      value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", OmitPopperUnstyledPropsdivdirection, TooltipOwnerState]
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: TooltipOwnerState => (Omit[ComponentPropsWithRef["div"], "color"]) & OmitPopperUnstyledPropsdivdirection & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
