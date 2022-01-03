package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/Checkbox/checkboxClasses.CheckboxClasses> */
@js.native
trait PartialCheckboxClasses extends StObject {
  
  var checked: js.UndefOr[String] = js.native
  
  var colorPrimary: js.UndefOr[String] = js.native
  
  var colorSecondary: js.UndefOr[String] = js.native
  
  var disabled: js.UndefOr[String] = js.native
  
  var indeterminate: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
}
object PartialCheckboxClasses {
  
  @scala.inline
  def apply(): PartialCheckboxClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCheckboxClasses]
  }
  
  @scala.inline
  implicit class PartialCheckboxClassesMutableBuilder[Self <: PartialCheckboxClasses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: String): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    @scala.inline
    def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorPrimaryUndefined: Self = StObject.set(x, "colorPrimary", js.undefined)
    
    @scala.inline
    def setColorSecondary(value: String): Self = StObject.set(x, "colorSecondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorSecondaryUndefined: Self = StObject.set(x, "colorSecondary", js.undefined)
    
    @scala.inline
    def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setIndeterminate(value: String): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
