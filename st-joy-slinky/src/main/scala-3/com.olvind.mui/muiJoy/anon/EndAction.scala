package com.olvind.mui.muiJoy.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'li', {}, @mui/joy.@mui/joy/ListItem/ListItemProps.ListItemOwnerState>,   startAction :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/ListItem/ListItemProps.ListItemOwnerState>,   endAction :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/ListItem/ListItemProps.ListItemOwnerState>} ]:? react.react.ElementType<any>} */
trait EndAction extends StObject {
  
  var endAction: js.UndefOr[ReactElement] = js.undefined
  
  var root: js.UndefOr[ReactElement] = js.undefined
  
  var startAction: js.UndefOr[ReactElement] = js.undefined
}
object EndAction {
  
  inline def apply(): EndAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndAction] (val x: Self) extends AnyVal {
    
    inline def setEndAction(value: ReactElement): Self = StObject.set(x, "endAction", value.asInstanceOf[js.Any])
    
    inline def setEndActionUndefined: Self = StObject.set(x, "endAction", js.undefined)
    
    inline def setRoot(value: ReactElement): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setStartAction(value: ReactElement): Self = StObject.set(x, "startAction", value.asInstanceOf[js.Any])
    
    inline def setStartActionUndefined: Self = StObject.set(x, "startAction", js.undefined)
  }
}
