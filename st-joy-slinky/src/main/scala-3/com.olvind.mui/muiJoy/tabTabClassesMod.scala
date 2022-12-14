package com.olvind.mui.muiJoy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabTabClassesMod {
  
  @JSImport("@mui/joy/Tab/tabClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/Tab/tabClasses", JSImport.Default)
  @js.native
  val default: TabClasses = js.native
  
  inline def getTabUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTabUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type TabClassKey = "root" | "disabled" | "focusVisible" | "selected" | "horizontal" | "vertical" | "colorPrimary" | "colorNeutral" | "colorDanger" | "colorInfo" | "colorSuccess" | "colorWarning" | "colorContext" | "variantPlain" | "variantOutlined" | "variantSoft" | "variantSolid"
  
  trait TabClasses extends StObject {
    
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
    
    /** Classname applied to the root element if `disabled={true}`. */
    var disabled: String
    
    /** Classname applied to the root element when its focus is visible. */
    var focusVisible: String
    
    /** Classname applied to the root element if `orientation="horizontal"`. */
    var horizontal: String
    
    /** Classname applied to the root element. */
    var root: String
    
    /** Classname applied to the root element when it is selected. */
    var selected: String
    
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
  object TabClasses {
    
    inline def apply(
      colorContext: String,
      colorDanger: String,
      colorInfo: String,
      colorNeutral: String,
      colorPrimary: String,
      colorSuccess: String,
      colorWarning: String,
      disabled: String,
      focusVisible: String,
      horizontal: String,
      root: String,
      selected: String,
      variantOutlined: String,
      variantPlain: String,
      variantSoft: String,
      variantSolid: String,
      vertical: String
    ): TabClasses = {
      val __obj = js.Dynamic.literal(colorContext = colorContext.asInstanceOf[js.Any], colorDanger = colorDanger.asInstanceOf[js.Any], colorInfo = colorInfo.asInstanceOf[js.Any], colorNeutral = colorNeutral.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorSuccess = colorSuccess.asInstanceOf[js.Any], colorWarning = colorWarning.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], variantOutlined = variantOutlined.asInstanceOf[js.Any], variantPlain = variantPlain.asInstanceOf[js.Any], variantSoft = variantSoft.asInstanceOf[js.Any], variantSolid = variantSolid.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabClasses] (val x: Self) extends AnyVal {
      
      inline def setColorContext(value: String): Self = StObject.set(x, "colorContext", value.asInstanceOf[js.Any])
      
      inline def setColorDanger(value: String): Self = StObject.set(x, "colorDanger", value.asInstanceOf[js.Any])
      
      inline def setColorInfo(value: String): Self = StObject.set(x, "colorInfo", value.asInstanceOf[js.Any])
      
      inline def setColorNeutral(value: String): Self = StObject.set(x, "colorNeutral", value.asInstanceOf[js.Any])
      
      inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      inline def setColorSuccess(value: String): Self = StObject.set(x, "colorSuccess", value.asInstanceOf[js.Any])
      
      inline def setColorWarning(value: String): Self = StObject.set(x, "colorWarning", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setFocusVisible(value: String): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setHorizontal(value: String): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setVariantOutlined(value: String): Self = StObject.set(x, "variantOutlined", value.asInstanceOf[js.Any])
      
      inline def setVariantPlain(value: String): Self = StObject.set(x, "variantPlain", value.asInstanceOf[js.Any])
      
      inline def setVariantSoft(value: String): Self = StObject.set(x, "variantSoft", value.asInstanceOf[js.Any])
      
      inline def setVariantSolid(value: String): Self = StObject.set(x, "variantSolid", value.asInstanceOf[js.Any])
      
      inline def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
}
