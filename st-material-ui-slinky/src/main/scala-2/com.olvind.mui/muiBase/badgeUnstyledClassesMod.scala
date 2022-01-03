package com.olvind.mui.muiBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeUnstyledClassesMod {
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiBase.muiBaseStrings.root
    - `com.olvind.mui`.muiBase.muiBaseStrings.badge
    - `com.olvind.mui`.muiBase.muiBaseStrings.dot
    - `com.olvind.mui`.muiBase.muiBaseStrings.standard
    - `com.olvind.mui`.muiBase.muiBaseStrings.anchorOriginTopRight
    - `com.olvind.mui`.muiBase.muiBaseStrings.anchorOriginBottomRight
    - `com.olvind.mui`.muiBase.muiBaseStrings.anchorOriginTopLeft
    - `com.olvind.mui`.muiBase.muiBaseStrings.anchorOriginBottomLeft
    - `com.olvind.mui`.muiBase.muiBaseStrings.invisible
  */
  trait BadgeUnstyledClassKey extends StObject
  
  @js.native
  trait BadgeUnstyledClasses extends StObject {
    
    /** Class name applied to the badge `span` element if `anchorOrigin={{ 'bottom', 'left' }}`. */
    var anchorOriginBottomLeft: String = js.native
    
    /** Class name applied to the badge `span` element if `anchorOrigin={{ 'bottom', 'right' }}`. */
    var anchorOriginBottomRight: String = js.native
    
    /** Class name applied to the badge `span` element if `anchorOrigin={{ 'top', 'left' }}`. */
    var anchorOriginTopLeft: String = js.native
    
    /** Class name applied to the badge `span` element if `anchorOrigin={{ 'top', 'right' }}`. */
    var anchorOriginTopRight: String = js.native
    
    /** Class name applied to the badge `span` element. */
    var badge: String = js.native
    
    /** Class name applied to the badge `span` element if `variant="dot"`. */
    var dot: String = js.native
    
    /** State class applied to the badge `span` element if `invisible={true}`. */
    var invisible: String = js.native
    
    /** Class name applied to the root element. */
    var root: String = js.native
    
    /** Class name applied to the badge `span` element if `variant="standard"`. */
    var standard: String = js.native
  }
  object BadgeUnstyledClasses {
    
    @scala.inline
    def apply(
      anchorOriginBottomLeft: String,
      anchorOriginBottomRight: String,
      anchorOriginTopLeft: String,
      anchorOriginTopRight: String,
      badge: String,
      dot: String,
      invisible: String,
      root: String,
      standard: String
    ): BadgeUnstyledClasses = {
      val __obj = js.Dynamic.literal(anchorOriginBottomLeft = anchorOriginBottomLeft.asInstanceOf[js.Any], anchorOriginBottomRight = anchorOriginBottomRight.asInstanceOf[js.Any], anchorOriginTopLeft = anchorOriginTopLeft.asInstanceOf[js.Any], anchorOriginTopRight = anchorOriginTopRight.asInstanceOf[js.Any], badge = badge.asInstanceOf[js.Any], dot = dot.asInstanceOf[js.Any], invisible = invisible.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
      __obj.asInstanceOf[BadgeUnstyledClasses]
    }
    
    @scala.inline
    implicit class BadgeUnstyledClassesMutableBuilder[Self <: BadgeUnstyledClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchorOriginBottomLeft(value: String): Self = StObject.set(x, "anchorOriginBottomLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorOriginBottomRight(value: String): Self = StObject.set(x, "anchorOriginBottomRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorOriginTopLeft(value: String): Self = StObject.set(x, "anchorOriginTopLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorOriginTopRight(value: String): Self = StObject.set(x, "anchorOriginTopRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadge(value: String): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDot(value: String): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvisible(value: String): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStandard(value: String): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    }
  }
}
