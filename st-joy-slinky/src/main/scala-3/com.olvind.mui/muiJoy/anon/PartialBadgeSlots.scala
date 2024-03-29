package com.olvind.mui.muiJoy.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/joy.@mui/joy/Badge/BadgeProps.BadgeSlots> */
trait PartialBadgeSlots extends StObject {
  
  var badge: js.UndefOr[ReactElement] = js.undefined
  
  var root: js.UndefOr[ReactElement] = js.undefined
}
object PartialBadgeSlots {
  
  inline def apply(): PartialBadgeSlots = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBadgeSlots]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialBadgeSlots] (val x: Self) extends AnyVal {
    
    inline def setBadge(value: ReactElement): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    inline def setRoot(value: ReactElement): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
