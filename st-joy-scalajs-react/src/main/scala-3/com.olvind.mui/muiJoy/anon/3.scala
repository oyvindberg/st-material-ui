package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.typographyTypographyPropsMod.TypographyOwnerState
import com.olvind.mui.muiJoy.utilsTypesMod.SlotCommonProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'a', {}, @mui/joy.@mui/joy/Typography/TypographyProps.TypographyOwnerState>,   startDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Typography/TypographyProps.TypographyOwnerState>,   endDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Typography/TypographyProps.TypographyOwnerState>} ]:? {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'a', {}, @mui/joy.@mui/joy/Typography/TypographyProps.TypographyOwnerState>,   startDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Typography/TypographyProps.TypographyOwnerState>,   endDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Typography/TypographyProps.TypographyOwnerState>}[P]} */
trait `3` extends StObject {
  
  var endDecorator: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, TypographyOwnerState]
  ] = js.undefined
  
  var root: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["a", js.Object, TypographyOwnerState]
  ] = js.undefined
  
  var startDecorator: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, TypographyOwnerState]
  ] = js.undefined
}
object `3` {
  
  inline def apply(): `3` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `3`] (val x: Self) extends AnyVal {
    
    inline def setEndDecorator(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, TypographyOwnerState]): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
    
    inline def setEndDecoratorFunction1(
      value: TypographyOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "endDecorator", js.Any.fromFunction1(value))
    
    inline def setEndDecoratorUndefined: Self = StObject.set(x, "endDecorator", js.undefined)
    
    inline def setRoot(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["a", js.Object, TypographyOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: TypographyOwnerState => (Omit[ComponentPropsWithRef["a"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setStartDecorator(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, TypographyOwnerState]): Self = StObject.set(x, "startDecorator", value.asInstanceOf[js.Any])
    
    inline def setStartDecoratorFunction1(
      value: TypographyOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "startDecorator", js.Any.fromFunction1(value))
    
    inline def setStartDecoratorUndefined: Self = StObject.set(x, "startDecorator", js.undefined)
  }
}
