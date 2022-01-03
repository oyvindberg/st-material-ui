package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/List/listClasses.ListClasses> */
trait PartialListClasses extends StObject {
  
  var dense: js.UndefOr[String] = js.undefined
  
  var padding: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
  
  var subheader: js.UndefOr[String] = js.undefined
}
object PartialListClasses {
  
  inline def apply(): PartialListClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListClasses]
  }
  
  extension [Self <: PartialListClasses](x: Self) {
    
    inline def setDense(value: String): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
    
    inline def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
    
    inline def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSubheader(value: String): Self = StObject.set(x, "subheader", value.asInstanceOf[js.Any])
    
    inline def setSubheaderUndefined: Self = StObject.set(x, "subheader", js.undefined)
  }
}
