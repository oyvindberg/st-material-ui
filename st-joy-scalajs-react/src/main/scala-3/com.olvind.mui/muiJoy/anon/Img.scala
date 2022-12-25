package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.avatarAvatarPropsMod.AvatarOwnerState
import com.olvind.mui.muiJoy.utilsTypesMod.SlotCommonProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/Avatar/AvatarProps.AvatarOwnerState>,   img :@mui/joy.@mui/joy/utils/types.SlotProps<'img', {}, @mui/joy.@mui/joy/Avatar/AvatarProps.AvatarOwnerState>,   fallback :@mui/joy.@mui/joy/utils/types.SlotProps<'svg', {}, @mui/joy.@mui/joy/Avatar/AvatarProps.AvatarOwnerState>} ]:? {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/Avatar/AvatarProps.AvatarOwnerState>,   img :@mui/joy.@mui/joy/utils/types.SlotProps<'img', {}, @mui/joy.@mui/joy/Avatar/AvatarProps.AvatarOwnerState>,   fallback :@mui/joy.@mui/joy/utils/types.SlotProps<'svg', {}, @mui/joy.@mui/joy/Avatar/AvatarProps.AvatarOwnerState>}[P]} */
trait Img extends StObject {
  
  var fallback: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["svg", js.Object, AvatarOwnerState]
  ] = js.undefined
  
  var img: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["img", js.Object, AvatarOwnerState]
  ] = js.undefined
  
  var root: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, AvatarOwnerState]
  ] = js.undefined
}
object Img {
  
  inline def apply(): Img = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Img]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Img] (val x: Self) extends AnyVal {
    
    inline def setFallback(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["svg", js.Object, AvatarOwnerState]): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setFallbackFunction1(
      value: AvatarOwnerState => (Omit[ComponentPropsWithRef["svg"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "fallback", js.Any.fromFunction1(value))
    
    inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    inline def setImg(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["img", js.Object, AvatarOwnerState]): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
    
    inline def setImgFunction1(
      value: AvatarOwnerState => (Omit[ComponentPropsWithRef["img"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "img", js.Any.fromFunction1(value))
    
    inline def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
    
    inline def setRoot(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, AvatarOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: AvatarOwnerState => (Omit[ComponentPropsWithRef["div"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
