package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.switchSwitchPropsMod.SwitchOwnerState
import com.olvind.mui.muiJoy.utilsTypesMod.SlotCommonProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/Switch/SwitchProps.SwitchOwnerState>,   thumb :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Switch/SwitchProps.SwitchOwnerState>,   action :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/Switch/SwitchProps.SwitchOwnerState>,   input :@mui/joy.@mui/joy/utils/types.SlotProps<'input', {}, @mui/joy.@mui/joy/Switch/SwitchProps.SwitchOwnerState>,   track :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Switch/SwitchProps.SwitchOwnerState>,   startDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Switch/SwitchProps.SwitchOwnerState>,   endDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Switch/SwitchProps.SwitchOwnerState>} ]:? {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/Switch/SwitchProps.SwitchOwnerState>,   thumb :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Switch/SwitchProps.SwitchOwnerState>,   action :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/Switch/SwitchProps.SwitchOwnerState>,   input :@mui/joy.@mui/joy/utils/types.SlotProps<'input', {}, @mui/joy.@mui/joy/Switch/SwitchProps.SwitchOwnerState>,   track :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Switch/SwitchProps.SwitchOwnerState>,   startDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Switch/SwitchProps.SwitchOwnerState>,   endDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Switch/SwitchProps.SwitchOwnerState>}[P]} */
trait ThumbTrack extends StObject {
  
  var action: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, SwitchOwnerState]
  ] = js.undefined
  
  var endDecorator: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SwitchOwnerState]
  ] = js.undefined
  
  var input: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["input", js.Object, SwitchOwnerState]
  ] = js.undefined
  
  var root: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, SwitchOwnerState]
  ] = js.undefined
  
  var startDecorator: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SwitchOwnerState]
  ] = js.undefined
  
  var thumb: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SwitchOwnerState]
  ] = js.undefined
  
  var track: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SwitchOwnerState]
  ] = js.undefined
}
object ThumbTrack {
  
  inline def apply(): ThumbTrack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThumbTrack]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThumbTrack] (val x: Self) extends AnyVal {
    
    inline def setAction(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, SwitchOwnerState]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionFunction1(
      value: SwitchOwnerState => (Omit[ComponentPropsWithRef["div"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setEndDecorator(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SwitchOwnerState]): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
    
    inline def setEndDecoratorFunction1(
      value: SwitchOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "endDecorator", js.Any.fromFunction1(value))
    
    inline def setEndDecoratorUndefined: Self = StObject.set(x, "endDecorator", js.undefined)
    
    inline def setInput(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["input", js.Object, SwitchOwnerState]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputFunction1(
      value: SwitchOwnerState => (Omit[ComponentPropsWithRef["input"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "input", js.Any.fromFunction1(value))
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setRoot(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, SwitchOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: SwitchOwnerState => (Omit[ComponentPropsWithRef["div"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setStartDecorator(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SwitchOwnerState]): Self = StObject.set(x, "startDecorator", value.asInstanceOf[js.Any])
    
    inline def setStartDecoratorFunction1(
      value: SwitchOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "startDecorator", js.Any.fromFunction1(value))
    
    inline def setStartDecoratorUndefined: Self = StObject.set(x, "startDecorator", js.undefined)
    
    inline def setThumb(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SwitchOwnerState]): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    
    inline def setThumbFunction1(
      value: SwitchOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "thumb", js.Any.fromFunction1(value))
    
    inline def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
    
    inline def setTrack(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, SwitchOwnerState]): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackFunction1(
      value: SwitchOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "track", js.Any.fromFunction1(value))
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
  }
}
