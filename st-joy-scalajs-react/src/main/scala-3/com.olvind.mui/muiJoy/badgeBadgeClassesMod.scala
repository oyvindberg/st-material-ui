package com.olvind.mui.muiJoy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeBadgeClassesMod {
  
  @JSImport("@mui/joy/Badge/badgeClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/Badge/badgeClasses", JSImport.Default)
  @js.native
  val default: BadgeClasses = js.native
  
  inline def getBadgeUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBadgeUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type BadgeClassKey = "root" | "badge" | "anchorOriginTopRight" | "anchorOriginBottomRight" | "anchorOriginTopLeft" | "anchorOriginBottomLeft" | "colorPrimary" | "colorDanger" | "colorInfo" | "colorNeutral" | "colorSuccess" | "colorWarning" | "invisible" | "locationInside" | "locationOutside" | "sizeSm" | "sizeMd" | "sizeLg" | "variantPlain" | "variantOutlined" | "variantSoft" | "variantSolid"
  
  trait BadgeClasses extends StObject {
    
    /** Class name applied to the badge `span` element if `anchorOrigin={{ 'bottom', 'left' }}`. */
    var anchorOriginBottomLeft: String
    
    /** Class name applied to the badge `span` element if `anchorOrigin={{ 'bottom', 'right' }}`. */
    var anchorOriginBottomRight: String
    
    /** Class name applied to the badge `span` element if `anchorOrigin={{ 'top', 'left' }}`. */
    var anchorOriginTopLeft: String
    
    /** Class name applied to the badge `span` element if `anchorOrigin={{ 'top', 'right' }}`. */
    var anchorOriginTopRight: String
    
    /** Class name applied to the badge `span` element. */
    var badge: String
    
    /** Styles applied to the badge `span` element if `color="danger"`. */
    var colorDanger: String
    
    /** Styles applied to the badge `span` element if `color="info"`. */
    var colorInfo: String
    
    /** Styles applied to the badge `span` element if `color="neutral"`. */
    var colorNeutral: String
    
    /** Styles applied to the badge `span` element if `color="primary"`. */
    var colorPrimary: String
    
    /** Styles applied to the badge `span` element if `color="success"`. */
    var colorSuccess: String
    
    /** Styles applied to the badge `span` element if `color="warning"`. */
    var colorWarning: String
    
    /** State class applied to the badge `span` element if `invisible={true}`. */
    var invisible: String
    
    /** State class applied to the badge `span` element if `location="inside"`. */
    var locationInside: String
    
    /** State class applied to the badge `span` element if `location="outside"`. */
    var locationOutside: String
    
    /** Class name applied to the root element. */
    var root: String
    
    /** Styles applied to the badge `span` element if `size="lg"`. */
    var sizeLg: String
    
    /** Styles applied to the badge `span` element if `size="md"`. */
    var sizeMd: String
    
    /** Styles applied to the badge `span` element if `size="sm"`. */
    var sizeSm: String
    
    /** Styles applied to the badge `span` element if `variant="outlined"`. */
    var variantOutlined: String
    
    /** Styles applied to the root element if `variant="plain"`. */
    var variantPlain: String
    
    /** Styles applied to the badge `span` element if `variant="soft"`. */
    var variantSoft: String
    
    /** Styles applied to the badge `span` element if `variant="solid"`. */
    var variantSolid: String
  }
  object BadgeClasses {
    
    inline def apply(
      anchorOriginBottomLeft: String,
      anchorOriginBottomRight: String,
      anchorOriginTopLeft: String,
      anchorOriginTopRight: String,
      badge: String,
      colorDanger: String,
      colorInfo: String,
      colorNeutral: String,
      colorPrimary: String,
      colorSuccess: String,
      colorWarning: String,
      invisible: String,
      locationInside: String,
      locationOutside: String,
      root: String,
      sizeLg: String,
      sizeMd: String,
      sizeSm: String,
      variantOutlined: String,
      variantPlain: String,
      variantSoft: String,
      variantSolid: String
    ): BadgeClasses = {
      val __obj = js.Dynamic.literal(anchorOriginBottomLeft = anchorOriginBottomLeft.asInstanceOf[js.Any], anchorOriginBottomRight = anchorOriginBottomRight.asInstanceOf[js.Any], anchorOriginTopLeft = anchorOriginTopLeft.asInstanceOf[js.Any], anchorOriginTopRight = anchorOriginTopRight.asInstanceOf[js.Any], badge = badge.asInstanceOf[js.Any], colorDanger = colorDanger.asInstanceOf[js.Any], colorInfo = colorInfo.asInstanceOf[js.Any], colorNeutral = colorNeutral.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorSuccess = colorSuccess.asInstanceOf[js.Any], colorWarning = colorWarning.asInstanceOf[js.Any], invisible = invisible.asInstanceOf[js.Any], locationInside = locationInside.asInstanceOf[js.Any], locationOutside = locationOutside.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], sizeLg = sizeLg.asInstanceOf[js.Any], sizeMd = sizeMd.asInstanceOf[js.Any], sizeSm = sizeSm.asInstanceOf[js.Any], variantOutlined = variantOutlined.asInstanceOf[js.Any], variantPlain = variantPlain.asInstanceOf[js.Any], variantSoft = variantSoft.asInstanceOf[js.Any], variantSolid = variantSolid.asInstanceOf[js.Any])
      __obj.asInstanceOf[BadgeClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BadgeClasses] (val x: Self) extends AnyVal {
      
      inline def setAnchorOriginBottomLeft(value: String): Self = StObject.set(x, "anchorOriginBottomLeft", value.asInstanceOf[js.Any])
      
      inline def setAnchorOriginBottomRight(value: String): Self = StObject.set(x, "anchorOriginBottomRight", value.asInstanceOf[js.Any])
      
      inline def setAnchorOriginTopLeft(value: String): Self = StObject.set(x, "anchorOriginTopLeft", value.asInstanceOf[js.Any])
      
      inline def setAnchorOriginTopRight(value: String): Self = StObject.set(x, "anchorOriginTopRight", value.asInstanceOf[js.Any])
      
      inline def setBadge(value: String): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      inline def setColorDanger(value: String): Self = StObject.set(x, "colorDanger", value.asInstanceOf[js.Any])
      
      inline def setColorInfo(value: String): Self = StObject.set(x, "colorInfo", value.asInstanceOf[js.Any])
      
      inline def setColorNeutral(value: String): Self = StObject.set(x, "colorNeutral", value.asInstanceOf[js.Any])
      
      inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      inline def setColorSuccess(value: String): Self = StObject.set(x, "colorSuccess", value.asInstanceOf[js.Any])
      
      inline def setColorWarning(value: String): Self = StObject.set(x, "colorWarning", value.asInstanceOf[js.Any])
      
      inline def setInvisible(value: String): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
      
      inline def setLocationInside(value: String): Self = StObject.set(x, "locationInside", value.asInstanceOf[js.Any])
      
      inline def setLocationOutside(value: String): Self = StObject.set(x, "locationOutside", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSizeLg(value: String): Self = StObject.set(x, "sizeLg", value.asInstanceOf[js.Any])
      
      inline def setSizeMd(value: String): Self = StObject.set(x, "sizeMd", value.asInstanceOf[js.Any])
      
      inline def setSizeSm(value: String): Self = StObject.set(x, "sizeSm", value.asInstanceOf[js.Any])
      
      inline def setVariantOutlined(value: String): Self = StObject.set(x, "variantOutlined", value.asInstanceOf[js.Any])
      
      inline def setVariantPlain(value: String): Self = StObject.set(x, "variantPlain", value.asInstanceOf[js.Any])
      
      inline def setVariantSoft(value: String): Self = StObject.set(x, "variantSoft", value.asInstanceOf[js.Any])
      
      inline def setVariantSolid(value: String): Self = StObject.set(x, "variantSolid", value.asInstanceOf[js.Any])
    }
  }
}
