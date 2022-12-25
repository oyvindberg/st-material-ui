package com.olvind.mui.muiJoy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxCheckboxClassesMod {
  
  @JSImport("@mui/joy/Checkbox/checkboxClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/Checkbox/checkboxClasses", JSImport.Default)
  @js.native
  val default: CheckboxClasses = js.native
  
  inline def getCheckboxUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCheckboxUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type CheckboxClassKey = "root" | "checkbox" | "action" | "input" | "label" | "checked" | "disabled" | "focusVisible" | "indeterminate" | "colorPrimary" | "colorDanger" | "colorInfo" | "colorNeutral" | "colorSuccess" | "colorWarning" | "sizeSm" | "sizeMd" | "sizeLg" | "variantOutlined" | "variantSoft" | "variantSolid"
  
  trait CheckboxClasses extends StObject {
    
    /** Styles applied to the action element. */
    var action: String
    
    /** Styles applied to the checkbox element. */
    var checkbox: String
    
    /** State class applied to the input component's `checked` class. */
    var checked: String
    
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
    
    /** State class applied to the input component's disabled class. */
    var disabled: String
    
    /** Class applied to the root element if the switch has visible focus */
    var focusVisible: String
    
    /** State class applied to the root element if `indeterminate={true}`. */
    var indeterminate: String
    
    /** Styles applied to the input element. */
    var input: String
    
    /** Styles applied to the label element. */
    var label: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the root element if `size="lg"`. */
    var sizeLg: String
    
    /** Styles applied to the root element if `size="md"`. */
    var sizeMd: String
    
    /** Styles applied to the root element if `size="sm"`. */
    var sizeSm: String
    
    /** Styles applied to the root element if `variant="outlined"`. */
    var variantOutlined: String
    
    /** Styles applied to the root element if `variant="soft"`. */
    var variantSoft: String
    
    /** Styles applied to the root element if `variant="solid"`. */
    var variantSolid: String
  }
  object CheckboxClasses {
    
    inline def apply(
      action: String,
      checkbox: String,
      checked: String,
      colorDanger: String,
      colorInfo: String,
      colorNeutral: String,
      colorPrimary: String,
      colorSuccess: String,
      colorWarning: String,
      disabled: String,
      focusVisible: String,
      indeterminate: String,
      input: String,
      label: String,
      root: String,
      sizeLg: String,
      sizeMd: String,
      sizeSm: String,
      variantOutlined: String,
      variantSoft: String,
      variantSolid: String
    ): CheckboxClasses = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], checkbox = checkbox.asInstanceOf[js.Any], checked = checked.asInstanceOf[js.Any], colorDanger = colorDanger.asInstanceOf[js.Any], colorInfo = colorInfo.asInstanceOf[js.Any], colorNeutral = colorNeutral.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorSuccess = colorSuccess.asInstanceOf[js.Any], colorWarning = colorWarning.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any], indeterminate = indeterminate.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], sizeLg = sizeLg.asInstanceOf[js.Any], sizeMd = sizeMd.asInstanceOf[js.Any], sizeSm = sizeSm.asInstanceOf[js.Any], variantOutlined = variantOutlined.asInstanceOf[js.Any], variantSoft = variantSoft.asInstanceOf[js.Any], variantSolid = variantSolid.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckboxClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CheckboxClasses] (val x: Self) extends AnyVal {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setCheckbox(value: String): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
      
      inline def setChecked(value: String): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setColorDanger(value: String): Self = StObject.set(x, "colorDanger", value.asInstanceOf[js.Any])
      
      inline def setColorInfo(value: String): Self = StObject.set(x, "colorInfo", value.asInstanceOf[js.Any])
      
      inline def setColorNeutral(value: String): Self = StObject.set(x, "colorNeutral", value.asInstanceOf[js.Any])
      
      inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      inline def setColorSuccess(value: String): Self = StObject.set(x, "colorSuccess", value.asInstanceOf[js.Any])
      
      inline def setColorWarning(value: String): Self = StObject.set(x, "colorWarning", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setFocusVisible(value: String): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setIndeterminate(value: String): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
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
