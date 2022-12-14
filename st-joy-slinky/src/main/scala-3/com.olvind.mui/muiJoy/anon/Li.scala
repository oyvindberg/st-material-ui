package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.breadcrumbsBreadcrumbsPropsMod.BreadcrumbsOwnerState
import com.olvind.mui.muiJoy.utilsTypesMod.SlotCommonProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'nav', {}, @mui/joy.@mui/joy/Breadcrumbs/BreadcrumbsProps.BreadcrumbsOwnerState>,   ol :@mui/joy.@mui/joy/utils/types.SlotProps<'ol', {}, @mui/joy.@mui/joy/Breadcrumbs/BreadcrumbsProps.BreadcrumbsOwnerState>,   li :@mui/joy.@mui/joy/utils/types.SlotProps<'li', {}, @mui/joy.@mui/joy/Breadcrumbs/BreadcrumbsProps.BreadcrumbsOwnerState>,   separator :@mui/joy.@mui/joy/utils/types.SlotProps<'li', {}, @mui/joy.@mui/joy/Breadcrumbs/BreadcrumbsProps.BreadcrumbsOwnerState>} ]:? {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'nav', {}, @mui/joy.@mui/joy/Breadcrumbs/BreadcrumbsProps.BreadcrumbsOwnerState>,   ol :@mui/joy.@mui/joy/utils/types.SlotProps<'ol', {}, @mui/joy.@mui/joy/Breadcrumbs/BreadcrumbsProps.BreadcrumbsOwnerState>,   li :@mui/joy.@mui/joy/utils/types.SlotProps<'li', {}, @mui/joy.@mui/joy/Breadcrumbs/BreadcrumbsProps.BreadcrumbsOwnerState>,   separator :@mui/joy.@mui/joy/utils/types.SlotProps<'li', {}, @mui/joy.@mui/joy/Breadcrumbs/BreadcrumbsProps.BreadcrumbsOwnerState>}[P]} */
trait Li extends StObject {
  
  var li: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["li", js.Object, BreadcrumbsOwnerState]
  ] = js.undefined
  
  var ol: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["ol", js.Object, BreadcrumbsOwnerState]
  ] = js.undefined
  
  var root: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["nav", js.Object, BreadcrumbsOwnerState]
  ] = js.undefined
  
  var separator: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["li", js.Object, BreadcrumbsOwnerState]
  ] = js.undefined
}
object Li {
  
  inline def apply(): Li = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Li]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Li] (val x: Self) extends AnyVal {
    
    inline def setLi(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["li", js.Object, BreadcrumbsOwnerState]): Self = StObject.set(x, "li", value.asInstanceOf[js.Any])
    
    inline def setLiFunction1(
      value: BreadcrumbsOwnerState => (Omit[ComponentPropsWithRef["li"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "li", js.Any.fromFunction1(value))
    
    inline def setLiUndefined: Self = StObject.set(x, "li", js.undefined)
    
    inline def setOl(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["ol", js.Object, BreadcrumbsOwnerState]): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
    
    inline def setOlFunction1(
      value: BreadcrumbsOwnerState => (Omit[ComponentPropsWithRef["ol"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "ol", js.Any.fromFunction1(value))
    
    inline def setOlUndefined: Self = StObject.set(x, "ol", js.undefined)
    
    inline def setRoot(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["nav", js.Object, BreadcrumbsOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: BreadcrumbsOwnerState => (Omit[ComponentPropsWithRef["nav"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSeparator(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["li", js.Object, BreadcrumbsOwnerState]): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorFunction1(
      value: BreadcrumbsOwnerState => (Omit[ComponentPropsWithRef["li"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "separator", js.Any.fromFunction1(value))
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
  }
}
