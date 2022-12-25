package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.badgeBadgePropsMod.BadgeOwnerState
import com.olvind.mui.muiJoy.utilsTypesMod.SlotCommonProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BadgeSlotProps extends StObject {
  
  var badge: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, BadgeOwnerState]
  
  var root: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, BadgeOwnerState]
}
object BadgeSlotProps {
  
  inline def apply(
    badge: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, BadgeOwnerState],
    root: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, BadgeOwnerState]
  ): BadgeSlotProps = {
    val __obj = js.Dynamic.literal(badge = badge.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeSlotProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BadgeSlotProps] (val x: Self) extends AnyVal {
    
    inline def setBadge(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, BadgeOwnerState]): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeFunction1(
      value: BadgeOwnerState => (Omit[ComponentPropsWithRef["div"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "badge", js.Any.fromFunction1(value))
    
    inline def setRoot(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, BadgeOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: BadgeOwnerState => (Omit[ComponentPropsWithRef["div"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
  }
}
