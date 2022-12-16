package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/Toolbar/toolbarClasses.ToolbarClasses> */
trait PartialToolbarClasses extends StObject {
  
  var dense: js.UndefOr[String] = js.undefined
  
  var gutters: js.UndefOr[String] = js.undefined
  
  var regular: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialToolbarClasses {
  
  inline def apply(): PartialToolbarClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialToolbarClasses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialToolbarClasses] (val x: Self) extends AnyVal {
    
    inline def setDense(value: String): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
    
    inline def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
    
    inline def setGutters(value: String): Self = StObject.set(x, "gutters", value.asInstanceOf[js.Any])
    
    inline def setGuttersUndefined: Self = StObject.set(x, "gutters", js.undefined)
    
    inline def setRegular(value: String): Self = StObject.set(x, "regular", value.asInstanceOf[js.Any])
    
    inline def setRegularUndefined: Self = StObject.set(x, "regular", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
