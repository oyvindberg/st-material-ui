package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/Checkbox/checkboxClasses.CheckboxClasses> */
trait PartialCheckboxClasses extends StObject {
  
  var checked: js.UndefOr[String] = js.undefined
  
  var colorPrimary: js.UndefOr[String] = js.undefined
  
  var colorSecondary: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[String] = js.undefined
  
  var indeterminate: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialCheckboxClasses {
  
  inline def apply(): PartialCheckboxClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCheckboxClasses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialCheckboxClasses] (val x: Self) extends AnyVal {
    
    inline def setChecked(value: String): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
    
    inline def setColorPrimaryUndefined: Self = StObject.set(x, "colorPrimary", js.undefined)
    
    inline def setColorSecondary(value: String): Self = StObject.set(x, "colorSecondary", value.asInstanceOf[js.Any])
    
    inline def setColorSecondaryUndefined: Self = StObject.set(x, "colorSecondary", js.undefined)
    
    inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setIndeterminate(value: String): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
    
    inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
