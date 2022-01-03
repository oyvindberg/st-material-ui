package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.badgeUnstyledPropsMod.BadgeUnstyledComponentsPropsOverrides
import com.olvind.mui.react.mod.HTMLAttributes
import org.scalajs.dom.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BadgeRoot extends StObject {
  
  var badge: js.UndefOr[HTMLAttributes[HTMLSpanElement] with BadgeUnstyledComponentsPropsOverrides] = js.native
  
  var root: js.UndefOr[HTMLAttributes[HTMLSpanElement] with BadgeUnstyledComponentsPropsOverrides] = js.native
}
object BadgeRoot {
  
  @scala.inline
  def apply(): BadgeRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BadgeRoot]
  }
  
  @scala.inline
  implicit class BadgeRootMutableBuilder[Self <: BadgeRoot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBadge(value: HTMLAttributes[HTMLSpanElement] with BadgeUnstyledComponentsPropsOverrides): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    @scala.inline
    def setRoot(value: HTMLAttributes[HTMLSpanElement] with BadgeUnstyledComponentsPropsOverrides): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
