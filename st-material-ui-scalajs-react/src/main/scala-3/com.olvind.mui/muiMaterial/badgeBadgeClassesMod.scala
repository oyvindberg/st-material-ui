package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeBadgeClassesMod {
  
  @JSImport("@mui/material/Badge/badgeClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Badge/badgeClasses", JSImport.Default)
  @js.native
  val default: BadgeClasses = js.native
  
  inline def getBadgeUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBadgeUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type BadgeClassKey = "root" | "badge" | "dot" | "standard" | "anchorOriginTopRight" | "anchorOriginBottomRight" | "anchorOriginTopLeft" | "anchorOriginBottomLeft" | "invisible" | "colorPrimary" | "colorSecondary" | "colorError" | "colorInfo" | "colorSuccess" | "colorWarning" | "anchorOriginTopRightRectangular" | "anchorOriginBottomRightRectangular" | "anchorOriginTopLeftRectangular" | "anchorOriginBottomLeftRectangular" | "anchorOriginTopRightCircular" | "anchorOriginBottomRightCircular" | "anchorOriginTopLeftCircular" | "anchorOriginBottomLeftCircular" | "overlapRectangular" | "overlapCircular"
  
  trait BadgeClasses extends StObject {
    
    /** Class name applied to the badge `span` element if `anchorOrigin={{ 'bottom', 'left' }}`. */
    var anchorOriginBottomLeft: String
    
    /** Class name applied to the badge `span` element if `anchorOrigin={{ 'bottom', 'left' }} overlap="circular"`. */
    var anchorOriginBottomLeftCircular: String
    
    /** Class name applied to the badge `span` element if `anchorOrigin={{ 'bottom', 'left' }} overlap="rectangular"`. */
    var anchorOriginBottomLeftRectangular: String
    
    /** Class name applied to the badge `span` element if `anchorOrigin={{ 'bottom', 'right' }}`. */
    var anchorOriginBottomRight: String
    
    /** Class name applied to the badge `span` element if `anchorOrigin={{ 'bottom', 'right' }} overlap="circular"`. */
    var anchorOriginBottomRightCircular: String
    
    /** Class name applied to the badge `span` element if `anchorOrigin={{ 'bottom', 'right' }} overlap="rectangular"`. */
    var anchorOriginBottomRightRectangular: String
    
    /** Class name applied to the badge `span` element if `anchorOrigin={{ 'top', 'left' }}`. */
    var anchorOriginTopLeft: String
    
    /** Class name applied to the badge `span` element if `anchorOrigin={{ 'top', 'left' }} overlap="circular"`. */
    var anchorOriginTopLeftCircular: String
    
    /** Class name applied to the badge `span` element if `anchorOrigin={{ 'top', 'left' }} overlap="rectangular"`. */
    var anchorOriginTopLeftRectangular: String
    
    /** Class name applied to the badge `span` element if `anchorOrigin={{ 'top', 'right' }}`. */
    var anchorOriginTopRight: String
    
    /** Class name applied to the badge `span` element if `anchorOrigin={{ 'top', 'right' }} overlap="circular"`. */
    var anchorOriginTopRightCircular: String
    
    /** Class name applied to the badge `span` element if `anchorOrigin={{ 'top', 'right' }} overlap="rectangular"`. */
    var anchorOriginTopRightRectangular: String
    
    /** Class name applied to the badge `span` element. */
    var badge: String
    
    /** Styles applied to the badge `span` element if `color="error"`. */
    var colorError: String
    
    /** Styles applied to the badge `span` element if `color="info"`. */
    var colorInfo: String
    
    /** Styles applied to the badge `span` element if `color="primary"`. */
    var colorPrimary: String
    
    /** Styles applied to the badge `span` element if `color="secondary"`. */
    var colorSecondary: String
    
    /** Styles applied to the badge `span` element if `color="success"`. */
    var colorSuccess: String
    
    /** Styles applied to the badge `span` element if `color="warning"`. */
    var colorWarning: String
    
    /** Class name applied to the badge `span` element if `variant="dot"`. */
    var dot: String
    
    /** State class applied to the badge `span` element if `invisible={true}`. */
    var invisible: String
    
    /** Class name applied to the badge `span` element if `overlap="circular"`. */
    var overlapCircular: String
    
    /** Class name applied to the badge `span` element if `overlap="rectangular"`. */
    var overlapRectangular: String
    
    /** Class name applied to the root element. */
    var root: String
    
    /** Class name applied to the badge `span` element if `variant="standard"`. */
    var standard: String
  }
  object BadgeClasses {
    
    inline def apply(
      anchorOriginBottomLeft: String,
      anchorOriginBottomLeftCircular: String,
      anchorOriginBottomLeftRectangular: String,
      anchorOriginBottomRight: String,
      anchorOriginBottomRightCircular: String,
      anchorOriginBottomRightRectangular: String,
      anchorOriginTopLeft: String,
      anchorOriginTopLeftCircular: String,
      anchorOriginTopLeftRectangular: String,
      anchorOriginTopRight: String,
      anchorOriginTopRightCircular: String,
      anchorOriginTopRightRectangular: String,
      badge: String,
      colorError: String,
      colorInfo: String,
      colorPrimary: String,
      colorSecondary: String,
      colorSuccess: String,
      colorWarning: String,
      dot: String,
      invisible: String,
      overlapCircular: String,
      overlapRectangular: String,
      root: String,
      standard: String
    ): BadgeClasses = {
      val __obj = js.Dynamic.literal(anchorOriginBottomLeft = anchorOriginBottomLeft.asInstanceOf[js.Any], anchorOriginBottomLeftCircular = anchorOriginBottomLeftCircular.asInstanceOf[js.Any], anchorOriginBottomLeftRectangular = anchorOriginBottomLeftRectangular.asInstanceOf[js.Any], anchorOriginBottomRight = anchorOriginBottomRight.asInstanceOf[js.Any], anchorOriginBottomRightCircular = anchorOriginBottomRightCircular.asInstanceOf[js.Any], anchorOriginBottomRightRectangular = anchorOriginBottomRightRectangular.asInstanceOf[js.Any], anchorOriginTopLeft = anchorOriginTopLeft.asInstanceOf[js.Any], anchorOriginTopLeftCircular = anchorOriginTopLeftCircular.asInstanceOf[js.Any], anchorOriginTopLeftRectangular = anchorOriginTopLeftRectangular.asInstanceOf[js.Any], anchorOriginTopRight = anchorOriginTopRight.asInstanceOf[js.Any], anchorOriginTopRightCircular = anchorOriginTopRightCircular.asInstanceOf[js.Any], anchorOriginTopRightRectangular = anchorOriginTopRightRectangular.asInstanceOf[js.Any], badge = badge.asInstanceOf[js.Any], colorError = colorError.asInstanceOf[js.Any], colorInfo = colorInfo.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorSecondary = colorSecondary.asInstanceOf[js.Any], colorSuccess = colorSuccess.asInstanceOf[js.Any], colorWarning = colorWarning.asInstanceOf[js.Any], dot = dot.asInstanceOf[js.Any], invisible = invisible.asInstanceOf[js.Any], overlapCircular = overlapCircular.asInstanceOf[js.Any], overlapRectangular = overlapRectangular.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
      __obj.asInstanceOf[BadgeClasses]
    }
    
    extension [Self <: BadgeClasses](x: Self) {
      
      inline def setAnchorOriginBottomLeft(value: String): Self = StObject.set(x, "anchorOriginBottomLeft", value.asInstanceOf[js.Any])
      
      inline def setAnchorOriginBottomLeftCircular(value: String): Self = StObject.set(x, "anchorOriginBottomLeftCircular", value.asInstanceOf[js.Any])
      
      inline def setAnchorOriginBottomLeftRectangular(value: String): Self = StObject.set(x, "anchorOriginBottomLeftRectangular", value.asInstanceOf[js.Any])
      
      inline def setAnchorOriginBottomRight(value: String): Self = StObject.set(x, "anchorOriginBottomRight", value.asInstanceOf[js.Any])
      
      inline def setAnchorOriginBottomRightCircular(value: String): Self = StObject.set(x, "anchorOriginBottomRightCircular", value.asInstanceOf[js.Any])
      
      inline def setAnchorOriginBottomRightRectangular(value: String): Self = StObject.set(x, "anchorOriginBottomRightRectangular", value.asInstanceOf[js.Any])
      
      inline def setAnchorOriginTopLeft(value: String): Self = StObject.set(x, "anchorOriginTopLeft", value.asInstanceOf[js.Any])
      
      inline def setAnchorOriginTopLeftCircular(value: String): Self = StObject.set(x, "anchorOriginTopLeftCircular", value.asInstanceOf[js.Any])
      
      inline def setAnchorOriginTopLeftRectangular(value: String): Self = StObject.set(x, "anchorOriginTopLeftRectangular", value.asInstanceOf[js.Any])
      
      inline def setAnchorOriginTopRight(value: String): Self = StObject.set(x, "anchorOriginTopRight", value.asInstanceOf[js.Any])
      
      inline def setAnchorOriginTopRightCircular(value: String): Self = StObject.set(x, "anchorOriginTopRightCircular", value.asInstanceOf[js.Any])
      
      inline def setAnchorOriginTopRightRectangular(value: String): Self = StObject.set(x, "anchorOriginTopRightRectangular", value.asInstanceOf[js.Any])
      
      inline def setBadge(value: String): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      inline def setColorError(value: String): Self = StObject.set(x, "colorError", value.asInstanceOf[js.Any])
      
      inline def setColorInfo(value: String): Self = StObject.set(x, "colorInfo", value.asInstanceOf[js.Any])
      
      inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      inline def setColorSecondary(value: String): Self = StObject.set(x, "colorSecondary", value.asInstanceOf[js.Any])
      
      inline def setColorSuccess(value: String): Self = StObject.set(x, "colorSuccess", value.asInstanceOf[js.Any])
      
      inline def setColorWarning(value: String): Self = StObject.set(x, "colorWarning", value.asInstanceOf[js.Any])
      
      inline def setDot(value: String): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setInvisible(value: String): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
      
      inline def setOverlapCircular(value: String): Self = StObject.set(x, "overlapCircular", value.asInstanceOf[js.Any])
      
      inline def setOverlapRectangular(value: String): Self = StObject.set(x, "overlapRectangular", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setStandard(value: String): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    }
  }
}
