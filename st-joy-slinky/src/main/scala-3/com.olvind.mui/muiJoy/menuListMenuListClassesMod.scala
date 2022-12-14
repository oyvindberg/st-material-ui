package com.olvind.mui.muiJoy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuListMenuListClassesMod {
  
  @JSImport("@mui/joy/MenuList/menuListClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/MenuList/menuListClasses", JSImport.Default)
  @js.native
  val default: MenuListClasses = js.native
  
  inline def getMenuListUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMenuListUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type MenuListClassKey = "root" | "sizeSm" | "sizeMd" | "sizeLg" | "colorPrimary" | "colorNeutral" | "colorDanger" | "colorInfo" | "colorSuccess" | "colorWarning" | "colorContext" | "variantPlain" | "variantOutlined" | "variantSoft" | "variantSolid"
  
  trait MenuListClasses extends StObject {
    
    /** Styles applied to the root element when color inversion is triggered. */
    var colorContext: String
    
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
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the root element if `size="lg"`. */
    var sizeLg: String
    
    /** Styles applied to the root element if `size="md"`. */
    var sizeMd: String
    
    /** Styles applied to the root element if `size="sm"`. */
    var sizeSm: String
    
    /** Classname applied to the root element if `variant="outlined"`. */
    var variantOutlined: String
    
    /** Classname applied to the root element if `variant="plain"`. */
    var variantPlain: String
    
    /** Classname applied to the root element if `variant="soft"`. */
    var variantSoft: String
    
    /** Classname applied to the root element if `variant="solid"`. */
    var variantSolid: String
  }
  object MenuListClasses {
    
    inline def apply(
      colorContext: String,
      colorDanger: String,
      colorInfo: String,
      colorNeutral: String,
      colorPrimary: String,
      colorSuccess: String,
      colorWarning: String,
      root: String,
      sizeLg: String,
      sizeMd: String,
      sizeSm: String,
      variantOutlined: String,
      variantPlain: String,
      variantSoft: String,
      variantSolid: String
    ): MenuListClasses = {
      val __obj = js.Dynamic.literal(colorContext = colorContext.asInstanceOf[js.Any], colorDanger = colorDanger.asInstanceOf[js.Any], colorInfo = colorInfo.asInstanceOf[js.Any], colorNeutral = colorNeutral.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorSuccess = colorSuccess.asInstanceOf[js.Any], colorWarning = colorWarning.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], sizeLg = sizeLg.asInstanceOf[js.Any], sizeMd = sizeMd.asInstanceOf[js.Any], sizeSm = sizeSm.asInstanceOf[js.Any], variantOutlined = variantOutlined.asInstanceOf[js.Any], variantPlain = variantPlain.asInstanceOf[js.Any], variantSoft = variantSoft.asInstanceOf[js.Any], variantSolid = variantSolid.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuListClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuListClasses] (val x: Self) extends AnyVal {
      
      inline def setColorContext(value: String): Self = StObject.set(x, "colorContext", value.asInstanceOf[js.Any])
      
      inline def setColorDanger(value: String): Self = StObject.set(x, "colorDanger", value.asInstanceOf[js.Any])
      
      inline def setColorInfo(value: String): Self = StObject.set(x, "colorInfo", value.asInstanceOf[js.Any])
      
      inline def setColorNeutral(value: String): Self = StObject.set(x, "colorNeutral", value.asInstanceOf[js.Any])
      
      inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      inline def setColorSuccess(value: String): Self = StObject.set(x, "colorSuccess", value.asInstanceOf[js.Any])
      
      inline def setColorWarning(value: String): Self = StObject.set(x, "colorWarning", value.asInstanceOf[js.Any])
      
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
