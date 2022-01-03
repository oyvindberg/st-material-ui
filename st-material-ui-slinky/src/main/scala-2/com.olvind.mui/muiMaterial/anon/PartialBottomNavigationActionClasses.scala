package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/BottomNavigationAction/bottomNavigationActionClasses.BottomNavigationActionClasses> */
@js.native
trait PartialBottomNavigationActionClasses extends StObject {
  
  var iconOnly: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
  
  var selected: js.UndefOr[String] = js.native
}
object PartialBottomNavigationActionClasses {
  
  @scala.inline
  def apply(): PartialBottomNavigationActionClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBottomNavigationActionClasses]
  }
  
  @scala.inline
  implicit class PartialBottomNavigationActionClassesMutableBuilder[Self <: PartialBottomNavigationActionClasses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconOnly(value: String): Self = StObject.set(x, "iconOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconOnlyUndefined: Self = StObject.set(x, "iconOnly", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
