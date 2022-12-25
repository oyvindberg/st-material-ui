package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.listItemListItemPropsMod.ListItemOwnerState
import com.olvind.mui.muiJoy.utilsTypesMod.SlotCommonProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndActionRoot extends StObject {
  
  var endAction: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, ListItemOwnerState]
  
  var root: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["li", js.Object, ListItemOwnerState]
  
  var startAction: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, ListItemOwnerState]
}
object EndActionRoot {
  
  inline def apply(
    endAction: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, ListItemOwnerState],
    root: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["li", js.Object, ListItemOwnerState],
    startAction: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, ListItemOwnerState]
  ): EndActionRoot = {
    val __obj = js.Dynamic.literal(endAction = endAction.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], startAction = startAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndActionRoot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndActionRoot] (val x: Self) extends AnyVal {
    
    inline def setEndAction(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, ListItemOwnerState]): Self = StObject.set(x, "endAction", value.asInstanceOf[js.Any])
    
    inline def setEndActionFunction1(
      value: ListItemOwnerState => (Omit[ComponentPropsWithRef["div"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "endAction", js.Any.fromFunction1(value))
    
    inline def setRoot(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["li", js.Object, ListItemOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: ListItemOwnerState => (Omit[ComponentPropsWithRef["li"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setStartAction(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, ListItemOwnerState]): Self = StObject.set(x, "startAction", value.asInstanceOf[js.Any])
    
    inline def setStartActionFunction1(
      value: ListItemOwnerState => (Omit[ComponentPropsWithRef["div"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "startAction", js.Any.fromFunction1(value))
  }
}
