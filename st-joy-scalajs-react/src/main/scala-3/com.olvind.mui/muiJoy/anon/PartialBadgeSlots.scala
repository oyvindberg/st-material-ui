package com.olvind.mui.muiJoy.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/joy.@mui/joy/Badge/BadgeProps.BadgeSlots> */
trait PartialBadgeSlots extends StObject {
  
  var badge: js.UndefOr[ElementType] = js.undefined
  
  var root: js.UndefOr[ElementType] = js.undefined
}
object PartialBadgeSlots {
  
  inline def apply(): PartialBadgeSlots = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBadgeSlots]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialBadgeSlots] (val x: Self) extends AnyVal {
    
    inline def setBadge(value: ElementType): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    inline def setRoot(value: ElementType): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
