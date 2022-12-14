package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.tooltipTooltipPropsMod.TooltipOwnerState
import com.olvind.mui.muiJoy.utilsTypesMod.SlotCommonProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrowRoot extends StObject {
  
  var arrow: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, TooltipOwnerState]
  
  var root: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", OmitPopperUnstyledPropsdivdirection, TooltipOwnerState]
}
object ArrowRoot {
  
  inline def apply(
    arrow: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, TooltipOwnerState],
    root: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", OmitPopperUnstyledPropsdivdirection, TooltipOwnerState]
  ): ArrowRoot = {
    val __obj = js.Dynamic.literal(arrow = arrow.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowRoot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrowRoot] (val x: Self) extends AnyVal {
    
    inline def setArrow(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, TooltipOwnerState]): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
    
    inline def setArrowFunction1(
      value: TooltipOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "arrow", js.Any.fromFunction1(value))
    
    inline def setRoot(
      value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", OmitPopperUnstyledPropsdivdirection, TooltipOwnerState]
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: TooltipOwnerState => (Omit[ComponentPropsWithRef["div"], "color"]) & OmitPopperUnstyledPropsdivdirection & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
  }
}
