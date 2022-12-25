package com.olvind.mui.muiJoy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionOptionClassesMod {
  
  @JSImport("@mui/joy/Option/optionClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/Option/optionClasses", JSImport.Default)
  @js.native
  val default: OptionClasses = js.native
  
  inline def getOptionUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptionUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type OptionClassKey = "root" | "colorPrimary" | "colorNeutral" | "colorDanger" | "colorInfo" | "colorSuccess" | "colorWarning" | "colorContext" | "disabled" | "selected" | "highlighted" | "variantPlain" | "variantSoft" | "variantOutlined" | "variantSolid"
  
  trait OptionClasses extends StObject {
    
    /** Styles applied to the root element if `color="context"`. */
    var colorContext: String
    
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
    
    /** State class applied to the root element if `disabled={true}`. */
    var disabled: String
    
    /** State class applied to the root element if the option is highlighted. */
    var highlighted: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** State class applied to the root element if the option is selected. */
    var selected: String
    
    /** State class applied to the root element if `variant="outlined"`. */
    var variantOutlined: String
    
    /** State class applied to the root element if `variant="plain"`. */
    var variantPlain: String
    
    /** State class applied to the root element if `variant="soft"`. */
    var variantSoft: String
    
    /** State class applied to the root element if `variant="solid"`. */
    var variantSolid: String
  }
  object OptionClasses {
    
    inline def apply(
      colorContext: String,
      colorDanger: String,
      colorInfo: String,
      colorNeutral: String,
      colorPrimary: String,
      colorSuccess: String,
      colorWarning: String,
      disabled: String,
      highlighted: String,
      root: String,
      selected: String,
      variantOutlined: String,
      variantPlain: String,
      variantSoft: String,
      variantSolid: String
    ): OptionClasses = {
      val __obj = js.Dynamic.literal(colorContext = colorContext.asInstanceOf[js.Any], colorDanger = colorDanger.asInstanceOf[js.Any], colorInfo = colorInfo.asInstanceOf[js.Any], colorNeutral = colorNeutral.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorSuccess = colorSuccess.asInstanceOf[js.Any], colorWarning = colorWarning.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], highlighted = highlighted.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], variantOutlined = variantOutlined.asInstanceOf[js.Any], variantPlain = variantPlain.asInstanceOf[js.Any], variantSoft = variantSoft.asInstanceOf[js.Any], variantSolid = variantSolid.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionClasses] (val x: Self) extends AnyVal {
      
      inline def setColorContext(value: String): Self = StObject.set(x, "colorContext", value.asInstanceOf[js.Any])
      
      inline def setColorDanger(value: String): Self = StObject.set(x, "colorDanger", value.asInstanceOf[js.Any])
      
      inline def setColorInfo(value: String): Self = StObject.set(x, "colorInfo", value.asInstanceOf[js.Any])
      
      inline def setColorNeutral(value: String): Self = StObject.set(x, "colorNeutral", value.asInstanceOf[js.Any])
      
      inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      inline def setColorSuccess(value: String): Self = StObject.set(x, "colorSuccess", value.asInstanceOf[js.Any])
      
      inline def setColorWarning(value: String): Self = StObject.set(x, "colorWarning", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setHighlighted(value: String): Self = StObject.set(x, "highlighted", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setVariantOutlined(value: String): Self = StObject.set(x, "variantOutlined", value.asInstanceOf[js.Any])
      
      inline def setVariantPlain(value: String): Self = StObject.set(x, "variantPlain", value.asInstanceOf[js.Any])
      
      inline def setVariantSoft(value: String): Self = StObject.set(x, "variantSoft", value.asInstanceOf[js.Any])
      
      inline def setVariantSolid(value: String): Self = StObject.set(x, "variantSolid", value.asInstanceOf[js.Any])
    }
  }
}
