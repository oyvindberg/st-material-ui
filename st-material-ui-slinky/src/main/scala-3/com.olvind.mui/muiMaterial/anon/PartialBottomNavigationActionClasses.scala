package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/BottomNavigationAction/bottomNavigationActionClasses.BottomNavigationActionClasses> */
trait PartialBottomNavigationActionClasses extends StObject {
  
  var iconOnly: js.UndefOr[String] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
  
  var selected: js.UndefOr[String] = js.undefined
}
object PartialBottomNavigationActionClasses {
  
  inline def apply(): PartialBottomNavigationActionClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBottomNavigationActionClasses]
  }
  
  extension [Self <: PartialBottomNavigationActionClasses](x: Self) {
    
    inline def setIconOnly(value: String): Self = StObject.set(x, "iconOnly", value.asInstanceOf[js.Any])
    
    inline def setIconOnlyUndefined: Self = StObject.set(x, "iconOnly", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
