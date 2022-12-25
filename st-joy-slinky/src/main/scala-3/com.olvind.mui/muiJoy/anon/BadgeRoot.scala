package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.badgeBadgePropsMod.BadgeOwnerState
import com.olvind.mui.muiJoy.utilsTypesMod.SlotCommonProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/Badge/BadgeProps.BadgeOwnerState>,   badge :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/Badge/BadgeProps.BadgeOwnerState>} ]:? {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/Badge/BadgeProps.BadgeOwnerState>,   badge :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/Badge/BadgeProps.BadgeOwnerState>}[P]} */
trait BadgeRoot extends StObject {
  
  var badge: js.UndefOr[com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, BadgeOwnerState]] = js.undefined
  
  var root: js.UndefOr[com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, BadgeOwnerState]] = js.undefined
}
object BadgeRoot {
  
  inline def apply(): BadgeRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BadgeRoot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BadgeRoot] (val x: Self) extends AnyVal {
    
    inline def setBadge(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, BadgeOwnerState]): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeFunction1(
      value: BadgeOwnerState => (Omit[ComponentPropsWithRef["div"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "badge", js.Any.fromFunction1(value))
    
    inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    inline def setRoot(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, BadgeOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: BadgeOwnerState => (Omit[ComponentPropsWithRef["div"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
