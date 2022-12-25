package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.chipChipPropsMod.ChipOwnerState
import com.olvind.mui.muiJoy.utilsTypesMod.SlotCommonProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/Chip/ChipProps.ChipOwnerState>,   label :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Chip/ChipProps.ChipOwnerState>,   action :@mui/joy.@mui/joy/utils/types.SlotProps<'button', {  href :string | undefined,   to :string | undefined}, @mui/joy.@mui/joy/Chip/ChipProps.ChipOwnerState>,   startDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Chip/ChipProps.ChipOwnerState>,   endDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Chip/ChipProps.ChipOwnerState>} ]:? {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/Chip/ChipProps.ChipOwnerState>,   label :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Chip/ChipProps.ChipOwnerState>,   action :@mui/joy.@mui/joy/utils/types.SlotProps<'button', {  href :string | undefined,   to :string | undefined}, @mui/joy.@mui/joy/Chip/ChipProps.ChipOwnerState>,   startDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Chip/ChipProps.ChipOwnerState>,   endDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Chip/ChipProps.ChipOwnerState>}[P]} */
trait EndDecoratorLabel extends StObject {
  
  var action: js.UndefOr[com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["button", Href, ChipOwnerState]] = js.undefined
  
  var endDecorator: js.UndefOr[com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, ChipOwnerState]] = js.undefined
  
  var label: js.UndefOr[com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, ChipOwnerState]] = js.undefined
  
  var root: js.UndefOr[com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, ChipOwnerState]] = js.undefined
  
  var startDecorator: js.UndefOr[com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, ChipOwnerState]] = js.undefined
}
object EndDecoratorLabel {
  
  inline def apply(): EndDecoratorLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndDecoratorLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndDecoratorLabel] (val x: Self) extends AnyVal {
    
    inline def setAction(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["button", Href, ChipOwnerState]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionFunction1(
      value: ChipOwnerState => (Omit[ComponentPropsWithRef["button"], "color"]) & Href & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setEndDecorator(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, ChipOwnerState]): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
    
    inline def setEndDecoratorFunction1(
      value: ChipOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "endDecorator", js.Any.fromFunction1(value))
    
    inline def setEndDecoratorUndefined: Self = StObject.set(x, "endDecorator", js.undefined)
    
    inline def setLabel(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, ChipOwnerState]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelFunction1(
      value: ChipOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setRoot(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, ChipOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: ChipOwnerState => (Omit[ComponentPropsWithRef["div"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setStartDecorator(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, ChipOwnerState]): Self = StObject.set(x, "startDecorator", value.asInstanceOf[js.Any])
    
    inline def setStartDecoratorFunction1(
      value: ChipOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "startDecorator", js.Any.fromFunction1(value))
    
    inline def setStartDecoratorUndefined: Self = StObject.set(x, "startDecorator", js.undefined)
  }
}
