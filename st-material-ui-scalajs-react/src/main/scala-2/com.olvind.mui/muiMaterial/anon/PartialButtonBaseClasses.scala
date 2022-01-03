package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/ButtonBase/buttonBaseClasses.ButtonBaseClasses> */
@js.native
trait PartialButtonBaseClasses extends StObject {
  
  var disabled: js.UndefOr[String] = js.native
  
  var focusVisible: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
}
object PartialButtonBaseClasses {
  
  @scala.inline
  def apply(): PartialButtonBaseClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialButtonBaseClasses]
  }
  
  @scala.inline
  implicit class PartialButtonBaseClassesMutableBuilder[Self <: PartialButtonBaseClasses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setFocusVisible(value: String): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusVisibleUndefined: Self = StObject.set(x, "focusVisible", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
