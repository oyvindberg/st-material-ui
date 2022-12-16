package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.badgeUnstyledBadgeUnstyledDottypesMod.BadgeUnstyledComponentsPropsOverrides
import com.olvind.mui.muiBase.badgeUnstyledBadgeUnstyledDottypesMod.BadgeUnstyledOwnerState
import com.olvind.mui.muiBase.utilsTypesMod.SlotComponentProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Badge extends StObject {
  
  var badge: js.UndefOr[
    SlotComponentProps["span", BadgeUnstyledComponentsPropsOverrides, BadgeUnstyledOwnerState]
  ] = js.undefined
  
  var root: js.UndefOr[
    SlotComponentProps["span", BadgeUnstyledComponentsPropsOverrides, BadgeUnstyledOwnerState]
  ] = js.undefined
}
object Badge {
  
  inline def apply(): Badge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Badge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Badge] (val x: Self) extends AnyVal {
    
    inline def setBadge(value: SlotComponentProps["span", BadgeUnstyledComponentsPropsOverrides, BadgeUnstyledOwnerState]): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeFunction1(
      value: BadgeUnstyledOwnerState => Partial[ComponentPropsWithRef["span"]] & BadgeUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "badge", js.Any.fromFunction1(value))
    
    inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    inline def setRoot(value: SlotComponentProps["span", BadgeUnstyledComponentsPropsOverrides, BadgeUnstyledOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: BadgeUnstyledOwnerState => Partial[ComponentPropsWithRef["span"]] & BadgeUnstyledComponentsPropsOverrides
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
