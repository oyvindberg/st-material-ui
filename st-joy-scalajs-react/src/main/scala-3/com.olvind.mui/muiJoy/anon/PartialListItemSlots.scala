package com.olvind.mui.muiJoy.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/joy.@mui/joy/ListItem/ListItemProps.ListItemSlots> */
trait PartialListItemSlots extends StObject {
  
  var endAction: js.UndefOr[ElementType] = js.undefined
  
  var root: js.UndefOr[ElementType] = js.undefined
  
  var startAction: js.UndefOr[ElementType] = js.undefined
}
object PartialListItemSlots {
  
  inline def apply(): PartialListItemSlots = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListItemSlots]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialListItemSlots] (val x: Self) extends AnyVal {
    
    inline def setEndAction(value: ElementType): Self = StObject.set(x, "endAction", value.asInstanceOf[js.Any])
    
    inline def setEndActionUndefined: Self = StObject.set(x, "endAction", js.undefined)
    
    inline def setRoot(value: ElementType): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setStartAction(value: ElementType): Self = StObject.set(x, "startAction", value.asInstanceOf[js.Any])
    
    inline def setStartActionUndefined: Self = StObject.set(x, "startAction", js.undefined)
  }
}
