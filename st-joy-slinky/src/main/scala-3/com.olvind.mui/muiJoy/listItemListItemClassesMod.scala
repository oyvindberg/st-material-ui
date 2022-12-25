package com.olvind.mui.muiJoy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemListItemClassesMod {
  
  @JSImport("@mui/joy/ListItem/listItemClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/ListItem/listItemClasses", JSImport.Default)
  @js.native
  val default: ListItemClasses = js.native
  
  inline def getListItemUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListItemUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type ListItemClassKey = "root" | "startAction" | "endAction" | "nested" | "nesting" | "sticky" | "colorPrimary" | "colorNeutral" | "colorDanger" | "colorInfo" | "colorSuccess" | "colorWarning" | "variantPlain" | "variantSoft" | "variantOutlined" | "variantSolid"
  
  trait ListItemClasses extends StObject {
    
    /** Styles applied to the root element if `color="danger"`. */
    var colorDanger: String
    
    /** Styles applied to the root element if `color="info"`. */
    var colorInfo: String
    
    /** Styles applied to the root element if `color="neutral"`. */
    var colorNeutral: String
    
    /** Styles applied to the root element if `color="primary"`. */
    var colorPrimary: String
    
    /** Styles applied to the root element if `color="success"`. */
    var colorSuccess: String
    
    /** Styles applied to the root element if `color="warning"`. */
    var colorWarning: String
    
    /** Styles applied to the component element if `endAction` element is provided. */
    var endAction: String
    
    /** Styles applied to the root element, if nested={true}. */
    var nested: String
    
    /** Styles applied to the root element, if it is under a nested list item. */
    var nesting: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the component element if `startAction` element is provided. */
    var startAction: String
    
    /** Styles applied to the root element, if sticky={true}. */
    var sticky: String
    
    /** State class applied to the root element if `variant="outlined"`. */
    var variantOutlined: String
    
    /** State class applied to the root element if `variant="plain"`. */
    var variantPlain: String
    
    /** State class applied to the root element if `variant="soft"`. */
    var variantSoft: String
    
    /** State class applied to the root element if `variant="solid"`. */
    var variantSolid: String
  }
  object ListItemClasses {
    
    inline def apply(
      colorDanger: String,
      colorInfo: String,
      colorNeutral: String,
      colorPrimary: String,
      colorSuccess: String,
      colorWarning: String,
      endAction: String,
      nested: String,
      nesting: String,
      root: String,
      startAction: String,
      sticky: String,
      variantOutlined: String,
      variantPlain: String,
      variantSoft: String,
      variantSolid: String
    ): ListItemClasses = {
      val __obj = js.Dynamic.literal(colorDanger = colorDanger.asInstanceOf[js.Any], colorInfo = colorInfo.asInstanceOf[js.Any], colorNeutral = colorNeutral.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorSuccess = colorSuccess.asInstanceOf[js.Any], colorWarning = colorWarning.asInstanceOf[js.Any], endAction = endAction.asInstanceOf[js.Any], nested = nested.asInstanceOf[js.Any], nesting = nesting.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], startAction = startAction.asInstanceOf[js.Any], sticky = sticky.asInstanceOf[js.Any], variantOutlined = variantOutlined.asInstanceOf[js.Any], variantPlain = variantPlain.asInstanceOf[js.Any], variantSoft = variantSoft.asInstanceOf[js.Any], variantSolid = variantSolid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListItemClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemClasses] (val x: Self) extends AnyVal {
      
      inline def setColorDanger(value: String): Self = StObject.set(x, "colorDanger", value.asInstanceOf[js.Any])
      
      inline def setColorInfo(value: String): Self = StObject.set(x, "colorInfo", value.asInstanceOf[js.Any])
      
      inline def setColorNeutral(value: String): Self = StObject.set(x, "colorNeutral", value.asInstanceOf[js.Any])
      
      inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      inline def setColorSuccess(value: String): Self = StObject.set(x, "colorSuccess", value.asInstanceOf[js.Any])
      
      inline def setColorWarning(value: String): Self = StObject.set(x, "colorWarning", value.asInstanceOf[js.Any])
      
      inline def setEndAction(value: String): Self = StObject.set(x, "endAction", value.asInstanceOf[js.Any])
      
      inline def setNested(value: String): Self = StObject.set(x, "nested", value.asInstanceOf[js.Any])
      
      inline def setNesting(value: String): Self = StObject.set(x, "nesting", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setStartAction(value: String): Self = StObject.set(x, "startAction", value.asInstanceOf[js.Any])
      
      inline def setSticky(value: String): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
      
      inline def setVariantOutlined(value: String): Self = StObject.set(x, "variantOutlined", value.asInstanceOf[js.Any])
      
      inline def setVariantPlain(value: String): Self = StObject.set(x, "variantPlain", value.asInstanceOf[js.Any])
      
      inline def setVariantSoft(value: String): Self = StObject.set(x, "variantSoft", value.asInstanceOf[js.Any])
      
      inline def setVariantSolid(value: String): Self = StObject.set(x, "variantSolid", value.asInstanceOf[js.Any])
    }
  }
}
