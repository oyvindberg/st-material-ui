package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/BottomNavigation/bottomNavigationClasses.BottomNavigationClasses> */
trait PartialBottomNavigationClasses extends StObject {
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialBottomNavigationClasses {
  
  inline def apply(): PartialBottomNavigationClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBottomNavigationClasses]
  }
  
  extension [Self <: PartialBottomNavigationClasses](x: Self) {
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
