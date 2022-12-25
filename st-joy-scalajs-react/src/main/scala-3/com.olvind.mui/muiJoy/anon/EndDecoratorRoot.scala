package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.linkLinkPropsMod.LinkOwnerState
import com.olvind.mui.muiJoy.utilsTypesMod.SlotCommonProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'a', {}, @mui/joy.@mui/joy/Link/LinkProps.LinkOwnerState>,   startDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Link/LinkProps.LinkOwnerState>,   endDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Link/LinkProps.LinkOwnerState>} ]:? {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'a', {}, @mui/joy.@mui/joy/Link/LinkProps.LinkOwnerState>,   startDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Link/LinkProps.LinkOwnerState>,   endDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Link/LinkProps.LinkOwnerState>}[P]} */
trait EndDecoratorRoot extends StObject {
  
  var endDecorator: js.UndefOr[com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, LinkOwnerState]] = js.undefined
  
  var root: js.UndefOr[com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["a", js.Object, LinkOwnerState]] = js.undefined
  
  var startDecorator: js.UndefOr[com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, LinkOwnerState]] = js.undefined
}
object EndDecoratorRoot {
  
  inline def apply(): EndDecoratorRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndDecoratorRoot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndDecoratorRoot] (val x: Self) extends AnyVal {
    
    inline def setEndDecorator(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, LinkOwnerState]): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
    
    inline def setEndDecoratorFunction1(
      value: LinkOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "endDecorator", js.Any.fromFunction1(value))
    
    inline def setEndDecoratorUndefined: Self = StObject.set(x, "endDecorator", js.undefined)
    
    inline def setRoot(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["a", js.Object, LinkOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: LinkOwnerState => (Omit[ComponentPropsWithRef["a"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setStartDecorator(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, LinkOwnerState]): Self = StObject.set(x, "startDecorator", value.asInstanceOf[js.Any])
    
    inline def setStartDecoratorFunction1(
      value: LinkOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "startDecorator", js.Any.fromFunction1(value))
    
    inline def setStartDecoratorUndefined: Self = StObject.set(x, "startDecorator", js.undefined)
  }
}
