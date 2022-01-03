package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.badgeUnstyledPropsMod.BadgeOrigin
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BadgeContent extends StObject {
  
  var anchorOrigin: BadgeOrigin = js.native
  
  var badgeContent: ReactElement = js.native
  
  var displayValue: ReactElement = js.native
  
  var invisible: js.UndefOr[Boolean] = js.native
  
  var max: Double = js.native
  
  var variant: String = js.native
}
object BadgeContent {
  
  @scala.inline
  def apply(
    anchorOrigin: BadgeOrigin,
    badgeContent: ReactElement,
    displayValue: ReactElement,
    max: Double,
    variant: String
  ): BadgeContent = {
    val __obj = js.Dynamic.literal(anchorOrigin = anchorOrigin.asInstanceOf[js.Any], badgeContent = badgeContent.asInstanceOf[js.Any], displayValue = displayValue.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeContent]
  }
  
  @scala.inline
  implicit class BadgeContentMutableBuilder[Self <: BadgeContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchorOrigin(value: BadgeOrigin): Self = StObject.set(x, "anchorOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeContent(value: ReactElement): Self = StObject.set(x, "badgeContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayValue(value: ReactElement): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvisible(value: Boolean): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
  }
}
