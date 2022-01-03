package com.olvind.mui.muiBase

import com.olvind.mui.muiBase.badgeUnstyledPropsMod.BadgeOrigin
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useBadgeMod {
  
  @js.native
  trait UseBadgeProps extends StObject {
    
    var anchorOrigin: js.UndefOr[BadgeOrigin] = js.native
    
    var badgeContent: js.UndefOr[ReactElement] = js.native
    
    var invisible: js.UndefOr[Boolean] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var showZero: js.UndefOr[Boolean] = js.native
    
    var variant: js.UndefOr[String] = js.native
  }
  object UseBadgeProps {
    
    @scala.inline
    def apply(): UseBadgeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseBadgeProps]
    }
    
    @scala.inline
    implicit class UseBadgePropsMutableBuilder[Self <: UseBadgeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchorOrigin(value: BadgeOrigin): Self = StObject.set(x, "anchorOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorOriginUndefined: Self = StObject.set(x, "anchorOrigin", js.undefined)
      
      @scala.inline
      def setBadgeContent(value: ReactElement): Self = StObject.set(x, "badgeContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeContentUndefined: Self = StObject.set(x, "badgeContent", js.undefined)
      
      @scala.inline
      def setInvisible(value: Boolean): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setShowZero(value: Boolean): Self = StObject.set(x, "showZero", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowZeroUndefined: Self = StObject.set(x, "showZero", js.undefined)
      
      @scala.inline
      def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
}
