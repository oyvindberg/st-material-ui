package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.breadcrumbsBreadcrumbsPropsMod.BreadcrumbsOwnerState
import com.olvind.mui.muiJoy.utilsTypesMod.SlotCommonProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ol extends StObject {
  
  var li: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["li", js.Object, BreadcrumbsOwnerState]
  
  var ol: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["ol", js.Object, BreadcrumbsOwnerState]
  
  var root: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["nav", js.Object, BreadcrumbsOwnerState]
  
  var separator: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["li", js.Object, BreadcrumbsOwnerState]
}
object Ol {
  
  inline def apply(
    li: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["li", js.Object, BreadcrumbsOwnerState],
    ol: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["ol", js.Object, BreadcrumbsOwnerState],
    root: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["nav", js.Object, BreadcrumbsOwnerState],
    separator: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["li", js.Object, BreadcrumbsOwnerState]
  ): Ol = {
    val __obj = js.Dynamic.literal(li = li.asInstanceOf[js.Any], ol = ol.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ol]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ol] (val x: Self) extends AnyVal {
    
    inline def setLi(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["li", js.Object, BreadcrumbsOwnerState]): Self = StObject.set(x, "li", value.asInstanceOf[js.Any])
    
    inline def setLiFunction1(
      value: BreadcrumbsOwnerState => (Omit[ComponentPropsWithRef["li"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "li", js.Any.fromFunction1(value))
    
    inline def setOl(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["ol", js.Object, BreadcrumbsOwnerState]): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
    
    inline def setOlFunction1(
      value: BreadcrumbsOwnerState => (Omit[ComponentPropsWithRef["ol"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "ol", js.Any.fromFunction1(value))
    
    inline def setRoot(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["nav", js.Object, BreadcrumbsOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: BreadcrumbsOwnerState => (Omit[ComponentPropsWithRef["nav"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setSeparator(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["li", js.Object, BreadcrumbsOwnerState]): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorFunction1(
      value: BreadcrumbsOwnerState => (Omit[ComponentPropsWithRef["li"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "separator", js.Any.fromFunction1(value))
  }
}
