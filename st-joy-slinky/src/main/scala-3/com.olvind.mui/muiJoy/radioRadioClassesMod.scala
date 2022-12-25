package com.olvind.mui.muiJoy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioRadioClassesMod {
  
  @JSImport("@mui/joy/Radio/radioClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/Radio/radioClasses", JSImport.Default)
  @js.native
  val default: RadioClasses = js.native
  
  inline def getRadioUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRadioUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type RadioClassKey = "root" | "radio" | "icon" | "action" | "input" | "label" | "checked" | "disabled" | "focusVisible" | "colorPrimary" | "colorDanger" | "colorInfo" | "colorNeutral" | "colorSuccess" | "colorWarning" | "sizeSm" | "sizeMd" | "sizeLg" | "variantOutlined" | "variantSoft" | "variantSolid"
  
  trait RadioClasses extends StObject {
    
    /** Class name applied to the action element. */
    var action: String
    
    /** State class applied to the root, action slots if `checked`. */
    var checked: String
    
    /** Class name applied to the root element if `color="danger"`. */
    var colorDanger: String
    
    /** Class name applied to the root element if `color="info"`. */
    var colorInfo: String
    
    /** Class name applied to the root element if `color="neutral"`. */
    var colorNeutral: String
    
    /** Class name applied to the root element if `color="primary"`. */
    var colorPrimary: String
    
    /** Class name applied to the root element if `color="success"`. */
    var colorSuccess: String
    
    /** Class name applied to the root element if `color="warning"`. */
    var colorWarning: String
    
    /** State class applied to the root, action slots if `disabled`. */
    var disabled: String
    
    /** Class applied to the root element if the switch has visible focus */
    var focusVisible: String
    
    /** Class name applied to the icon element. */
    var icon: String
    
    /** Class name applied to the input element. */
    var input: String
    
    /** Class name applied to the label element. */
    var label: String
    
    /** Class name applied to the radio element. */
    var radio: String
    
    /** Class name applied to the root element. */
    var root: String
    
    /** Class name applied to the root element if `size="lg"`. */
    var sizeLg: String
    
    /** Class name applied to the root element if `size="md"`. */
    var sizeMd: String
    
    /** Class name applied to the root element if `size="sm"`. */
    var sizeSm: String
    
    /** Class name applied to the root element if `variant="outlined"`. */
    var variantOutlined: String
    
    /** Class name applied to the root element if `variant="soft"`. */
    var variantSoft: String
    
    /** Class name applied to the root element if `variant="solid"`. */
    var variantSolid: String
  }
  object RadioClasses {
    
    inline def apply(
      action: String,
      checked: String,
      colorDanger: String,
      colorInfo: String,
      colorNeutral: String,
      colorPrimary: String,
      colorSuccess: String,
      colorWarning: String,
      disabled: String,
      focusVisible: String,
      icon: String,
      input: String,
      label: String,
      radio: String,
      root: String,
      sizeLg: String,
      sizeMd: String,
      sizeSm: String,
      variantOutlined: String,
      variantSoft: String,
      variantSolid: String
    ): RadioClasses = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], checked = checked.asInstanceOf[js.Any], colorDanger = colorDanger.asInstanceOf[js.Any], colorInfo = colorInfo.asInstanceOf[js.Any], colorNeutral = colorNeutral.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorSuccess = colorSuccess.asInstanceOf[js.Any], colorWarning = colorWarning.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], radio = radio.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], sizeLg = sizeLg.asInstanceOf[js.Any], sizeMd = sizeMd.asInstanceOf[js.Any], sizeSm = sizeSm.asInstanceOf[js.Any], variantOutlined = variantOutlined.asInstanceOf[js.Any], variantSoft = variantSoft.asInstanceOf[js.Any], variantSolid = variantSolid.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RadioClasses] (val x: Self) extends AnyVal {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setChecked(value: String): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setColorDanger(value: String): Self = StObject.set(x, "colorDanger", value.asInstanceOf[js.Any])
      
      inline def setColorInfo(value: String): Self = StObject.set(x, "colorInfo", value.asInstanceOf[js.Any])
      
      inline def setColorNeutral(value: String): Self = StObject.set(x, "colorNeutral", value.asInstanceOf[js.Any])
      
      inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      inline def setColorSuccess(value: String): Self = StObject.set(x, "colorSuccess", value.asInstanceOf[js.Any])
      
      inline def setColorWarning(value: String): Self = StObject.set(x, "colorWarning", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setFocusVisible(value: String): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setRadio(value: String): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSizeLg(value: String): Self = StObject.set(x, "sizeLg", value.asInstanceOf[js.Any])
      
      inline def setSizeMd(value: String): Self = StObject.set(x, "sizeMd", value.asInstanceOf[js.Any])
      
      inline def setSizeSm(value: String): Self = StObject.set(x, "sizeSm", value.asInstanceOf[js.Any])
      
      inline def setVariantOutlined(value: String): Self = StObject.set(x, "variantOutlined", value.asInstanceOf[js.Any])
      
      inline def setVariantSoft(value: String): Self = StObject.set(x, "variantSoft", value.asInstanceOf[js.Any])
      
      inline def setVariantSolid(value: String): Self = StObject.set(x, "variantSolid", value.asInstanceOf[js.Any])
    }
  }
}
