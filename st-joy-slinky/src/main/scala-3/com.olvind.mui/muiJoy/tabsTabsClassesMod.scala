package com.olvind.mui.muiJoy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsTabsClassesMod {
  
  @JSImport("@mui/joy/Tabs/tabsClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/Tabs/tabsClasses", JSImport.Default)
  @js.native
  val default: TabsClasses = js.native
  
  inline def getTabsUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTabsUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type TabsClassKey = "root" | "horizontal" | "vertical" | "colorPrimary" | "colorNeutral" | "colorDanger" | "colorInfo" | "colorSuccess" | "colorWarning" | "variantPlain" | "variantOutlined" | "variantSoft" | "variantSolid" | "sizeSm" | "sizeMd" | "sizeLg"
  
  trait TabsClasses extends StObject {
    
    /** Classname applied to the root element if `color="danger"`. */
    var colorDanger: String
    
    /** Classname applied to the root element if `color="info"`. */
    var colorInfo: String
    
    /** Classname applied to the root element if `color="neutral"`. */
    var colorNeutral: String
    
    /** Classname applied to the root element if `color="primary"`. */
    var colorPrimary: String
    
    /** Classname applied to the root element if `color="success"`. */
    var colorSuccess: String
    
    /** Classname applied to the root element if `color="warning"`. */
    var colorWarning: String
    
    /** Classname applied to the root element if `orientation="horizontal"`. */
    var horizontal: String
    
    /** Classname applied to the root element. */
    var root: String
    
    /** Classname applied to the root element if `size="lg"`. */
    var sizeLg: String
    
    /** Classname applied to the root element if `size="md"`. */
    var sizeMd: String
    
    /** Classname applied to the root element if `size="sm"`. */
    var sizeSm: String
    
    /** Classname applied to the root element if `variant="outlined"`. */
    var variantOutlined: String
    
    /** Classname applied to the root element if `variant="plain"`. */
    var variantPlain: String
    
    /** Classname applied to the root element if `variant="soft"`. */
    var variantSoft: String
    
    /** Classname applied to the root element if `variant="solid"`. */
    var variantSolid: String
    
    /** Classname applied to the root element if `orientation="vertical"`. */
    var vertical: String
  }
  object TabsClasses {
    
    inline def apply(
      colorDanger: String,
      colorInfo: String,
      colorNeutral: String,
      colorPrimary: String,
      colorSuccess: String,
      colorWarning: String,
      horizontal: String,
      root: String,
      sizeLg: String,
      sizeMd: String,
      sizeSm: String,
      variantOutlined: String,
      variantPlain: String,
      variantSoft: String,
      variantSolid: String,
      vertical: String
    ): TabsClasses = {
      val __obj = js.Dynamic.literal(colorDanger = colorDanger.asInstanceOf[js.Any], colorInfo = colorInfo.asInstanceOf[js.Any], colorNeutral = colorNeutral.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorSuccess = colorSuccess.asInstanceOf[js.Any], colorWarning = colorWarning.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], sizeLg = sizeLg.asInstanceOf[js.Any], sizeMd = sizeMd.asInstanceOf[js.Any], sizeSm = sizeSm.asInstanceOf[js.Any], variantOutlined = variantOutlined.asInstanceOf[js.Any], variantPlain = variantPlain.asInstanceOf[js.Any], variantSoft = variantSoft.asInstanceOf[js.Any], variantSolid = variantSolid.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabsClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabsClasses] (val x: Self) extends AnyVal {
      
      inline def setColorDanger(value: String): Self = StObject.set(x, "colorDanger", value.asInstanceOf[js.Any])
      
      inline def setColorInfo(value: String): Self = StObject.set(x, "colorInfo", value.asInstanceOf[js.Any])
      
      inline def setColorNeutral(value: String): Self = StObject.set(x, "colorNeutral", value.asInstanceOf[js.Any])
      
      inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      inline def setColorSuccess(value: String): Self = StObject.set(x, "colorSuccess", value.asInstanceOf[js.Any])
      
      inline def setColorWarning(value: String): Self = StObject.set(x, "colorWarning", value.asInstanceOf[js.Any])
      
      inline def setHorizontal(value: String): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSizeLg(value: String): Self = StObject.set(x, "sizeLg", value.asInstanceOf[js.Any])
      
      inline def setSizeMd(value: String): Self = StObject.set(x, "sizeMd", value.asInstanceOf[js.Any])
      
      inline def setSizeSm(value: String): Self = StObject.set(x, "sizeSm", value.asInstanceOf[js.Any])
      
      inline def setVariantOutlined(value: String): Self = StObject.set(x, "variantOutlined", value.asInstanceOf[js.Any])
      
      inline def setVariantPlain(value: String): Self = StObject.set(x, "variantPlain", value.asInstanceOf[js.Any])
      
      inline def setVariantSoft(value: String): Self = StObject.set(x, "variantSoft", value.asInstanceOf[js.Any])
      
      inline def setVariantSolid(value: String): Self = StObject.set(x, "variantSolid", value.asInstanceOf[js.Any])
      
      inline def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
}
