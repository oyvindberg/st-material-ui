package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.badgeUnstyledPropsMod.BadgeUnstyledComponentsPropsOverrides
import com.olvind.mui.react.mod.HTMLAttributes
import org.scalajs.dom.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BadgeRoot extends StObject {
  
  var badge: js.UndefOr[HTMLAttributes[HTMLSpanElement] & BadgeUnstyledComponentsPropsOverrides] = js.undefined
  
  var root: js.UndefOr[HTMLAttributes[HTMLSpanElement] & BadgeUnstyledComponentsPropsOverrides] = js.undefined
}
object BadgeRoot {
  
  inline def apply(): BadgeRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BadgeRoot]
  }
  
  extension [Self <: BadgeRoot](x: Self) {
    
    inline def setBadge(value: HTMLAttributes[HTMLSpanElement] & BadgeUnstyledComponentsPropsOverrides): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    inline def setRoot(value: HTMLAttributes[HTMLSpanElement] & BadgeUnstyledComponentsPropsOverrides): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
