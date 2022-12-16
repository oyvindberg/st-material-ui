package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxCheckboxClassesMod {
  
  @JSImport("@mui/material/Checkbox/checkboxClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Checkbox/checkboxClasses", JSImport.Default)
  @js.native
  val default: CheckboxClasses = js.native
  
  inline def getCheckboxUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCheckboxUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type CheckboxClassKey = "root" | "checked" | "disabled" | "indeterminate" | "colorPrimary" | "colorSecondary"
  
  trait CheckboxClasses extends StObject {
    
    /** State class applied to the root element if `checked={true}`. */
    var checked: String
    
    /** Styles applied to the root element if `color="primary"`. */
    var colorPrimary: String
    
    /** Styles applied to the root element if `color="secondary"`. */
    var colorSecondary: String
    
    /** State class applied to the root element if `disabled={true}`. */
    var disabled: String
    
    /** State class applied to the root element if `indeterminate={true}`. */
    var indeterminate: String
    
    /** Styles applied to the root element. */
    var root: String
  }
  object CheckboxClasses {
    
    inline def apply(
      checked: String,
      colorPrimary: String,
      colorSecondary: String,
      disabled: String,
      indeterminate: String,
      root: String
    ): CheckboxClasses = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorSecondary = colorSecondary.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], indeterminate = indeterminate.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckboxClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CheckboxClasses] (val x: Self) extends AnyVal {
      
      inline def setChecked(value: String): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      inline def setColorSecondary(value: String): Self = StObject.set(x, "colorSecondary", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setIndeterminate(value: String): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
