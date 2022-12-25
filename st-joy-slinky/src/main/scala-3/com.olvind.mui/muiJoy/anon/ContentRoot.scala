package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.aspectRatioAspectRatioPropsMod.AspectRatioOwnerState
import com.olvind.mui.muiJoy.utilsTypesMod.SlotCommonProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/AspectRatio/AspectRatioProps.AspectRatioOwnerState>,   content :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/AspectRatio/AspectRatioProps.AspectRatioOwnerState>} ]:? {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/AspectRatio/AspectRatioProps.AspectRatioOwnerState>,   content :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/AspectRatio/AspectRatioProps.AspectRatioOwnerState>}[P]} */
trait ContentRoot extends StObject {
  
  var content: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, AspectRatioOwnerState]
  ] = js.undefined
  
  var root: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, AspectRatioOwnerState]
  ] = js.undefined
}
object ContentRoot {
  
  inline def apply(): ContentRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentRoot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentRoot] (val x: Self) extends AnyVal {
    
    inline def setContent(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, AspectRatioOwnerState]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentFunction1(
      value: AspectRatioOwnerState => (Omit[ComponentPropsWithRef["div"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setRoot(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, AspectRatioOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: AspectRatioOwnerState => (Omit[ComponentPropsWithRef["div"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
