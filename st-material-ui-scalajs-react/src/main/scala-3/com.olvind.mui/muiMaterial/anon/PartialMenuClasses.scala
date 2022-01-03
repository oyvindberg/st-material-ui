package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/Menu/menuClasses.MenuClasses> */
trait PartialMenuClasses extends StObject {
  
  var list: js.UndefOr[String] = js.undefined
  
  var paper: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialMenuClasses {
  
  inline def apply(): PartialMenuClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMenuClasses]
  }
  
  extension [Self <: PartialMenuClasses](x: Self) {
    
    inline def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    inline def setPaper(value: String): Self = StObject.set(x, "paper", value.asInstanceOf[js.Any])
    
    inline def setPaperUndefined: Self = StObject.set(x, "paper", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
