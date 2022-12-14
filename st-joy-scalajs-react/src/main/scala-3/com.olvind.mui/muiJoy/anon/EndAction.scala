package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.listItemListItemPropsMod.ListItemOwnerState
import com.olvind.mui.muiJoy.utilsTypesMod.SlotCommonProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'li', {}, @mui/joy.@mui/joy/ListItem/ListItemProps.ListItemOwnerState>,   startAction :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/ListItem/ListItemProps.ListItemOwnerState>,   endAction :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/ListItem/ListItemProps.ListItemOwnerState>} ]:? {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'li', {}, @mui/joy.@mui/joy/ListItem/ListItemProps.ListItemOwnerState>,   startAction :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/ListItem/ListItemProps.ListItemOwnerState>,   endAction :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/ListItem/ListItemProps.ListItemOwnerState>}[P]} */
trait EndAction extends StObject {
  
  var endAction: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, ListItemOwnerState]
  ] = js.undefined
  
  var root: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["li", js.Object, ListItemOwnerState]
  ] = js.undefined
  
  var startAction: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, ListItemOwnerState]
  ] = js.undefined
}
object EndAction {
  
  inline def apply(): EndAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndAction] (val x: Self) extends AnyVal {
    
    inline def setEndAction(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, ListItemOwnerState]): Self = StObject.set(x, "endAction", value.asInstanceOf[js.Any])
    
    inline def setEndActionFunction1(
      value: ListItemOwnerState => (Omit[ComponentPropsWithRef["div"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "endAction", js.Any.fromFunction1(value))
    
    inline def setEndActionUndefined: Self = StObject.set(x, "endAction", js.undefined)
    
    inline def setRoot(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["li", js.Object, ListItemOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: ListItemOwnerState => (Omit[ComponentPropsWithRef["li"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setStartAction(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, ListItemOwnerState]): Self = StObject.set(x, "startAction", value.asInstanceOf[js.Any])
    
    inline def setStartActionFunction1(
      value: ListItemOwnerState => (Omit[ComponentPropsWithRef["div"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "startAction", js.Any.fromFunction1(value))
    
    inline def setStartActionUndefined: Self = StObject.set(x, "startAction", js.undefined)
  }
}
